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
		SELECT=1, FROM=2, WHERE=3, BETWEEN=4, LIKE=5, IN=6, AND=7, OR=8, LOGICAL_OPERATOR=9, 
		IDENTIFIER=10, COMP_OPERATOR=11, SEMICOLON=12, COMMA=13, LPAREN=14, RPAREN=15, 
		NUMBER=16, STRING=17, ASTERIX=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "BETWEEN", "LIKE", "IN", "AND", "OR", "LOGICAL_OPERATOR", 
		"IDENTIFIER", "COMP_OPERATOR", "SEMICOLON", "COMMA", "LPAREN", "RPAREN", 
		"NUMBER", "STRING", "ASTERIX", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'FROM'", "'WHERE'", "'BETWEEN'", "'LIKE'", "'IN'", 
		"'AND'", "'OR'", null, null, null, "';'", "','", "'('", "')'", null, null, 
		"'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "BETWEEN", "LIKE", "IN", "AND", "OR", 
		"LOGICAL_OPERATOR", "IDENTIFIER", "COMP_OPERATOR", "SEMICOLON", "COMMA", 
		"LPAREN", "RPAREN", "NUMBER", "STRING", "ASTERIX", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\5\nU\n\n\3"+
		"\13\3\13\7\13Y\n\13\f\13\16\13\\\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"e\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\5\21p\n\21\3\21\6\21"+
		"s\n\21\r\21\16\21t\3\21\3\21\6\21y\n\21\r\21\16\21z\5\21}\n\21\3\22\3"+
		"\22\7\22\u0081\n\22\f\22\16\22\u0084\13\22\3\22\3\22\3\23\3\23\3\24\6"+
		"\24\u008b\n\24\r\24\16\24\u008c\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		"\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2))\5\2\13\f\17\17\"\"\u009a"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\60\3\2\2\2\7\65\3\2\2\2\t;\3"+
		"\2\2\2\13C\3\2\2\2\rH\3\2\2\2\17K\3\2\2\2\21O\3\2\2\2\23T\3\2\2\2\25V"+
		"\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37l\3\2\2\2!"+
		"o\3\2\2\2#~\3\2\2\2%\u0087\3\2\2\2\'\u008a\3\2\2\2)*\7U\2\2*+\7G\2\2+"+
		",\7N\2\2,-\7G\2\2-.\7E\2\2./\7V\2\2/\4\3\2\2\2\60\61\7H\2\2\61\62\7T\2"+
		"\2\62\63\7Q\2\2\63\64\7O\2\2\64\6\3\2\2\2\65\66\7Y\2\2\66\67\7J\2\2\67"+
		"8\7G\2\289\7T\2\29:\7G\2\2:\b\3\2\2\2;<\7D\2\2<=\7G\2\2=>\7V\2\2>?\7Y"+
		"\2\2?@\7G\2\2@A\7G\2\2AB\7P\2\2B\n\3\2\2\2CD\7N\2\2DE\7K\2\2EF\7M\2\2"+
		"FG\7G\2\2G\f\3\2\2\2HI\7K\2\2IJ\7P\2\2J\16\3\2\2\2KL\7C\2\2LM\7P\2\2M"+
		"N\7F\2\2N\20\3\2\2\2OP\7Q\2\2PQ\7T\2\2Q\22\3\2\2\2RU\5\17\b\2SU\5\21\t"+
		"\2TR\3\2\2\2TS\3\2\2\2U\24\3\2\2\2VZ\t\2\2\2WY\t\3\2\2XW\3\2\2\2Y\\\3"+
		"\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\26\3\2\2\2\\Z\3\2\2\2]e\4>@\2^_\7@\2\2_e\7"+
		"?\2\2`a\7>\2\2ae\7?\2\2bc\7>\2\2ce\7@\2\2d]\3\2\2\2d^\3\2\2\2d`\3\2\2"+
		"\2db\3\2\2\2e\30\3\2\2\2fg\7=\2\2g\32\3\2\2\2hi\7.\2\2i\34\3\2\2\2jk\7"+
		"*\2\2k\36\3\2\2\2lm\7+\2\2m \3\2\2\2np\7/\2\2on\3\2\2\2op\3\2\2\2pr\3"+
		"\2\2\2qs\t\4\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u|\3\2\2\2vx\7"+
		"\60\2\2wy\t\4\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|v"+
		"\3\2\2\2|}\3\2\2\2}\"\3\2\2\2~\u0082\7)\2\2\177\u0081\n\5\2\2\u0080\177"+
		"\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7)\2\2\u0086$\3\2\2\2\u0087"+
		"\u0088\7,\2\2\u0088&\3\2\2\2\u0089\u008b\t\6\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\b\24\2\2\u008f(\3\2\2\2\f\2TZdotz|\u0082\u008c\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}