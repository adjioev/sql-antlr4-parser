// Generated from SqlParser.g4 by ANTLR 4.5.3
package com.ecwid.antlrparser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, BETWEEN=4, LIKE=5, IN=6, AND=7, OR=8, NOT=9, 
		LIMIT=10, OFFSET=11, LOGICAL_OPERATOR=12, IDENTIFIER=13, COMP_OPERATOR=14, 
		SEMICOLON=15, DOT=16, COMMA=17, LPAREN=18, RPAREN=19, NUMBER=20, STRING=21, 
		ASTERIX=22, WS=23;
	public static final int
		RULE_statement = 0, RULE_select = 1, RULE_limitClause = 2, RULE_offsetClause = 3, 
		RULE_selectElements = 4, RULE_columnName = 5, RULE_tableName = 6, RULE_logicalOperator = 7, 
		RULE_orExpression = 8, RULE_andExpression = 9, RULE_unaryExpression = 10, 
		RULE_primaryExpression = 11, RULE_whereClause = 12, RULE_whereValue = 13, 
		RULE_whereValueList = 14;
	public static final String[] ruleNames = {
		"statement", "select", "limitClause", "offsetClause", "selectElements", 
		"columnName", "tableName", "logicalOperator", "orExpression", "andExpression", 
		"unaryExpression", "primaryExpression", "whereClause", "whereValue", "whereValueList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'FROM'", "'WHERE'", "'BETWEEN'", "'LIKE'", "'IN'", 
		"'AND'", "'OR'", "'NOT'", "'LIMIT'", "'OFFSET'", null, null, null, "';'", 
		"'.'", "','", "'('", "')'", null, null, "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "BETWEEN", "LIKE", "IN", "AND", "OR", 
		"NOT", "LIMIT", "OFFSET", "LOGICAL_OPERATOR", "IDENTIFIER", "COMP_OPERATOR", 
		"SEMICOLON", "DOT", "COMMA", "LPAREN", "RPAREN", "NUMBER", "STRING", "ASTERIX", 
		"WS"
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

	@Override
	public String getGrammarFileName() { return "SqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(SELECT);
			setState(33);
			selectElements();
			setState(34);
			match(FROM);
			setState(35);
			tableName();
			setState(38);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(36);
				match(WHERE);
				setState(37);
				orExpression(0);
				}
			}

			setState(41);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(40);
				limitClause();
				}
			}

			setState(44);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(43);
				offsetClause();
				}
			}

			setState(47);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(46);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SqlParser.LIMIT, 0); }
		public TerminalNode NUMBER() { return getToken(SqlParser.NUMBER, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(LIMIT);
			setState(50);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetClauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(SqlParser.OFFSET, 0); }
		public TerminalNode NUMBER() { return getToken(SqlParser.NUMBER, 0); }
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterOffsetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitOffsetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitOffsetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(OFFSET);
			setState(53);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectElementsContext extends ParserRuleContext {
		public TerminalNode ASTERIX() { return getToken(SqlParser.ASTERIX, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSelectElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSelectElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSelectElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectElements);
		int _la;
		try {
			setState(64);
			switch (_input.LA(1)) {
			case ASTERIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(ASTERIX);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				columnName();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(57);
					match(COMMA);
					setState(58);
					columnName();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columnName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(IDENTIFIER);
			setState(69);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(67);
				match(DOT);
				setState(68);
				match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
	 
		public OrExpressionContext() { }
		public void copyFrom(OrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrOperationContext extends OrExpressionContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlParser.OR, 0); }
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrOperationContext(OrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterOrOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitOrOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitOrOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionInOrContext extends OrExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionInOrContext(OrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterAndExpressionInOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitAndExpressionInOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitAndExpressionInOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		return orExpression(0);
	}

	private OrExpressionContext orExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, _parentState);
		OrExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndExpressionInOrContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(76);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrOperationContext(new OrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(78);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(79);
					match(OR);
					setState(80);
					andExpression(0);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	 
		public AndExpressionContext() { }
		public void copyFrom(AndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExpressionInAndContext extends AndExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionInAndContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterUnaryExpressionInAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitUnaryExpressionInAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitUnaryExpressionInAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOperationContext extends AndExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AndOperationContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterAndOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitAndOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitAndOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnaryExpressionInAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(87);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOperationContext(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(89);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(90);
					match(AND);
					setState(91);
					unaryExpression();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotOperationContext extends UnaryExpressionContext {
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public NotOperationContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterNotOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitNotOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitNotOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExprContext extends UnaryExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimaryExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unaryExpression);
		try {
			setState(100);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(NOT);
				setState(98);
				unaryExpression();
				}
				break;
			case IDENTIFIER:
			case LPAREN:
				_localctx = new PrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				primaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleConditionContext extends PrimaryExpressionContext {
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SimpleConditionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSimpleCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSimpleCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedExprContext extends PrimaryExpressionContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public NestedExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterNestedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitNestedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitNestedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primaryExpression);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new NestedExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(LPAREN);
				setState(103);
				orExpression(0);
				setState(104);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				_localctx = new SimpleConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				whereClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	 
		public WhereClauseContext() { }
		public void copyFrom(WhereClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonConditionContext extends WhereClauseContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode COMP_OPERATOR() { return getToken(SqlParser.COMP_OPERATOR, 0); }
		public WhereValueContext whereValue() {
			return getRuleContext(WhereValueContext.class,0);
		}
		public ComparisonConditionContext(WhereClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterComparisonCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitComparisonCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitComparisonCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InConditionContext extends WhereClauseContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(SqlParser.IN, 0); }
		public WhereValueListContext whereValueList() {
			return getRuleContext(WhereValueListContext.class,0);
		}
		public InConditionContext(WhereClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterInCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitInCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitInCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeConditionContext extends WhereClauseContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode LIKE() { return getToken(SqlParser.LIKE, 0); }
		public WhereValueContext whereValue() {
			return getRuleContext(WhereValueContext.class,0);
		}
		public LikeConditionContext(WhereClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterLikeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitLikeCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitLikeCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenConditionContext extends WhereClauseContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlParser.BETWEEN, 0); }
		public List<WhereValueContext> whereValue() {
			return getRuleContexts(WhereValueContext.class);
		}
		public WhereValueContext whereValue(int i) {
			return getRuleContext(WhereValueContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public BetweenConditionContext(WhereClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterBetweenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitBetweenCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitBetweenCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whereClause);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ComparisonConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(IDENTIFIER);
				setState(110);
				match(COMP_OPERATOR);
				setState(111);
				whereValue();
				}
				break;
			case 2:
				_localctx = new LikeConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(IDENTIFIER);
				setState(113);
				match(LIKE);
				setState(114);
				whereValue();
				}
				break;
			case 3:
				_localctx = new BetweenConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(IDENTIFIER);
				setState(116);
				match(BETWEEN);
				setState(117);
				whereValue();
				setState(118);
				match(AND);
				setState(119);
				whereValue();
				}
				break;
			case 4:
				_localctx = new InConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(IDENTIFIER);
				setState(122);
				match(IN);
				setState(123);
				match(LPAREN);
				setState(124);
				whereValueList();
				setState(125);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SqlParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(SqlParser.STRING, 0); }
		public WhereValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterWhereValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitWhereValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitWhereValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereValueContext whereValue() throws RecognitionException {
		WhereValueContext _localctx = new WhereValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whereValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereValueListContext extends ParserRuleContext {
		public List<WhereValueContext> whereValue() {
			return getRuleContexts(WhereValueContext.class);
		}
		public WhereValueContext whereValue(int i) {
			return getRuleContext(WhereValueContext.class,i);
		}
		public WhereValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterWhereValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitWhereValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitWhereValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereValueListContext whereValueList() throws RecognitionException {
		WhereValueListContext _localctx = new WhereValueListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whereValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			whereValue();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				whereValue();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 9:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean orExpression_sempred(OrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u008e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3)\n\3\3\3\5\3,\n\3\3\3\5\3/\n\3\3\3\5\3\62\n\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\5\6C\n\6\3"+
		"\7\3\7\3\7\5\7H\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nT\n\n\f"+
		"\n\16\nW\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13_\n\13\f\13\16\13b\13"+
		"\13\3\f\3\f\3\f\5\fg\n\f\3\r\3\r\3\r\3\r\3\r\5\rn\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u0082\n\16\3\17\3\17\3\20\3\20\3\20\7\20\u0089\n\20\f\20\16\20"+
		"\u008c\13\20\3\20\2\4\22\24\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\4\3\2\t\n\4\2\17\17\26\27\u008d\2 \3\2\2\2\4\"\3\2\2\2\6\63\3\2\2\2"+
		"\b\66\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16I\3\2\2\2\20K\3\2\2\2\22M\3\2\2"+
		"\2\24X\3\2\2\2\26f\3\2\2\2\30m\3\2\2\2\32\u0081\3\2\2\2\34\u0083\3\2\2"+
		"\2\36\u0085\3\2\2\2 !\5\4\3\2!\3\3\2\2\2\"#\7\3\2\2#$\5\n\6\2$%\7\4\2"+
		"\2%(\5\16\b\2&\'\7\5\2\2\')\5\22\n\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\5"+
		"\6\4\2+*\3\2\2\2+,\3\2\2\2,.\3\2\2\2-/\5\b\5\2.-\3\2\2\2./\3\2\2\2/\61"+
		"\3\2\2\2\60\62\7\21\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\64"+
		"\7\f\2\2\64\65\7\26\2\2\65\7\3\2\2\2\66\67\7\r\2\2\678\7\26\2\28\t\3\2"+
		"\2\29C\7\30\2\2:?\5\f\7\2;<\7\23\2\2<>\5\f\7\2=;\3\2\2\2>A\3\2\2\2?=\3"+
		"\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2B9\3\2\2\2B:\3\2\2\2C\13\3\2\2\2D"+
		"G\7\17\2\2EF\7\22\2\2FH\7\17\2\2GE\3\2\2\2GH\3\2\2\2H\r\3\2\2\2IJ\7\17"+
		"\2\2J\17\3\2\2\2KL\t\2\2\2L\21\3\2\2\2MN\b\n\1\2NO\5\24\13\2OU\3\2\2\2"+
		"PQ\f\4\2\2QR\7\n\2\2RT\5\24\13\2SP\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2"+
		"\2V\23\3\2\2\2WU\3\2\2\2XY\b\13\1\2YZ\5\26\f\2Z`\3\2\2\2[\\\f\4\2\2\\"+
		"]\7\t\2\2]_\5\26\f\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\25\3\2\2"+
		"\2b`\3\2\2\2cd\7\13\2\2dg\5\26\f\2eg\5\30\r\2fc\3\2\2\2fe\3\2\2\2g\27"+
		"\3\2\2\2hi\7\24\2\2ij\5\22\n\2jk\7\25\2\2kn\3\2\2\2ln\5\32\16\2mh\3\2"+
		"\2\2ml\3\2\2\2n\31\3\2\2\2op\7\17\2\2pq\7\20\2\2q\u0082\5\34\17\2rs\7"+
		"\17\2\2st\7\7\2\2t\u0082\5\34\17\2uv\7\17\2\2vw\7\6\2\2wx\5\34\17\2xy"+
		"\7\t\2\2yz\5\34\17\2z\u0082\3\2\2\2{|\7\17\2\2|}\7\b\2\2}~\7\24\2\2~\177"+
		"\5\36\20\2\177\u0080\7\25\2\2\u0080\u0082\3\2\2\2\u0081o\3\2\2\2\u0081"+
		"r\3\2\2\2\u0081u\3\2\2\2\u0081{\3\2\2\2\u0082\33\3\2\2\2\u0083\u0084\t"+
		"\3\2\2\u0084\35\3\2\2\2\u0085\u008a\5\34\17\2\u0086\u0087\7\23\2\2\u0087"+
		"\u0089\5\34\17\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\37\3\2\2\2\u008c\u008a\3\2\2\2\17(+."+
		"\61?BGU`fm\u0081\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}