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
		NOT=10, LIMIT=11, OFFSET=12, ORDERBY=13, ASC=14, DESC=15, JOIN=16, INNER=17, 
		LEFT=18, RIGHT=19, FULL=20, OUTER=21, ON=22, LOGICAL_OPERATOR=23, IDENTIFIER=24, 
		COMP_OPERATOR=25, SEMICOLON=26, DOT=27, COMMA=28, LPAREN=29, RPAREN=30, 
		NUMBER=31, STRING=32, ASTERIX=33, WS=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "AS", "FROM", "WHERE", "BETWEEN", "LIKE", "IN", "AND", "OR", 
		"NOT", "LIMIT", "OFFSET", "ORDERBY", "ASC", "DESC", "JOIN", "INNER", "LEFT", 
		"RIGHT", "FULL", "OUTER", "ON", "LOGICAL_OPERATOR", "IDENTIFIER", "COMP_OPERATOR", 
		"SEMICOLON", "DOT", "COMMA", "LPAREN", "RPAREN", "NUMBER", "STRING", "ASTERIX", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'AS'", "'FROM'", "'WHERE'", "'BETWEEN'", "'LIKE'", 
		"'IN'", "'AND'", "'OR'", "'NOT'", "'LIMIT'", "'OFFSET'", "'ORDER BY'", 
		"'ASC'", "'DESC'", "'JOIN'", "'INNER'", "'LEFT'", "'RIGHT'", "'FULL'", 
		"'OUTER'", "'ON'", null, null, null, "';'", "'.'", "','", "'('", "')'", 
		null, null, "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "AS", "FROM", "WHERE", "BETWEEN", "LIKE", "IN", "AND", 
		"OR", "NOT", "LIMIT", "OFFSET", "ORDERBY", "ASC", "DESC", "JOIN", "INNER", 
		"LEFT", "RIGHT", "FULL", "OUTER", "ON", "LOGICAL_OPERATOR", "IDENTIFIER", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\5\30\u00bd"+
		"\n\30\3\31\3\31\7\31\u00c1\n\31\f\31\16\31\u00c4\13\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u00cd\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \5 \u00da\n \3 \6 \u00dd\n \r \16 \u00de\3 \3 \6 \u00e3"+
		"\n \r \16 \u00e4\5 \u00e7\n \3!\3!\7!\u00eb\n!\f!\16!\u00ee\13!\3!\3!"+
		"\3\"\3\"\3#\6#\u00f5\n#\r#\16#\u00f6\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\7\5\2"+
		"C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2))\5\2\13\f\17\17\"\"\u0104\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5N\3"+
		"\2\2\2\7Q\3\2\2\2\tV\3\2\2\2\13\\\3\2\2\2\rd\3\2\2\2\17i\3\2\2\2\21l\3"+
		"\2\2\2\23p\3\2\2\2\25s\3\2\2\2\27w\3\2\2\2\31}\3\2\2\2\33\u0084\3\2\2"+
		"\2\35\u008d\3\2\2\2\37\u0091\3\2\2\2!\u0096\3\2\2\2#\u009b\3\2\2\2%\u00a1"+
		"\3\2\2\2\'\u00a6\3\2\2\2)\u00ac\3\2\2\2+\u00b1\3\2\2\2-\u00b7\3\2\2\2"+
		"/\u00bc\3\2\2\2\61\u00be\3\2\2\2\63\u00cc\3\2\2\2\65\u00ce\3\2\2\2\67"+
		"\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00d4\3\2\2\2=\u00d6\3\2\2\2?\u00d9\3\2"+
		"\2\2A\u00e8\3\2\2\2C\u00f1\3\2\2\2E\u00f4\3\2\2\2GH\7U\2\2HI\7G\2\2IJ"+
		"\7N\2\2JK\7G\2\2KL\7E\2\2LM\7V\2\2M\4\3\2\2\2NO\7C\2\2OP\7U\2\2P\6\3\2"+
		"\2\2QR\7H\2\2RS\7T\2\2ST\7Q\2\2TU\7O\2\2U\b\3\2\2\2VW\7Y\2\2WX\7J\2\2"+
		"XY\7G\2\2YZ\7T\2\2Z[\7G\2\2[\n\3\2\2\2\\]\7D\2\2]^\7G\2\2^_\7V\2\2_`\7"+
		"Y\2\2`a\7G\2\2ab\7G\2\2bc\7P\2\2c\f\3\2\2\2de\7N\2\2ef\7K\2\2fg\7M\2\2"+
		"gh\7G\2\2h\16\3\2\2\2ij\7K\2\2jk\7P\2\2k\20\3\2\2\2lm\7C\2\2mn\7P\2\2"+
		"no\7F\2\2o\22\3\2\2\2pq\7Q\2\2qr\7T\2\2r\24\3\2\2\2st\7P\2\2tu\7Q\2\2"+
		"uv\7V\2\2v\26\3\2\2\2wx\7N\2\2xy\7K\2\2yz\7O\2\2z{\7K\2\2{|\7V\2\2|\30"+
		"\3\2\2\2}~\7Q\2\2~\177\7H\2\2\177\u0080\7H\2\2\u0080\u0081\7U\2\2\u0081"+
		"\u0082\7G\2\2\u0082\u0083\7V\2\2\u0083\32\3\2\2\2\u0084\u0085\7Q\2\2\u0085"+
		"\u0086\7T\2\2\u0086\u0087\7F\2\2\u0087\u0088\7G\2\2\u0088\u0089\7T\2\2"+
		"\u0089\u008a\7\"\2\2\u008a\u008b\7D\2\2\u008b\u008c\7[\2\2\u008c\34\3"+
		"\2\2\2\u008d\u008e\7C\2\2\u008e\u008f\7U\2\2\u008f\u0090\7E\2\2\u0090"+
		"\36\3\2\2\2\u0091\u0092\7F\2\2\u0092\u0093\7G\2\2\u0093\u0094\7U\2\2\u0094"+
		"\u0095\7E\2\2\u0095 \3\2\2\2\u0096\u0097\7L\2\2\u0097\u0098\7Q\2\2\u0098"+
		"\u0099\7K\2\2\u0099\u009a\7P\2\2\u009a\"\3\2\2\2\u009b\u009c\7K\2\2\u009c"+
		"\u009d\7P\2\2\u009d\u009e\7P\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7T\2\2"+
		"\u00a0$\3\2\2\2\u00a1\u00a2\7N\2\2\u00a2\u00a3\7G\2\2\u00a3\u00a4\7H\2"+
		"\2\u00a4\u00a5\7V\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7T\2\2\u00a7\u00a8\7"+
		"K\2\2\u00a8\u00a9\7I\2\2\u00a9\u00aa\7J\2\2\u00aa\u00ab\7V\2\2\u00ab("+
		"\3\2\2\2\u00ac\u00ad\7H\2\2\u00ad\u00ae\7W\2\2\u00ae\u00af\7N\2\2\u00af"+
		"\u00b0\7N\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7Q\2\2\u00b2\u00b3\7W\2\2\u00b3"+
		"\u00b4\7V\2\2\u00b4\u00b5\7G\2\2\u00b5\u00b6\7T\2\2\u00b6,\3\2\2\2\u00b7"+
		"\u00b8\7Q\2\2\u00b8\u00b9\7P\2\2\u00b9.\3\2\2\2\u00ba\u00bd\5\21\t\2\u00bb"+
		"\u00bd\5\23\n\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\60\3\2\2"+
		"\2\u00be\u00c2\t\2\2\2\u00bf\u00c1\t\3\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\62\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00cd\4>@\2\u00c6\u00c7\7@\2\2\u00c7\u00cd\7?\2\2"+
		"\u00c8\u00c9\7>\2\2\u00c9\u00cd\7?\2\2\u00ca\u00cb\7>\2\2\u00cb\u00cd"+
		"\7@\2\2\u00cc\u00c5\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\64\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf\66\3\2\2\2\u00d0"+
		"\u00d1\7\60\2\2\u00d18\3\2\2\2\u00d2\u00d3\7.\2\2\u00d3:\3\2\2\2\u00d4"+
		"\u00d5\7*\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7+\2\2\u00d7>\3\2\2\2\u00d8\u00da"+
		"\7/\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00dd\t\4\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e6\3\2\2\2\u00e0\u00e2\7\60\2\2\u00e1"+
		"\u00e3\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7@\3\2\2\2\u00e8\u00ec\7)\2\2\u00e9\u00eb\n\5\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7)\2\2\u00f0"+
		"B\3\2\2\2\u00f1\u00f2\7,\2\2\u00f2D\3\2\2\2\u00f3\u00f5\t\6\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\b#\2\2\u00f9F\3\2\2\2\f\2\u00bc\u00c2"+
		"\u00cc\u00d9\u00de\u00e4\u00e6\u00ec\u00f6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}