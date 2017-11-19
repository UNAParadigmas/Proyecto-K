// Generated from grammar/KoKoslan.g4 by ANTLR 4.7
package kokoslan.kotlin.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KoKoslanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NUMBER=4, STRING=5, DOT=6, BACK_SLASH=7, COMMA=8, 
		COLON=9, QUESTION_MARK=10, LEFT_PAR=11, RIGHT_PAR=12, LEFT_CURLY=13, RIGHT_CURLY=14, 
		LEFT_BRACKET=15, RIGHT_BRACKET=16, LET=17, NOT=18, EQ=19, EQS=20, NEQ=21, 
		LEQ=22, GEQ=23, LS=24, GS=25, OR=26, AND=27, TRUE=28, FALSE=29, MUL=30, 
		DIV=31, ADD=32, SUB=33, ID=34, PRINT=35, SLC=36, MLC=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "NUMBER", "INTEGER", "STRING", "DOT", "BACK_SLASH", 
		"COMMA", "COLON", "QUESTION_MARK", "LEFT_PAR", "RIGHT_PAR", "LEFT_CURLY", 
		"RIGHT_CURLY", "LEFT_BRACKET", "RIGHT_BRACKET", "LET", "NOT", "EQ", "EQS", 
		"NEQ", "LEQ", "GEQ", "LS", "GS", "OR", "AND", "TRUE", "FALSE", "MUL", 
		"DIV", "ADD", "SUB", "ID", "PRINT", "SLC", "MLC", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'print('", "'fail()'", "'|'", null, null, "'.'", "'\\'", "','", 
		"':'", "'?'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'let'", "'!'", 
		"'='", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'||'", "'&&'", "'true'", 
		"'false'", "'*'", "'/'", "'+'", "'-'", null, "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "NUMBER", "STRING", "DOT", "BACK_SLASH", "COMMA", 
		"COLON", "QUESTION_MARK", "LEFT_PAR", "RIGHT_PAR", "LEFT_CURLY", "RIGHT_CURLY", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LET", "NOT", "EQ", "EQS", "NEQ", "LEQ", 
		"GEQ", "LS", "GS", "OR", "AND", "TRUE", "FALSE", "MUL", "DIV", "ADD", 
		"SUB", "ID", "PRINT", "SLC", "MLC", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public KoKoslanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KoKoslan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\5\5c\n\5\3\5\3\5\3\5"+
		"\5\5h\n\5\3\6\6\6k\n\6\r\6\16\6l\3\7\3\7\7\7q\n\7\f\7\16\7t\13\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\7$\u00c1"+
		"\n$\f$\16$\u00c4\13$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\7&\u00d0\n&\f&\16&"+
		"\u00d3\13&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u00de\n\'\f\'\16\'\u00e1"+
		"\13\'\3\'\5\'\u00e4\n\'\3\'\3\'\3\'\3\'\3(\6(\u00eb\n(\r(\16(\u00ec\3"+
		"(\3(\4\u00d1\u00df\2)\3\3\5\4\7\5\t\6\13\2\r\7\17\b\21\t\23\n\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32"+
		"\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(\3\2\7\3\2\62;\3\2$$\4\2C"+
		"\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00f7\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\3Q\3\2\2\2\5X\3\2\2\2\7_\3\2\2\2\tb\3\2\2\2\13j\3\2\2\2\rn\3"+
		"\2\2\2\17w\3\2\2\2\21y\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\177\3\2\2\2"+
		"\31\u0081\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37\u0087\3\2\2\2!"+
		"\u0089\3\2\2\2#\u008b\3\2\2\2%\u008d\3\2\2\2\'\u0091\3\2\2\2)\u0093\3"+
		"\2\2\2+\u0095\3\2\2\2-\u0098\3\2\2\2/\u009b\3\2\2\2\61\u009e\3\2\2\2\63"+
		"\u00a1\3\2\2\2\65\u00a3\3\2\2\2\67\u00a5\3\2\2\29\u00a8\3\2\2\2;\u00ab"+
		"\3\2\2\2=\u00b0\3\2\2\2?\u00b6\3\2\2\2A\u00b8\3\2\2\2C\u00ba\3\2\2\2E"+
		"\u00bc\3\2\2\2G\u00be\3\2\2\2I\u00c5\3\2\2\2K\u00cb\3\2\2\2M\u00d9\3\2"+
		"\2\2O\u00ea\3\2\2\2QR\7r\2\2RS\7t\2\2ST\7k\2\2TU\7p\2\2UV\7v\2\2VW\7*"+
		"\2\2W\4\3\2\2\2XY\7h\2\2YZ\7c\2\2Z[\7k\2\2[\\\7n\2\2\\]\7*\2\2]^\7+\2"+
		"\2^\6\3\2\2\2_`\7~\2\2`\b\3\2\2\2ac\7/\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2"+
		"\2dg\5\13\6\2ef\7\60\2\2fh\5\13\6\2ge\3\2\2\2gh\3\2\2\2h\n\3\2\2\2ik\t"+
		"\2\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\f\3\2\2\2nr\7$\2\2oq\n"+
		"\3\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7"+
		"$\2\2v\16\3\2\2\2wx\7\60\2\2x\20\3\2\2\2yz\7^\2\2z\22\3\2\2\2{|\7.\2\2"+
		"|\24\3\2\2\2}~\7<\2\2~\26\3\2\2\2\177\u0080\7A\2\2\u0080\30\3\2\2\2\u0081"+
		"\u0082\7*\2\2\u0082\32\3\2\2\2\u0083\u0084\7+\2\2\u0084\34\3\2\2\2\u0085"+
		"\u0086\7}\2\2\u0086\36\3\2\2\2\u0087\u0088\7\177\2\2\u0088 \3\2\2\2\u0089"+
		"\u008a\7]\2\2\u008a\"\3\2\2\2\u008b\u008c\7_\2\2\u008c$\3\2\2\2\u008d"+
		"\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f\u0090\7v\2\2\u0090&\3\2\2\2\u0091"+
		"\u0092\7#\2\2\u0092(\3\2\2\2\u0093\u0094\7?\2\2\u0094*\3\2\2\2\u0095\u0096"+
		"\7?\2\2\u0096\u0097\7?\2\2\u0097,\3\2\2\2\u0098\u0099\7#\2\2\u0099\u009a"+
		"\7?\2\2\u009a.\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7?\2\2\u009d\60"+
		"\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0\62\3\2\2\2\u00a1"+
		"\u00a2\7>\2\2\u00a2\64\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4\66\3\2\2\2\u00a5"+
		"\u00a6\7~\2\2\u00a6\u00a7\7~\2\2\u00a78\3\2\2\2\u00a8\u00a9\7(\2\2\u00a9"+
		"\u00aa\7(\2\2\u00aa:\3\2\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7t\2\2\u00ad"+
		"\u00ae\7w\2\2\u00ae\u00af\7g\2\2\u00af<\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1"+
		"\u00b2\7c\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7g\2\2"+
		"\u00b5>\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7@\3\2\2\2\u00b8\u00b9\7\61\2\2"+
		"\u00b9B\3\2\2\2\u00ba\u00bb\7-\2\2\u00bbD\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd"+
		"F\3\2\2\2\u00be\u00c2\t\4\2\2\u00bf\u00c1\t\5\2\2\u00c0\u00bf\3\2\2\2"+
		"\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3H\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7r\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7v\2\2\u00caJ\3\2\2\2\u00cb"+
		"\u00cc\7\61\2\2\u00cc\u00cd\7,\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00d0\13"+
		"\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7,"+
		"\2\2\u00d5\u00d6\7\61\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b&\2\2\u00d8"+
		"L\3\2\2\2\u00d9\u00da\7\61\2\2\u00da\u00db\7\61\2\2\u00db\u00df\3\2\2"+
		"\2\u00dc\u00de\13\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00e4\7\17\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\7\f\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\'"+
		"\2\2\u00e8N\3\2\2\2\u00e9\u00eb\t\6\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\b(\2\2\u00efP\3\2\2\2\f\2bglr\u00c2\u00d1\u00df\u00e3\u00ec\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}