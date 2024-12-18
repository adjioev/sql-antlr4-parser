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
		SELECT=1, AS=2, FROM=3, WHERE=4, HAVING=5, BETWEEN=6, LIKE=7, IN=8, AND=9, 
		OR=10, NOT=11, LIMIT=12, OFFSET=13, ORDERBY=14, GROUPBY=15, ASC=16, DESC=17, 
		IS=18, NULL=19, JOIN=20, INNER=21, LEFT=22, RIGHT=23, FULL=24, OUTER=25, 
		CROSS=26, NATURAL=27, ON=28, COUNT=29, SUM=30, AVG=31, MAX=32, MIN=33, 
		LOGICAL_OPERATOR=34, IDENTIFIER=35, COMP_OPERATOR=36, SEMICOLON=37, DOT=38, 
		COMMA=39, LPAREN=40, RPAREN=41, NUMBER=42, STRING=43, ASTERIX=44, WS=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "AS", "FROM", "WHERE", "HAVING", "BETWEEN", "LIKE", "IN", "AND", 
		"OR", "NOT", "LIMIT", "OFFSET", "ORDERBY", "GROUPBY", "ASC", "DESC", "IS", 
		"NULL", "JOIN", "INNER", "LEFT", "RIGHT", "FULL", "OUTER", "CROSS", "NATURAL", 
		"ON", "COUNT", "SUM", "AVG", "MAX", "MIN", "LOGICAL_OPERATOR", "IDENTIFIER", 
		"COMP_OPERATOR", "SEMICOLON", "DOT", "COMMA", "LPAREN", "RPAREN", "NUMBER", 
		"STRING", "ASTERIX", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'AS'", "'FROM'", "'WHERE'", "'HAVING'", "'BETWEEN'", 
		"'LIKE'", "'IN'", "'AND'", "'OR'", "'NOT'", "'LIMIT'", "'OFFSET'", "'ORDER BY'", 
		"'GROUP BY'", "'ASC'", "'DESC'", "'IS'", "'NULL'", "'JOIN'", "'INNER'", 
		"'LEFT'", "'RIGHT'", "'FULL'", "'OUTER'", "'CROSS'", "'NATURAL'", "'ON'", 
		"'COUNT'", "'SUM'", "'AVG'", "'MAX'", "'MIN'", null, null, null, "';'", 
		"'.'", "','", "'('", "')'", null, null, "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "AS", "FROM", "WHERE", "HAVING", "BETWEEN", "LIKE", "IN", 
		"AND", "OR", "NOT", "LIMIT", "OFFSET", "ORDERBY", "GROUPBY", "ASC", "DESC", 
		"IS", "NULL", "JOIN", "INNER", "LEFT", "RIGHT", "FULL", "OUTER", "CROSS", 
		"NATURAL", "ON", "COUNT", "SUM", "AVG", "MAX", "MIN", "LOGICAL_OPERATOR", 
		"IDENTIFIER", "COMP_OPERATOR", "SEMICOLON", "DOT", "COMMA", "LPAREN", 
		"RPAREN", "NUMBER", "STRING", "ASTERIX", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u014c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\5#\u010f\n#\3$\3$\7"+
		"$\u0113\n$\f$\16$\u0116\13$\3%\3%\3%\3%\3%\3%\3%\5%\u011f\n%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\5+\u012c\n+\3+\6+\u012f\n+\r+\16+\u0130\3+\3"+
		"+\6+\u0135\n+\r+\16+\u0136\5+\u0139\n+\3,\3,\7,\u013d\n,\f,\16,\u0140"+
		"\13,\3,\3,\3-\3-\3.\6.\u0147\n.\r.\16.\u0148\3.\3.\2\2/\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2))\5"+
		"\2\13\f\17\17\"\"\u0156\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3"+
		"\2\2\2\5d\3\2\2\2\7g\3\2\2\2\tl\3\2\2\2\13r\3\2\2\2\ry\3\2\2\2\17\u0081"+
		"\3\2\2\2\21\u0086\3\2\2\2\23\u0089\3\2\2\2\25\u008d\3\2\2\2\27\u0090\3"+
		"\2\2\2\31\u0094\3\2\2\2\33\u009a\3\2\2\2\35\u00a1\3\2\2\2\37\u00aa\3\2"+
		"\2\2!\u00b3\3\2\2\2#\u00b7\3\2\2\2%\u00bc\3\2\2\2\'\u00bf\3\2\2\2)\u00c4"+
		"\3\2\2\2+\u00c9\3\2\2\2-\u00cf\3\2\2\2/\u00d4\3\2\2\2\61\u00da\3\2\2\2"+
		"\63\u00df\3\2\2\2\65\u00e5\3\2\2\2\67\u00eb\3\2\2\29\u00f3\3\2\2\2;\u00f6"+
		"\3\2\2\2=\u00fc\3\2\2\2?\u0100\3\2\2\2A\u0104\3\2\2\2C\u0108\3\2\2\2E"+
		"\u010e\3\2\2\2G\u0110\3\2\2\2I\u011e\3\2\2\2K\u0120\3\2\2\2M\u0122\3\2"+
		"\2\2O\u0124\3\2\2\2Q\u0126\3\2\2\2S\u0128\3\2\2\2U\u012b\3\2\2\2W\u013a"+
		"\3\2\2\2Y\u0143\3\2\2\2[\u0146\3\2\2\2]^\7U\2\2^_\7G\2\2_`\7N\2\2`a\7"+
		"G\2\2ab\7E\2\2bc\7V\2\2c\4\3\2\2\2de\7C\2\2ef\7U\2\2f\6\3\2\2\2gh\7H\2"+
		"\2hi\7T\2\2ij\7Q\2\2jk\7O\2\2k\b\3\2\2\2lm\7Y\2\2mn\7J\2\2no\7G\2\2op"+
		"\7T\2\2pq\7G\2\2q\n\3\2\2\2rs\7J\2\2st\7C\2\2tu\7X\2\2uv\7K\2\2vw\7P\2"+
		"\2wx\7I\2\2x\f\3\2\2\2yz\7D\2\2z{\7G\2\2{|\7V\2\2|}\7Y\2\2}~\7G\2\2~\177"+
		"\7G\2\2\177\u0080\7P\2\2\u0080\16\3\2\2\2\u0081\u0082\7N\2\2\u0082\u0083"+
		"\7K\2\2\u0083\u0084\7M\2\2\u0084\u0085\7G\2\2\u0085\20\3\2\2\2\u0086\u0087"+
		"\7K\2\2\u0087\u0088\7P\2\2\u0088\22\3\2\2\2\u0089\u008a\7C\2\2\u008a\u008b"+
		"\7P\2\2\u008b\u008c\7F\2\2\u008c\24\3\2\2\2\u008d\u008e\7Q\2\2\u008e\u008f"+
		"\7T\2\2\u008f\26\3\2\2\2\u0090\u0091\7P\2\2\u0091\u0092\7Q\2\2\u0092\u0093"+
		"\7V\2\2\u0093\30\3\2\2\2\u0094\u0095\7N\2\2\u0095\u0096\7K\2\2\u0096\u0097"+
		"\7O\2\2\u0097\u0098\7K\2\2\u0098\u0099\7V\2\2\u0099\32\3\2\2\2\u009a\u009b"+
		"\7Q\2\2\u009b\u009c\7H\2\2\u009c\u009d\7H\2\2\u009d\u009e\7U\2\2\u009e"+
		"\u009f\7G\2\2\u009f\u00a0\7V\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\7Q\2\2\u00a2"+
		"\u00a3\7T\2\2\u00a3\u00a4\7F\2\2\u00a4\u00a5\7G\2\2\u00a5\u00a6\7T\2\2"+
		"\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7D\2\2\u00a8\u00a9\7[\2\2\u00a9\36\3"+
		"\2\2\2\u00aa\u00ab\7I\2\2\u00ab\u00ac\7T\2\2\u00ac\u00ad\7Q\2\2\u00ad"+
		"\u00ae\7W\2\2\u00ae\u00af\7R\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\7D\2"+
		"\2\u00b1\u00b2\7[\2\2\u00b2 \3\2\2\2\u00b3\u00b4\7C\2\2\u00b4\u00b5\7"+
		"U\2\2\u00b5\u00b6\7E\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7F\2\2\u00b8\u00b9"+
		"\7G\2\2\u00b9\u00ba\7U\2\2\u00ba\u00bb\7E\2\2\u00bb$\3\2\2\2\u00bc\u00bd"+
		"\7K\2\2\u00bd\u00be\7U\2\2\u00be&\3\2\2\2\u00bf\u00c0\7P\2\2\u00c0\u00c1"+
		"\7W\2\2\u00c1\u00c2\7N\2\2\u00c2\u00c3\7N\2\2\u00c3(\3\2\2\2\u00c4\u00c5"+
		"\7L\2\2\u00c5\u00c6\7Q\2\2\u00c6\u00c7\7K\2\2\u00c7\u00c8\7P\2\2\u00c8"+
		"*\3\2\2\2\u00c9\u00ca\7K\2\2\u00ca\u00cb\7P\2\2\u00cb\u00cc\7P\2\2\u00cc"+
		"\u00cd\7G\2\2\u00cd\u00ce\7T\2\2\u00ce,\3\2\2\2\u00cf\u00d0\7N\2\2\u00d0"+
		"\u00d1\7G\2\2\u00d1\u00d2\7H\2\2\u00d2\u00d3\7V\2\2\u00d3.\3\2\2\2\u00d4"+
		"\u00d5\7T\2\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7I\2\2\u00d7\u00d8\7J\2\2"+
		"\u00d8\u00d9\7V\2\2\u00d9\60\3\2\2\2\u00da\u00db\7H\2\2\u00db\u00dc\7"+
		"W\2\2\u00dc\u00dd\7N\2\2\u00dd\u00de\7N\2\2\u00de\62\3\2\2\2\u00df\u00e0"+
		"\7Q\2\2\u00e0\u00e1\7W\2\2\u00e1\u00e2\7V\2\2\u00e2\u00e3\7G\2\2\u00e3"+
		"\u00e4\7T\2\2\u00e4\64\3\2\2\2\u00e5\u00e6\7E\2\2\u00e6\u00e7\7T\2\2\u00e7"+
		"\u00e8\7Q\2\2\u00e8\u00e9\7U\2\2\u00e9\u00ea\7U\2\2\u00ea\66\3\2\2\2\u00eb"+
		"\u00ec\7P\2\2\u00ec\u00ed\7C\2\2\u00ed\u00ee\7V\2\2\u00ee\u00ef\7W\2\2"+
		"\u00ef\u00f0\7T\2\2\u00f0\u00f1\7C\2\2\u00f1\u00f2\7N\2\2\u00f28\3\2\2"+
		"\2\u00f3\u00f4\7Q\2\2\u00f4\u00f5\7P\2\2\u00f5:\3\2\2\2\u00f6\u00f7\7"+
		"E\2\2\u00f7\u00f8\7Q\2\2\u00f8\u00f9\7W\2\2\u00f9\u00fa\7P\2\2\u00fa\u00fb"+
		"\7V\2\2\u00fb<\3\2\2\2\u00fc\u00fd\7U\2\2\u00fd\u00fe\7W\2\2\u00fe\u00ff"+
		"\7O\2\2\u00ff>\3\2\2\2\u0100\u0101\7C\2\2\u0101\u0102\7X\2\2\u0102\u0103"+
		"\7I\2\2\u0103@\3\2\2\2\u0104\u0105\7O\2\2\u0105\u0106\7C\2\2\u0106\u0107"+
		"\7Z\2\2\u0107B\3\2\2\2\u0108\u0109\7O\2\2\u0109\u010a\7K\2\2\u010a\u010b"+
		"\7P\2\2\u010bD\3\2\2\2\u010c\u010f\5\23\n\2\u010d\u010f\5\25\13\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010fF\3\2\2\2\u0110\u0114\t\2\2\2"+
		"\u0111\u0113\t\3\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115H\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u011f\4>@\2\u0118\u0119\7@\2\2\u0119\u011f\7?\2\2\u011a\u011b\7>\2\2"+
		"\u011b\u011f\7?\2\2\u011c\u011d\7>\2\2\u011d\u011f\7@\2\2\u011e\u0117"+
		"\3\2\2\2\u011e\u0118\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"J\3\2\2\2\u0120\u0121\7=\2\2\u0121L\3\2\2\2\u0122\u0123\7\60\2\2\u0123"+
		"N\3\2\2\2\u0124\u0125\7.\2\2\u0125P\3\2\2\2\u0126\u0127\7*\2\2\u0127R"+
		"\3\2\2\2\u0128\u0129\7+\2\2\u0129T\3\2\2\2\u012a\u012c\7/\2\2\u012b\u012a"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012f\t\4\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0138\3\2\2\2\u0132\u0134\7\60\2\2\u0133\u0135\t\4\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0139\3\2\2\2\u0138\u0132\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"V\3\2\2\2\u013a\u013e\7)\2\2\u013b\u013d\n\5\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7)\2\2\u0142X\3\2\2\2\u0143\u0144"+
		"\7,\2\2\u0144Z\3\2\2\2\u0145\u0147\t\6\2\2\u0146\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\b.\2\2\u014b\\\3\2\2\2\f\2\u010e\u0114\u011e\u012b\u0130\u0136"+
		"\u0138\u013e\u0148\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}