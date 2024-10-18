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
		SELECT=1, FROM=2, WHERE=3, BETWEEN=4, LIKE=5, IN=6, AND=7, OR=8, LOGICAL_OPERATOR=9, 
		IDENTIFIER=10, COMP_OPERATOR=11, SEMICOLON=12, COMMA=13, LPAREN=14, RPAREN=15, 
		NUMBER=16, STRING=17, ASTERIX=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "WHERE", "BETWEEN", "LIKE", "IN", "AND", "OR", "LOGICAL_OPERATOR", 
			"IDENTIFIER", "COMP_OPERATOR", "SEMICOLON", "COMMA", "LPAREN", "RPAREN", 
			"NUMBER", "STRING", "ASTERIX", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'FROM'", "'WHERE'", "'BETWEEN'", "'LIKE'", "'IN'", 
			"'AND'", "'OR'", null, null, null, "';'", "','", "'('", "')'", null, 
			null, "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "BETWEEN", "LIKE", "IN", "AND", "OR", 
			"LOGICAL_OPERATOR", "IDENTIFIER", "COMP_OPERATOR", "SEMICOLON", "COMMA", 
			"LPAREN", "RPAREN", "NUMBER", "STRING", "ASTERIX", "WS"
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
		"\u0004\u0000\u0013\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0003\bS\b\b\u0001\t\u0001\t\u0005\tW\b\t"+
		"\n\t\f\tZ\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0003\nc\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000fn\b\u000f\u0001\u000f"+
		"\u0004\u000fq\b\u000f\u000b\u000f\f\u000fr\u0001\u000f\u0001\u000f\u0004"+
		"\u000fw\b\u000f\u000b\u000f\f\u000fx\u0003\u000f{\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u007f\b\u0010\n\u0010\f\u0010\u0082\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012\u0089"+
		"\b\u0012\u000b\u0012\f\u0012\u008a\u0001\u0012\u0001\u0012\u0000\u0000"+
		"\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0016\u0002"+
		"\u0000SSss\u0002\u0000EEee\u0002\u0000LLll\u0002\u0000CCcc\u0002\u0000"+
		"TTtt\u0002\u0000FFff\u0002\u0000RRrr\u0002\u0000OOoo\u0002\u0000MMmm\u0002"+
		"\u0000WWww\u0002\u0000HHhh\u0002\u0000BBbb\u0002\u0000NNnn\u0002\u0000"+
		"IIii\u0002\u0000KKkk\u0002\u0000AAaa\u0002\u0000DDdd\u0003\u0000AZ__a"+
		"z\u0004\u000009AZ__az\u0001\u000009\u0001\u0000\'\'\u0003\u0000\t\n\r"+
		"\r  \u0098\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003.\u0001"+
		"\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u00079\u0001\u0000\u0000"+
		"\u0000\tA\u0001\u0000\u0000\u0000\u000bF\u0001\u0000\u0000\u0000\rI\u0001"+
		"\u0000\u0000\u0000\u000fM\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000"+
		"\u0000\u0013T\u0001\u0000\u0000\u0000\u0015b\u0001\u0000\u0000\u0000\u0017"+
		"d\u0001\u0000\u0000\u0000\u0019f\u0001\u0000\u0000\u0000\u001bh\u0001"+
		"\u0000\u0000\u0000\u001dj\u0001\u0000\u0000\u0000\u001fm\u0001\u0000\u0000"+
		"\u0000!|\u0001\u0000\u0000\u0000#\u0085\u0001\u0000\u0000\u0000%\u0088"+
		"\u0001\u0000\u0000\u0000\'(\u0007\u0000\u0000\u0000()\u0007\u0001\u0000"+
		"\u0000)*\u0007\u0002\u0000\u0000*+\u0007\u0001\u0000\u0000+,\u0007\u0003"+
		"\u0000\u0000,-\u0007\u0004\u0000\u0000-\u0002\u0001\u0000\u0000\u0000"+
		"./\u0007\u0005\u0000\u0000/0\u0007\u0006\u0000\u000001\u0007\u0007\u0000"+
		"\u000012\u0007\b\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0007\t"+
		"\u0000\u000045\u0007\n\u0000\u000056\u0007\u0001\u0000\u000067\u0007\u0006"+
		"\u0000\u000078\u0007\u0001\u0000\u00008\u0006\u0001\u0000\u0000\u0000"+
		"9:\u0007\u000b\u0000\u0000:;\u0007\u0001\u0000\u0000;<\u0007\u0004\u0000"+
		"\u0000<=\u0007\t\u0000\u0000=>\u0007\u0001\u0000\u0000>?\u0007\u0001\u0000"+
		"\u0000?@\u0007\f\u0000\u0000@\b\u0001\u0000\u0000\u0000AB\u0007\u0002"+
		"\u0000\u0000BC\u0007\r\u0000\u0000CD\u0007\u000e\u0000\u0000DE\u0007\u0001"+
		"\u0000\u0000E\n\u0001\u0000\u0000\u0000FG\u0007\r\u0000\u0000GH\u0007"+
		"\f\u0000\u0000H\f\u0001\u0000\u0000\u0000IJ\u0007\u000f\u0000\u0000JK"+
		"\u0007\f\u0000\u0000KL\u0007\u0010\u0000\u0000L\u000e\u0001\u0000\u0000"+
		"\u0000MN\u0007\u0007\u0000\u0000NO\u0007\u0006\u0000\u0000O\u0010\u0001"+
		"\u0000\u0000\u0000PS\u0003\r\u0006\u0000QS\u0003\u000f\u0007\u0000RP\u0001"+
		"\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\u0012\u0001\u0000\u0000"+
		"\u0000TX\u0007\u0011\u0000\u0000UW\u0007\u0012\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000[c\u0002<>\u0000\\]\u0005>\u0000\u0000]c\u0005=\u0000\u0000^_\u0005"+
		"<\u0000\u0000_c\u0005=\u0000\u0000`a\u0005<\u0000\u0000ac\u0005>\u0000"+
		"\u0000b[\u0001\u0000\u0000\u0000b\\\u0001\u0000\u0000\u0000b^\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000c\u0016\u0001\u0000\u0000\u0000"+
		"de\u0005;\u0000\u0000e\u0018\u0001\u0000\u0000\u0000fg\u0005,\u0000\u0000"+
		"g\u001a\u0001\u0000\u0000\u0000hi\u0005(\u0000\u0000i\u001c\u0001\u0000"+
		"\u0000\u0000jk\u0005)\u0000\u0000k\u001e\u0001\u0000\u0000\u0000ln\u0005"+
		"-\u0000\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001"+
		"\u0000\u0000\u0000oq\u0007\u0013\u0000\u0000po\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000sz\u0001\u0000\u0000\u0000tv\u0005.\u0000\u0000uw\u0007\u0013\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zt\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{ \u0001\u0000\u0000\u0000"+
		"|\u0080\u0005\'\u0000\u0000}\u007f\b\u0014\u0000\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0005\'\u0000\u0000\u0084"+
		"\"\u0001\u0000\u0000\u0000\u0085\u0086\u0005*\u0000\u0000\u0086$\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0007\u0015\u0000\u0000\u0088\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0006\u0012\u0000\u0000\u008d&\u0001\u0000"+
		"\u0000\u0000\n\u0000RXbmrxz\u0080\u008a\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}