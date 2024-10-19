// Generated from /Users/adjioev/sandbox/sql-antlr4-parser/src/main/antlr/SqlLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, BETWEEN=4, LIKE=5, IN=6, AND=7, OR=8, NOT=9, 
		LIMIT=10, OFFSET=11, LOGICAL_OPERATOR=12, IDENTIFIER=13, COMP_OPERATOR=14, 
		SEMICOLON=15, DOT=16, COMMA=17, LPAREN=18, RPAREN=19, NUMBER=20, STRING=21, 
		ASTERIX=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "WHERE", "BETWEEN", "LIKE", "IN", "AND", "OR", "NOT", 
			"LIMIT", "OFFSET", "LOGICAL_OPERATOR", "IDENTIFIER", "COMP_OPERATOR", 
			"SEMICOLON", "DOT", "COMMA", "LPAREN", "RPAREN", "NUMBER", "STRING", 
			"ASTERIX", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'FROM'", "'WHERE'", "'BETWEEN'", "'LIKE'", "'IN'", 
			"'AND'", "'OR'", "'NOT'", "'LIMIT'", "'OFFSET'", null, null, null, "';'", 
			"'.'", "','", "'('", "')'", null, null, "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "BETWEEN", "LIKE", "IN", "AND", "OR", 
			"NOT", "LIMIT", "OFFSET", "LOGICAL_OPERATOR", "IDENTIFIER", "COMP_OPERATOR", 
			"SEMICOLON", "DOT", "COMMA", "LPAREN", "RPAREN", "NUMBER", "STRING", 
			"ASTERIX", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public SqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SqlLexer.g4"; }

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
		"\u0004\u0000\u0017\u00a9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000bl\b\u000b"+
		"\u0001\f\u0001\f\u0005\fp\b\f\n\f\f\fs\t\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r|\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u0089\b\u0013\u0001\u0013\u0004"+
		"\u0013\u008c\b\u0013\u000b\u0013\f\u0013\u008d\u0001\u0013\u0001\u0013"+
		"\u0004\u0013\u0092\b\u0013\u000b\u0013\f\u0013\u0093\u0003\u0013\u0096"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u009a\b\u0014\n\u0014\f\u0014"+
		"\u009d\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0004\u0016\u00a4\b\u0016\u000b\u0016\f\u0016\u00a5\u0001\u0016\u0001"+
		"\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0016\u0002\u0000SSss\u0002\u0000"+
		"EEee\u0002\u0000LLll\u0002\u0000CCcc\u0002\u0000TTtt\u0002\u0000FFff\u0002"+
		"\u0000RRrr\u0002\u0000OOoo\u0002\u0000MMmm\u0002\u0000WWww\u0002\u0000"+
		"HHhh\u0002\u0000BBbb\u0002\u0000NNnn\u0002\u0000IIii\u0002\u0000KKkk\u0002"+
		"\u0000AAaa\u0002\u0000DDdd\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001"+
		"\u000009\u0001\u0000\'\'\u0003\u0000\t\n\r\r  \u00b3\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000"+
		"\u00036\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007A"+
		"\u0001\u0000\u0000\u0000\tI\u0001\u0000\u0000\u0000\u000bN\u0001\u0000"+
		"\u0000\u0000\rQ\u0001\u0000\u0000\u0000\u000fU\u0001\u0000\u0000\u0000"+
		"\u0011X\u0001\u0000\u0000\u0000\u0013\\\u0001\u0000\u0000\u0000\u0015"+
		"b\u0001\u0000\u0000\u0000\u0017k\u0001\u0000\u0000\u0000\u0019m\u0001"+
		"\u0000\u0000\u0000\u001b{\u0001\u0000\u0000\u0000\u001d}\u0001\u0000\u0000"+
		"\u0000\u001f\u007f\u0001\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000"+
		"#\u0083\u0001\u0000\u0000\u0000%\u0085\u0001\u0000\u0000\u0000\'\u0088"+
		"\u0001\u0000\u0000\u0000)\u0097\u0001\u0000\u0000\u0000+\u00a0\u0001\u0000"+
		"\u0000\u0000-\u00a3\u0001\u0000\u0000\u0000/0\u0007\u0000\u0000\u0000"+
		"01\u0007\u0001\u0000\u000012\u0007\u0002\u0000\u000023\u0007\u0001\u0000"+
		"\u000034\u0007\u0003\u0000\u000045\u0007\u0004\u0000\u00005\u0002\u0001"+
		"\u0000\u0000\u000067\u0007\u0005\u0000\u000078\u0007\u0006\u0000\u0000"+
		"89\u0007\u0007\u0000\u00009:\u0007\b\u0000\u0000:\u0004\u0001\u0000\u0000"+
		"\u0000;<\u0007\t\u0000\u0000<=\u0007\n\u0000\u0000=>\u0007\u0001\u0000"+
		"\u0000>?\u0007\u0006\u0000\u0000?@\u0007\u0001\u0000\u0000@\u0006\u0001"+
		"\u0000\u0000\u0000AB\u0007\u000b\u0000\u0000BC\u0007\u0001\u0000\u0000"+
		"CD\u0007\u0004\u0000\u0000DE\u0007\t\u0000\u0000EF\u0007\u0001\u0000\u0000"+
		"FG\u0007\u0001\u0000\u0000GH\u0007\f\u0000\u0000H\b\u0001\u0000\u0000"+
		"\u0000IJ\u0007\u0002\u0000\u0000JK\u0007\r\u0000\u0000KL\u0007\u000e\u0000"+
		"\u0000LM\u0007\u0001\u0000\u0000M\n\u0001\u0000\u0000\u0000NO\u0007\r"+
		"\u0000\u0000OP\u0007\f\u0000\u0000P\f\u0001\u0000\u0000\u0000QR\u0007"+
		"\u000f\u0000\u0000RS\u0007\f\u0000\u0000ST\u0007\u0010\u0000\u0000T\u000e"+
		"\u0001\u0000\u0000\u0000UV\u0007\u0007\u0000\u0000VW\u0007\u0006\u0000"+
		"\u0000W\u0010\u0001\u0000\u0000\u0000XY\u0007\f\u0000\u0000YZ\u0007\u0007"+
		"\u0000\u0000Z[\u0007\u0004\u0000\u0000[\u0012\u0001\u0000\u0000\u0000"+
		"\\]\u0007\u0002\u0000\u0000]^\u0007\r\u0000\u0000^_\u0007\b\u0000\u0000"+
		"_`\u0007\r\u0000\u0000`a\u0007\u0004\u0000\u0000a\u0014\u0001\u0000\u0000"+
		"\u0000bc\u0007\u0007\u0000\u0000cd\u0007\u0005\u0000\u0000de\u0007\u0005"+
		"\u0000\u0000ef\u0007\u0000\u0000\u0000fg\u0007\u0001\u0000\u0000gh\u0007"+
		"\u0004\u0000\u0000h\u0016\u0001\u0000\u0000\u0000il\u0003\r\u0006\u0000"+
		"jl\u0003\u000f\u0007\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000l\u0018\u0001\u0000\u0000\u0000mq\u0007\u0011\u0000\u0000np\u0007"+
		"\u0012\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u001a\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000t|\u0002<>\u0000uv\u0005>\u0000"+
		"\u0000v|\u0005=\u0000\u0000wx\u0005<\u0000\u0000x|\u0005=\u0000\u0000"+
		"yz\u0005<\u0000\u0000z|\u0005>\u0000\u0000{t\u0001\u0000\u0000\u0000{"+
		"u\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000|\u001c\u0001\u0000\u0000\u0000}~\u0005;\u0000\u0000~\u001e\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005.\u0000\u0000\u0080 \u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005,\u0000\u0000\u0082\"\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005(\u0000\u0000\u0084$\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005)\u0000\u0000\u0086&\u0001\u0000\u0000\u0000\u0087\u0089\u0005-"+
		"\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u008c\u0007\u0013"+
		"\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u0095\u0001\u0000\u0000\u0000\u008f\u0091\u0005.\u0000"+
		"\u0000\u0090\u0092\u0007\u0013\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000"+
		"\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096(\u0001\u0000\u0000\u0000\u0097\u009b\u0005\'\u0000\u0000"+
		"\u0098\u009a\b\u0014\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005\'\u0000\u0000\u009f*"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005*\u0000\u0000\u00a1,\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a4\u0007\u0015\u0000\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0006\u0016\u0000\u0000\u00a8.\u0001\u0000\u0000"+
		"\u0000\n\u0000kq{\u0088\u008d\u0093\u0095\u009b\u00a5\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}