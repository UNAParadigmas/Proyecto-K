/*
  @author Denis Rodriguez Viquez
          Luis Vasquez Quiros
          Walter Chavez Oviedo
  @since 2017
*/

package kokoslan.kotlin.compile;

import kokoslan.kotlin.ast.*;
import kokoslan.parser.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
import java.util.stream.*;
import java.io.*;

class KoKoCompiler(val outputFile:String? = null):KoKoslanBaseVisitor<KoKoAst>(), KoKoEmiter {
	var program:KoKoAst? = null 
	var statements:MutableList<KoKoAst> = mutableListOf()
	
	fun getProgram() = PROGRAM(this.statements)
	
	fun genCode() {
		try{
			genCode(if (outputFile == null) System.out else PrintStream(outputFile))
		}
		catch (e:Exception) {
			throw RuntimeException(e.message)
		}
	}
	
	fun genCode(out:PrintStream) {
		this.statements.forEach{
			it.genCode(out)
		}
	}
	
	fun eval() = getProgram().eval()
	
	fun compile(tree:ParseTree) = visit(tree)
	
	/* Base Visitor Override Functions */

	override fun visitProgram(ctx:KoKoslanParser.ProgramContext):KoKoAst? {
		ctx.definition().map( {f -> visit(f)} )
							.forEach{ this.statements.add(it) }
		this.program = PROGRAM(this.statements)
		val expr = visit(ctx.expression())
		this.statements.add(expr)
		return this.program
	}
	
	override fun visitDefinition(ctx:KoKoslanParser.DefinitionContext):KoKoAst {
		val id = visit(ctx.id())
		val expr = visit(ctx.expression())
		return LET(id, expr)
	}

	override fun visitLambda_expr( ctx:KoKoslanParser.Lambda_exprContext) : KoKoAst{ 
		val pattern = visit(ctx.pattern())
		val expression = visit(ctx.expression())
		return LAMBDA(pattern, expression)
	}

	override fun visitAdd_expr(ctx:KoKoslanParser.Add_exprContext):KoKoAst {
   		if (ctx.add_oper() == null)
			return visit(ctx.mult_expr(0))
	
		val operators = ctx.add_oper().map{ visit(it) }
		val operands = ctx.mult_expr().map{ visit(it) }
		val r = arrayOf<KoKoAst>(operands[0])
		( 1 until operands.size ).forEach{
			r[0] = BI_OPERATION(operators[it - 1], r[0], operands[it] )
		}
		return r[0]
	}

	override fun visitAdd_oper(ctx:KoKoslanParser.Add_operContext) = OPERATOR(ctx.oper.getText())

    /*override fun visitElvisValueExpr(ctx: KoKoslanParser.ElvisValueExprContext): KoKoAst {
        return visitChildren(ctx)
    }*/
	
	override fun visitBool_expr(ctx: KoKoslanParser.Bool_exprContext) :KoKoAst {
		
		var par = (ctx.NOT() == null && ctx.NOT().size % 2 == 0)

		if(ctx.bool_oper() == null){
			if(par) return visit(ctx.value_expr(0))
			return BI_OPERATION(KoKoEmiter.AND, KoKoEmiter.FALSE, visit(ctx.value_expr(0)) )
		}
		val operators = ctx.bool_oper().map{ visit(it) }
		val operands = ctx.value_expr().map{ visit(it) }
        val r = arrayOf<KoKoAst>(operands[0])
		( 1 until operands.size ).forEach{
			r[0] = BI_OPERATION(operators[it - 1], r[0], operands[it] )
		}
		if(par) return r[0]
		return BI_OPERATION(KoKoEmiter.AND, KoKoEmiter.FALSE, r[0])
	}

	override fun visitBool_oper(ctx:KoKoslanParser.Bool_operContext) = OPERATOR(ctx.oper.getText())

	override fun visitParentValueExpr(ctx : KoKoslanParser.ParentValueExprContext) : KoKoAst {
		return visit(ctx.expression())
	}	
	
	override fun visitId(ctx:KoKoslanParser.IdContext) = ID(ctx.ID().getText())
	
	override fun visitNumber(ctx:KoKoslanParser.NumberContext) = NUM(java.lang.Double.valueOf(ctx.NUMBER().getText()))
	
	override fun visitBool(ctx:KoKoslanParser.BoolContext): KoKoAst{
		if(ctx.NOT().size % 2 == 0){
			return if(ctx.TRUE() != null) KoKoEmiter.TRUE else KoKoEmiter.FALSE
		}
		return if(ctx.TRUE() != null) KoKoEmiter.FALSE else KoKoEmiter.TRUE
	}

	override fun visitMult_oper(ctx:KoKoslanParser.Mult_operContext) = OPERATOR(ctx.oper.getText())
	
	override fun visitMult_expr(ctx:KoKoslanParser.Mult_exprContext):KoKoAst {
		if (ctx.mult_oper() == null){
			return visit(ctx.value_expr(0))
		}
		val operators = ctx.mult_oper().map{ visit(it) }
		val operands = ctx.value_expr().map{ visit(it) }
		
		if(operands[0]==null){
			return visit(ctx.value_expr(0));
			}
		else{ 
			val r = mutableListOf<KoKoAst>(operands[0])
			( 1 until operands.size ).forEach{ r[0] = BI_OPERATION(operators[it - 1], r[0], operands[it]) }
			return r[0]
		}
	}
  
	override fun visitCallValueExpr(ctx:KoKoslanParser.CallValueExprContext):KoKoAst {
		val head = visit(ctx.value_expr())
		val args = visit(ctx.call_args()) as KoKoList
		return CALL(head, args)
	}

	override fun visitPrintValue(ctx: KoKoslanParser.PrintValueContext) = PRINT(visit(ctx.expression()))
	
	override fun visitFailException(ctx: KoKoslanParser.FailExceptionContext) = FAIL()


	override fun visitCall_args(ctx:KoKoslanParser.Call_argsContext):KoKoAst {
		if (ctx.list_expr() != null){
			val args = ctx.list_expr().map{i -> visit(i)}
			return LIST(args) 
		}else 
			return LIST()
	}
  
	override fun visitList_expr(ctx:KoKoslanParser.List_exprContext):KoKoAst {
		val exprs = ctx.expression().map{ visit(it) }
        return LIST(exprs)
	}

	override fun visitListValueExpr(ctx: KoKoslanParser.ListValueExprContext):KoKoAst { 
		if(ctx.list_value().list_expr() != null)
			return visit(ctx.list_value().list_expr())
		else return visit(ctx.list_value())
	}

	override fun visitList_value(ctx: KoKoslanParser.List_valueContext):KoKoAst {
			if (ctx.list_expr() != null){
				val expressions = ctx.list_expr().expression().map({ visit(it) })
				return LISTExp(expressions) 
			}else 
				return LISTExp()
	 }

	override fun visitListFirst(ctx: KoKoslanParser.ListFirstContext):KoKoAst { 
		throw Exception("first")
	}

	override fun visitListRest(ctx: KoKoslanParser.ListRestContext):KoKoAst {
		throw Exception("rest")
	}
	
	
}