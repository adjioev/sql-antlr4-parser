// Generated from SqlLexer.g4 by ANTLR 4.5.3
package com.ecwid.antlrparser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, AS=2, FROM=3, WHERE=4, BETWEEN=5, LIKE=6, IN=7, AND=8, OR=9, 
		NOT=10, LIMIT=11, OFFSET=12, ORDERBY=13, GROUPBY=14, ASC=15, DESC=16, 
		JOIN=17, INNER=18, LEFT=19, RIGHT=20, FULL=21, OUTER=22, ON=23, LOGICAL_OPERATOR=24, 
		IDENTIFIER=25, COMP_OPERATOR=26, SEMICOLON=27, DOT=28, COMMA=29, LPAREN=30, 
		RPAREN=31, NUMBER=32, STRING=33, ASTERIX=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "AS", "FROM", "WHERE", "BETWEEN", "LIKE", "IN", "AND", "OR", 
		"NOT", "LIMIT", "OFFSET", "ORDERBY", "GROUPBY", "ASC", "DESC", "JOIN", 
		"INNER", "LEFT", "RIGHT", "FULL", "OUTER", "ON", "LOGICAL_OPERATOR", "IDENTIFIER", 
		"COMP_OPERATOR", "SEMICOLON", "DOT", "COMMA", "LPAREN", "RPAREN", "NUMBER", 
		"STRING", "ASTERIX", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'AS'", "'FROM'", "'WHERE'", "'BETWEEN'", "'LIKE'", 
		"'IN'", "'AND'", "'OR'", "'NOT'", "'LIMIT'", "'OFFSET'", "'ORDER BY'", 
		"'GROUP BY'", "'ASC'", "'DESC'", "'JOIN'", "'INNER'", "'LEFT'", "'RIGHT'", 
		"'FULL'", "'OUTER'", "'ON'", null, null, null, "';'", "'.'", "','", "'('", 
		"')'", null, null, "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "AS", "FROM", "WHERE", "BETWEEN", "LIKE", "IN", "AND", 
		"OR", "NOT", "LIMIT", "OFFSET", "ORDERBY", "GROUPBY", "ASC", "DESC", "JOIN", 
		"INNER", "LEFT", "RIGHT", "FULL", "OUTER", "ON", "LOGICAL_OPERATOR", "IDENTIFIER", 
		"COMP_OPERATOR", "SEMICOLON", "DOT", "COMMA", "LPAREN", "RPAREN", "NUMBER", 
		"STRING", "ASTERIX", "WS"
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
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u0105\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\5\31\u00c8\n\31\3\32\3\32\7\32"+
		"\u00cc\n\32\f\32\16\32\u00cf\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u00d8\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\5!\u00e5"+
		"\n!\3!\6!\u00e8\n!\r!\16!\u00e9\3!\3!\6!\u00ee\n!\r!\16!\u00ef\5!\u00f2"+
		"\n!\3\"\3\"\7\"\u00f6\n\"\f\"\16\"\u00f9\13\"\3\"\3\"\3#\3#\3$\6$\u0100"+
		"\n$\r$\16$\u0101\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\7\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\3\2\62;\3\2))\5\2\13\f\17\17\"\"\u010f\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5P\3\2\2\2\7S"+
		"\3\2\2\2\tX\3\2\2\2\13^\3\2\2\2\rf\3\2\2\2\17k\3\2\2\2\21n\3\2\2\2\23"+
		"r\3\2\2\2\25u\3\2\2\2\27y\3\2\2\2\31\177\3\2\2\2\33\u0086\3\2\2\2\35\u008f"+
		"\3\2\2\2\37\u0098\3\2\2\2!\u009c\3\2\2\2#\u00a1\3\2\2\2%\u00a6\3\2\2\2"+
		"\'\u00ac\3\2\2\2)\u00b1\3\2\2\2+\u00b7\3\2\2\2-\u00bc\3\2\2\2/\u00c2\3"+
		"\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00d7\3\2\2\2\67\u00d9\3\2"+
		"\2\29\u00db\3\2\2\2;\u00dd\3\2\2\2=\u00df\3\2\2\2?\u00e1\3\2\2\2A\u00e4"+
		"\3\2\2\2C\u00f3\3\2\2\2E\u00fc\3\2\2\2G\u00ff\3\2\2\2IJ\7U\2\2JK\7G\2"+
		"\2KL\7N\2\2LM\7G\2\2MN\7E\2\2NO\7V\2\2O\4\3\2\2\2PQ\7C\2\2QR\7U\2\2R\6"+
		"\3\2\2\2ST\7H\2\2TU\7T\2\2UV\7Q\2\2VW\7O\2\2W\b\3\2\2\2XY\7Y\2\2YZ\7J"+
		"\2\2Z[\7G\2\2[\\\7T\2\2\\]\7G\2\2]\n\3\2\2\2^_\7D\2\2_`\7G\2\2`a\7V\2"+
		"\2ab\7Y\2\2bc\7G\2\2cd\7G\2\2de\7P\2\2e\f\3\2\2\2fg\7N\2\2gh\7K\2\2hi"+
		"\7M\2\2ij\7G\2\2j\16\3\2\2\2kl\7K\2\2lm\7P\2\2m\20\3\2\2\2no\7C\2\2op"+
		"\7P\2\2pq\7F\2\2q\22\3\2\2\2rs\7Q\2\2st\7T\2\2t\24\3\2\2\2uv\7P\2\2vw"+
		"\7Q\2\2wx\7V\2\2x\26\3\2\2\2yz\7N\2\2z{\7K\2\2{|\7O\2\2|}\7K\2\2}~\7V"+
		"\2\2~\30\3\2\2\2\177\u0080\7Q\2\2\u0080\u0081\7H\2\2\u0081\u0082\7H\2"+
		"\2\u0082\u0083\7U\2\2\u0083\u0084\7G\2\2\u0084\u0085\7V\2\2\u0085\32\3"+
		"\2\2\2\u0086\u0087\7Q\2\2\u0087\u0088\7T\2\2\u0088\u0089\7F\2\2\u0089"+
		"\u008a\7G\2\2\u008a\u008b\7T\2\2\u008b\u008c\7\"\2\2\u008c\u008d\7D\2"+
		"\2\u008d\u008e\7[\2\2\u008e\34\3\2\2\2\u008f\u0090\7I\2\2\u0090\u0091"+
		"\7T\2\2\u0091\u0092\7Q\2\2\u0092\u0093\7W\2\2\u0093\u0094\7R\2\2\u0094"+
		"\u0095\7\"\2\2\u0095\u0096\7D\2\2\u0096\u0097\7[\2\2\u0097\36\3\2\2\2"+
		"\u0098\u0099\7C\2\2\u0099\u009a\7U\2\2\u009a\u009b\7E\2\2\u009b \3\2\2"+
		"\2\u009c\u009d\7F\2\2\u009d\u009e\7G\2\2\u009e\u009f\7U\2\2\u009f\u00a0"+
		"\7E\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7L\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4"+
		"\7K\2\2\u00a4\u00a5\7P\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7K\2\2\u00a7\u00a8"+
		"\7P\2\2\u00a8\u00a9\7P\2\2\u00a9\u00aa\7G\2\2\u00aa\u00ab\7T\2\2\u00ab"+
		"&\3\2\2\2\u00ac\u00ad\7N\2\2\u00ad\u00ae\7G\2\2\u00ae\u00af\7H\2\2\u00af"+
		"\u00b0\7V\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7T\2\2\u00b2\u00b3\7K\2\2\u00b3"+
		"\u00b4\7I\2\2\u00b4\u00b5\7J\2\2\u00b5\u00b6\7V\2\2\u00b6*\3\2\2\2\u00b7"+
		"\u00b8\7H\2\2\u00b8\u00b9\7W\2\2\u00b9\u00ba\7N\2\2\u00ba\u00bb\7N\2\2"+
		"\u00bb,\3\2\2\2\u00bc\u00bd\7Q\2\2\u00bd\u00be\7W\2\2\u00be\u00bf\7V\2"+
		"\2\u00bf\u00c0\7G\2\2\u00c0\u00c1\7T\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7"+
		"Q\2\2\u00c3\u00c4\7P\2\2\u00c4\60\3\2\2\2\u00c5\u00c8\5\21\t\2\u00c6\u00c8"+
		"\5\23\n\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\62\3\2\2\2\u00c9"+
		"\u00cd\t\2\2\2\u00ca\u00cc\t\3\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\64\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d8\4>@\2\u00d1\u00d2\7@\2\2\u00d2\u00d8\7?\2\2\u00d3"+
		"\u00d4\7>\2\2\u00d4\u00d8\7?\2\2\u00d5\u00d6\7>\2\2\u00d6\u00d8\7@\2\2"+
		"\u00d7\u00d0\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\66\3\2\2\2\u00d9\u00da\7=\2\2\u00da8\3\2\2\2\u00db\u00dc"+
		"\7\60\2\2\u00dc:\3\2\2\2\u00dd\u00de\7.\2\2\u00de<\3\2\2\2\u00df\u00e0"+
		"\7*\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7+\2\2\u00e2@\3\2\2\2\u00e3\u00e5\7"+
		"/\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e8\t\4\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f1\3\2\2\2\u00eb\u00ed\7\60\2\2\u00ec"+
		"\u00ee\t\4\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2B\3\2\2\2\u00f3\u00f7\7)\2\2\u00f4\u00f6\n\5\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7)\2\2\u00fb"+
		"D\3\2\2\2\u00fc\u00fd\7,\2\2\u00fdF\3\2\2\2\u00fe\u0100\t\6\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0104\b$\2\2\u0104H\3\2\2\2\f\2\u00c7\u00cd"+
		"\u00d7\u00e4\u00e9\u00ef\u00f1\u00f7\u0101\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}