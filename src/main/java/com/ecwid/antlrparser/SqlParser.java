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
		SELECT=1, AS=2, FROM=3, WHERE=4, HAVING=5, BETWEEN=6, LIKE=7, IN=8, AND=9, 
		OR=10, NOT=11, LIMIT=12, OFFSET=13, ORDERBY=14, GROUPBY=15, ASC=16, DESC=17, 
		IS=18, NULL=19, JOIN=20, INNER=21, LEFT=22, RIGHT=23, FULL=24, OUTER=25, 
		ON=26, COUNT=27, SUM=28, AVG=29, MAX=30, MIN=31, LOGICAL_OPERATOR=32, 
		IDENTIFIER=33, COMP_OPERATOR=34, SEMICOLON=35, DOT=36, COMMA=37, LPAREN=38, 
		RPAREN=39, NUMBER=40, STRING=41, ASTERIX=42, WS=43;
	public static final int
		RULE_statement = 0, RULE_select = 1, RULE_groupColumn = 2, RULE_selectElements = 3, 
		RULE_selectElement = 4, RULE_alias = 5, RULE_expression = 6, RULE_functionCall = 7, 
		RULE_tableList = 8, RULE_tableElement = 9, RULE_tableSource = 10, RULE_tableName = 11, 
		RULE_joinClause = 12, RULE_joinType = 13, RULE_joinCondition = 14, RULE_joinElements = 15, 
		RULE_groupByClause = 16, RULE_havingOrExpression = 17, RULE_havingAndExpression = 18, 
		RULE_havingUnaryExpression = 19, RULE_havingPrimaryExpression = 20, RULE_havingColumn = 21, 
		RULE_havingClause = 22, RULE_havingValue = 23, RULE_havingValueList = 24, 
		RULE_orExpression = 25, RULE_andExpression = 26, RULE_unaryExpression = 27, 
		RULE_primaryExpression = 28, RULE_whereClause = 29, RULE_whereValue = 30, 
		RULE_whereValueList = 31, RULE_orderByClause = 32, RULE_orderColumn = 33, 
		RULE_order = 34, RULE_limitClause = 35, RULE_offsetClause = 36, RULE_aggregateFunction = 37;
	public static final String[] ruleNames = {
		"statement", "select", "groupColumn", "selectElements", "selectElement", 
		"alias", "expression", "functionCall", "tableList", "tableElement", "tableSource", 
		"tableName", "joinClause", "joinType", "joinCondition", "joinElements", 
		"groupByClause", "havingOrExpression", "havingAndExpression", "havingUnaryExpression", 
		"havingPrimaryExpression", "havingColumn", "havingClause", "havingValue", 
		"havingValueList", "orExpression", "andExpression", "unaryExpression", 
		"primaryExpression", "whereClause", "whereValue", "whereValueList", "orderByClause", 
		"orderColumn", "order", "limitClause", "offsetClause", "aggregateFunction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'AS'", "'FROM'", "'WHERE'", "'HAVING'", "'BETWEEN'", 
		"'LIKE'", "'IN'", "'AND'", "'OR'", "'NOT'", "'LIMIT'", "'OFFSET'", "'ORDER BY'", 
		"'GROUP BY'", "'ASC'", "'DESC'", "'IS'", "'NULL'", "'JOIN'", "'INNER'", 
		"'LEFT'", "'RIGHT'", "'FULL'", "'OUTER'", "'ON'", "'COUNT'", "'SUM'", 
		"'AVG'", "'MAX'", "'MIN'", null, null, null, "';'", "'.'", "','", "'('", 
		"')'", null, null, "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "AS", "FROM", "WHERE", "HAVING", "BETWEEN", "LIKE", "IN", 
		"AND", "OR", "NOT", "LIMIT", "OFFSET", "ORDERBY", "GROUPBY", "ASC", "DESC", 
		"IS", "NULL", "JOIN", "INNER", "LEFT", "RIGHT", "FULL", "OUTER", "ON", 
		"COUNT", "SUM", "AVG", "MAX", "MIN", "LOGICAL_OPERATOR", "IDENTIFIER", 
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
			setState(76);
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
		public TableListContext tableList() {
			return getRuleContext(TableListContext.class,0);
		}
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode GROUPBY() { return getToken(SqlParser.GROUPBY, 0); }
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlParser.HAVING, 0); }
		public HavingOrExpressionContext havingOrExpression() {
			return getRuleContext(HavingOrExpressionContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
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
			setState(78);
			match(SELECT);
			setState(79);
			selectElements();
			setState(80);
			match(FROM);
			setState(81);
			tableList();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INNER) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
				{
				{
				setState(82);
				joinClause();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(88);
				match(WHERE);
				setState(89);
				orExpression(0);
				}
			}

			setState(94);
			_la = _input.LA(1);
			if (_la==GROUPBY) {
				{
				setState(92);
				match(GROUPBY);
				setState(93);
				groupByClause();
				}
			}

			setState(98);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(96);
				match(HAVING);
				setState(97);
				havingOrExpression(0);
				}
			}

			setState(101);
			_la = _input.LA(1);
			if (_la==ORDERBY) {
				{
				setState(100);
				orderByClause();
				}
			}

			setState(104);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(103);
				limitClause();
				}
			}

			setState(107);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(106);
				offsetClause();
				}
			}

			setState(110);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(109);
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

	public static class GroupColumnContext extends ParserRuleContext {
		public GroupColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupColumn; }
	 
		public GroupColumnContext() { }
		public void copyFrom(GroupColumnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GroupByQualifiedColumnNameContext extends GroupColumnContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public GroupByQualifiedColumnNameContext(GroupColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterGroupByQualifiedColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitGroupByQualifiedColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitGroupByQualifiedColumnName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupByColumnNameContext extends GroupColumnContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public GroupByColumnNameContext(GroupColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterGroupByColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitGroupByColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitGroupByColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupColumnContext groupColumn() throws RecognitionException {
		GroupColumnContext _localctx = new GroupColumnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_groupColumn);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new GroupByColumnNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new GroupByQualifiedColumnNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(IDENTIFIER);
				setState(114);
				match(DOT);
				setState(115);
				match(IDENTIFIER);
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

	public static class SelectElementsContext extends ParserRuleContext {
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
	 
		public SelectElementsContext() { }
		public void copyFrom(SelectElementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectListContext extends SelectElementsContext {
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public SelectListContext(SelectElementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsteriskSelectContext extends SelectElementsContext {
		public TerminalNode ASTERIX() { return getToken(SqlParser.ASTERIX, 0); }
		public AsteriskSelectContext(SelectElementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterAsteriskSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitAsteriskSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitAsteriskSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectElements);
		try {
			int _alt;
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AsteriskSelectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(ASTERIX);
				}
				break;
			case 2:
				_localctx = new SelectListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				selectElement();
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(120);
						match(COMMA);
						setState(121);
						selectElement();
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
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

	public static class SelectElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSelectElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSelectElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSelectElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			expression();
			setState(134);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER) {
				{
				setState(131);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(130);
					match(AS);
					}
				}

				setState(133);
				alias();
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsteriskExprContext extends ExpressionContext {
		public TerminalNode ASTERIX() { return getToken(SqlParser.ASTERIX, 0); }
		public AsteriskExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterAsteriskExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitAsteriskExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitAsteriskExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExprContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QualifiedColumnNameExprContext extends ExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public QualifiedColumnNameExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterQualifiedColumnNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitQualifiedColumnNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitQualifiedColumnNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableAsteriskExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode ASTERIX() { return getToken(SqlParser.ASTERIX, 0); }
		public TableAsteriskExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTableAsteriskExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTableAsteriskExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTableAsteriskExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnNameExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public ColumnNameExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterColumnNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitColumnNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitColumnNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ColumnNameExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new AsteriskExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(ASTERIX);
				}
				break;
			case 3:
				_localctx = new QualifiedColumnNameExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(IDENTIFIER);
				setState(141);
				match(DOT);
				setState(142);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new TableAsteriskExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(IDENTIFIER);
				setState(144);
				match(DOT);
				setState(145);
				match(ASTERIX);
				}
				break;
			case 5:
				_localctx = new FunctionCallExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				functionCall();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			aggregateFunction();
			setState(150);
			match(LPAREN);
			setState(159);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COUNT) | (1L << SUM) | (1L << AVG) | (1L << MAX) | (1L << MIN) | (1L << IDENTIFIER) | (1L << ASTERIX))) != 0)) {
				{
				setState(151);
				expression();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(152);
					match(COMMA);
					setState(153);
					expression();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(161);
			match(RPAREN);
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

	public static class TableListContext extends ParserRuleContext {
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTableList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTableList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableListContext tableList() throws RecognitionException {
		TableListContext _localctx = new TableListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			tableElement();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(164);
				match(COMMA);
				setState(165);
				tableElement();
				}
				}
				setState(170);
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

	public static class TableElementContext extends ParserRuleContext {
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			tableSource();
			setState(176);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER) {
				{
				setState(173);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(172);
					match(AS);
					}
				}

				setState(175);
				alias();
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

	public static class TableSourceContext extends ParserRuleContext {
		public TableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSource; }
	 
		public TableSourceContext() { }
		public void copyFrom(TableSourceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableNameSourceContext extends TableSourceContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableNameSourceContext(TableSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTableNameSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTableNameSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTableNameSource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubquerySourceContext extends TableSourceContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public SubquerySourceContext(TableSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSubquerySource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSubquerySource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSubquerySource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSourceContext tableSource() throws RecognitionException {
		TableSourceContext _localctx = new TableSourceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tableSource);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new TableNameSourceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				tableName();
				}
				break;
			case LPAREN:
				_localctx = new SubquerySourceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(LPAREN);
				setState(180);
				select();
				setState(181);
				match(RPAREN);
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
		enterRule(_localctx, 22, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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

	public static class JoinClauseContext extends ParserRuleContext {
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlParser.ON, 0); }
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_joinClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			joinType();
			setState(188);
			tableName();
			setState(189);
			match(ON);
			setState(190);
			joinCondition();
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlParser.INNER, 0); }
		public TerminalNode JOIN() { return getToken(SqlParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(SqlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(SqlParser.OUTER, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_joinType);
		try {
			setState(201);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(INNER);
				setState(193);
				match(JOIN);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(LEFT);
				setState(195);
				match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(RIGHT);
				setState(197);
				match(JOIN);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(FULL);
				setState(199);
				match(OUTER);
				setState(200);
				match(JOIN);
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

	public static class JoinConditionContext extends ParserRuleContext {
		public List<JoinElementsContext> joinElements() {
			return getRuleContexts(JoinElementsContext.class);
		}
		public JoinElementsContext joinElements(int i) {
			return getRuleContext(JoinElementsContext.class,i);
		}
		public TerminalNode COMP_OPERATOR() { return getToken(SqlParser.COMP_OPERATOR, 0); }
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterJoinCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitJoinCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitJoinCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_joinCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			joinElements();
			setState(204);
			match(COMP_OPERATOR);
			setState(205);
			joinElements();
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

	public static class JoinElementsContext extends ParserRuleContext {
		public List<SelectElementsContext> selectElements() {
			return getRuleContexts(SelectElementsContext.class);
		}
		public SelectElementsContext selectElements(int i) {
			return getRuleContext(SelectElementsContext.class,i);
		}
		public JoinElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterJoinElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitJoinElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitJoinElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinElementsContext joinElements() throws RecognitionException {
		JoinElementsContext _localctx = new JoinElementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_joinElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			selectElements();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(208);
				match(COMMA);
				setState(209);
				selectElements();
				}
				}
				setState(214);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public List<GroupColumnContext> groupColumn() {
			return getRuleContexts(GroupColumnContext.class);
		}
		public GroupColumnContext groupColumn(int i) {
			return getRuleContext(GroupColumnContext.class,i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			groupColumn();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216);
				match(COMMA);
				setState(217);
				groupColumn();
				}
				}
				setState(222);
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

	public static class HavingOrExpressionContext extends ParserRuleContext {
		public HavingOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingOrExpression; }
	 
		public HavingOrExpressionContext() { }
		public void copyFrom(HavingOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HavingAndExpressionInOrContext extends HavingOrExpressionContext {
		public HavingAndExpressionContext havingAndExpression() {
			return getRuleContext(HavingAndExpressionContext.class,0);
		}
		public HavingAndExpressionInOrContext(HavingOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingAndExpressionInOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingAndExpressionInOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingAndExpressionInOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HavingOrOperationContext extends HavingOrExpressionContext {
		public HavingOrExpressionContext havingOrExpression() {
			return getRuleContext(HavingOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlParser.OR, 0); }
		public HavingAndExpressionContext havingAndExpression() {
			return getRuleContext(HavingAndExpressionContext.class,0);
		}
		public HavingOrOperationContext(HavingOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingOrOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingOrOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingOrOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingOrExpressionContext havingOrExpression() throws RecognitionException {
		return havingOrExpression(0);
	}

	private HavingOrExpressionContext havingOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		HavingOrExpressionContext _localctx = new HavingOrExpressionContext(_ctx, _parentState);
		HavingOrExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_havingOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new HavingAndExpressionInOrContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(224);
			havingAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new HavingOrOperationContext(new HavingOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_havingOrExpression);
					setState(226);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(227);
					match(OR);
					setState(228);
					havingAndExpression(0);
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class HavingAndExpressionContext extends ParserRuleContext {
		public HavingAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingAndExpression; }
	 
		public HavingAndExpressionContext() { }
		public void copyFrom(HavingAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HavingAndOperationContext extends HavingAndExpressionContext {
		public HavingAndExpressionContext havingAndExpression() {
			return getRuleContext(HavingAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public HavingUnaryExpressionContext havingUnaryExpression() {
			return getRuleContext(HavingUnaryExpressionContext.class,0);
		}
		public HavingAndOperationContext(HavingAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingAndOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingAndOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingAndOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HavingUnaryExpressionInAndContext extends HavingAndExpressionContext {
		public HavingUnaryExpressionContext havingUnaryExpression() {
			return getRuleContext(HavingUnaryExpressionContext.class,0);
		}
		public HavingUnaryExpressionInAndContext(HavingAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingUnaryExpressionInAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingUnaryExpressionInAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingUnaryExpressionInAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingAndExpressionContext havingAndExpression() throws RecognitionException {
		return havingAndExpression(0);
	}

	private HavingAndExpressionContext havingAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		HavingAndExpressionContext _localctx = new HavingAndExpressionContext(_ctx, _parentState);
		HavingAndExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_havingAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new HavingUnaryExpressionInAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(235);
			havingUnaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new HavingAndOperationContext(new HavingAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_havingAndExpression);
					setState(237);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(238);
					match(AND);
					setState(239);
					havingUnaryExpression();
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class HavingUnaryExpressionContext extends ParserRuleContext {
		public HavingUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingUnaryExpression; }
	 
		public HavingUnaryExpressionContext() { }
		public void copyFrom(HavingUnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HavingNotOperationContext extends HavingUnaryExpressionContext {
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public HavingUnaryExpressionContext havingUnaryExpression() {
			return getRuleContext(HavingUnaryExpressionContext.class,0);
		}
		public HavingNotOperationContext(HavingUnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingNotOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingNotOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingNotOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HavingPrimaryExprContext extends HavingUnaryExpressionContext {
		public HavingPrimaryExpressionContext havingPrimaryExpression() {
			return getRuleContext(HavingPrimaryExpressionContext.class,0);
		}
		public HavingPrimaryExprContext(HavingUnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingUnaryExpressionContext havingUnaryExpression() throws RecognitionException {
		HavingUnaryExpressionContext _localctx = new HavingUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_havingUnaryExpression);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new HavingNotOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(NOT);
				setState(246);
				havingUnaryExpression();
				}
				break;
			case COUNT:
			case SUM:
			case AVG:
			case MAX:
			case MIN:
			case LPAREN:
				_localctx = new HavingPrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				havingPrimaryExpression();
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

	public static class HavingPrimaryExpressionContext extends ParserRuleContext {
		public HavingPrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingPrimaryExpression; }
	 
		public HavingPrimaryExpressionContext() { }
		public void copyFrom(HavingPrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HavingNestedExprContext extends HavingPrimaryExpressionContext {
		public HavingOrExpressionContext havingOrExpression() {
			return getRuleContext(HavingOrExpressionContext.class,0);
		}
		public HavingNestedExprContext(HavingPrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingNestedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingNestedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingNestedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HavingSimpleConditionContext extends HavingPrimaryExpressionContext {
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public HavingSimpleConditionContext(HavingPrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingSimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingSimpleCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingSimpleCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingPrimaryExpressionContext havingPrimaryExpression() throws RecognitionException {
		HavingPrimaryExpressionContext _localctx = new HavingPrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_havingPrimaryExpression);
		try {
			setState(255);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new HavingNestedExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(LPAREN);
				setState(251);
				havingOrExpression(0);
				setState(252);
				match(RPAREN);
				}
				break;
			case COUNT:
			case SUM:
			case AVG:
			case MAX:
			case MIN:
				_localctx = new HavingSimpleConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				havingClause();
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

	public static class HavingColumnContext extends ParserRuleContext {
		public HavingColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingColumn; }
	 
		public HavingColumnContext() { }
		public void copyFrom(HavingColumnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HavingQualifiedColumnNameContext extends HavingColumnContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public HavingQualifiedColumnNameContext(HavingColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingQualifiedColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingQualifiedColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingQualifiedColumnName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HavingAsteriskContext extends HavingColumnContext {
		public TerminalNode ASTERIX() { return getToken(SqlParser.ASTERIX, 0); }
		public HavingAsteriskContext(HavingColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingAsterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HavingColumnNameContext extends HavingColumnContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public HavingColumnNameContext(HavingColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingColumnContext havingColumn() throws RecognitionException {
		HavingColumnContext _localctx = new HavingColumnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_havingColumn);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new HavingAsteriskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(ASTERIX);
				}
				break;
			case 2:
				_localctx = new HavingColumnNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new HavingQualifiedColumnNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(IDENTIFIER);
				setState(260);
				match(DOT);
				setState(261);
				match(IDENTIFIER);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	 
		public HavingClauseContext() { }
		public void copyFrom(HavingClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HavingIsNullConditionContext extends HavingClauseContext {
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public HavingColumnContext havingColumn() {
			return getRuleContext(HavingColumnContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public HavingIsNullConditionContext(HavingClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingIsNullCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingIsNullCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingIsNullCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HavingComparisonConditionContext extends HavingClauseContext {
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public HavingColumnContext havingColumn() {
			return getRuleContext(HavingColumnContext.class,0);
		}
		public TerminalNode COMP_OPERATOR() { return getToken(SqlParser.COMP_OPERATOR, 0); }
		public HavingValueContext havingValue() {
			return getRuleContext(HavingValueContext.class,0);
		}
		public HavingComparisonConditionContext(HavingClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingComparisonCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingComparisonCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingComparisonCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HavingBetweenConditionContext extends HavingClauseContext {
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public HavingColumnContext havingColumn() {
			return getRuleContext(HavingColumnContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(SqlParser.BETWEEN, 0); }
		public List<HavingValueContext> havingValue() {
			return getRuleContexts(HavingValueContext.class);
		}
		public HavingValueContext havingValue(int i) {
			return getRuleContext(HavingValueContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public HavingBetweenConditionContext(HavingClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingBetweenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingBetweenCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingBetweenCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HavingLikeConditionContext extends HavingClauseContext {
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public HavingColumnContext havingColumn() {
			return getRuleContext(HavingColumnContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlParser.LIKE, 0); }
		public HavingValueContext havingValue() {
			return getRuleContext(HavingValueContext.class,0);
		}
		public HavingLikeConditionContext(HavingClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingLikeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingLikeCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingLikeCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HavingInConditionContext extends HavingClauseContext {
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public HavingColumnContext havingColumn() {
			return getRuleContext(HavingColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlParser.IN, 0); }
		public HavingValueListContext havingValueList() {
			return getRuleContext(HavingValueListContext.class,0);
		}
		public HavingInConditionContext(HavingClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingInCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingInCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingInCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_havingClause);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new HavingIsNullConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				aggregateFunction();
				setState(265);
				match(LPAREN);
				setState(266);
				havingColumn();
				setState(267);
				match(RPAREN);
				setState(268);
				match(IS);
				setState(270);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(269);
					match(NOT);
					}
				}

				setState(272);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new HavingComparisonConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				aggregateFunction();
				setState(275);
				match(LPAREN);
				setState(276);
				havingColumn();
				setState(277);
				match(RPAREN);
				setState(278);
				match(COMP_OPERATOR);
				setState(279);
				havingValue();
				}
				break;
			case 3:
				_localctx = new HavingLikeConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				aggregateFunction();
				setState(282);
				match(LPAREN);
				setState(283);
				havingColumn();
				setState(284);
				match(RPAREN);
				setState(285);
				match(LIKE);
				setState(286);
				havingValue();
				}
				break;
			case 4:
				_localctx = new HavingBetweenConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				aggregateFunction();
				setState(289);
				match(LPAREN);
				setState(290);
				havingColumn();
				setState(291);
				match(RPAREN);
				setState(292);
				match(BETWEEN);
				setState(293);
				havingValue();
				setState(294);
				match(AND);
				setState(295);
				havingValue();
				}
				break;
			case 5:
				_localctx = new HavingInConditionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				aggregateFunction();
				setState(298);
				match(LPAREN);
				setState(299);
				havingColumn();
				setState(300);
				match(RPAREN);
				setState(301);
				match(IN);
				setState(302);
				match(LPAREN);
				setState(303);
				havingValueList();
				setState(304);
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

	public static class HavingValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SqlParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(SqlParser.STRING, 0); }
		public HavingValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingValueContext havingValue() throws RecognitionException {
		HavingValueContext _localctx = new HavingValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_havingValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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

	public static class HavingValueListContext extends ParserRuleContext {
		public List<HavingValueContext> havingValue() {
			return getRuleContexts(HavingValueContext.class);
		}
		public HavingValueContext havingValue(int i) {
			return getRuleContext(HavingValueContext.class,i);
		}
		public HavingValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingValueListContext havingValueList() throws RecognitionException {
		HavingValueListContext _localctx = new HavingValueListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_havingValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			havingValue();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(311);
				match(COMMA);
				setState(312);
				havingValue();
				}
				}
				setState(317);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndExpressionInOrContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(319);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrOperationContext(new OrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(321);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(322);
					match(OR);
					setState(323);
					andExpression(0);
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnaryExpressionInAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(330);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOperationContext(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(332);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(333);
					match(AND);
					setState(334);
					unaryExpression();
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 54, RULE_unaryExpression);
		try {
			setState(343);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(NOT);
				setState(341);
				unaryExpression();
				}
				break;
			case IDENTIFIER:
			case LPAREN:
				_localctx = new PrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
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
		enterRule(_localctx, 56, RULE_primaryExpression);
		try {
			setState(350);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new NestedExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(LPAREN);
				setState(346);
				orExpression(0);
				setState(347);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				_localctx = new SimpleConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
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
	public static class IsNullConditionContext extends WhereClauseContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(SqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public IsNullConditionContext(WhereClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterIsNullCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitIsNullCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitIsNullCondition(this);
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
		enterRule(_localctx, 58, RULE_whereClause);
		int _la;
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new IsNullConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(IDENTIFIER);
				setState(353);
				match(IS);
				setState(355);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(354);
					match(NOT);
					}
				}

				setState(357);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new ComparisonConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(IDENTIFIER);
				setState(359);
				match(COMP_OPERATOR);
				setState(360);
				whereValue();
				}
				break;
			case 3:
				_localctx = new LikeConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(IDENTIFIER);
				setState(362);
				match(LIKE);
				setState(363);
				whereValue();
				}
				break;
			case 4:
				_localctx = new BetweenConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				match(IDENTIFIER);
				setState(365);
				match(BETWEEN);
				setState(366);
				whereValue();
				setState(367);
				match(AND);
				setState(368);
				whereValue();
				}
				break;
			case 5:
				_localctx = new InConditionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(370);
				match(IDENTIFIER);
				setState(371);
				match(IN);
				setState(372);
				match(LPAREN);
				setState(373);
				whereValueList();
				setState(374);
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
		enterRule(_localctx, 60, RULE_whereValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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
		enterRule(_localctx, 62, RULE_whereValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			whereValue();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(381);
				match(COMMA);
				setState(382);
				whereValue();
				}
				}
				setState(387);
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDERBY() { return getToken(SqlParser.ORDERBY, 0); }
		public List<OrderColumnContext> orderColumn() {
			return getRuleContexts(OrderColumnContext.class);
		}
		public OrderColumnContext orderColumn(int i) {
			return getRuleContext(OrderColumnContext.class,i);
		}
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(ORDERBY);
			setState(389);
			orderColumn();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390);
				match(COMMA);
				setState(391);
				orderColumn();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(397);
				order();
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

	public static class OrderColumnContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public OrderColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterOrderColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitOrderColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitOrderColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderColumnContext orderColumn() throws RecognitionException {
		OrderColumnContext _localctx = new OrderColumnContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_orderColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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

	public static class OrderContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(SqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlParser.DESC, 0); }
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
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
		enterRule(_localctx, 70, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(LIMIT);
			setState(405);
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
		enterRule(_localctx, 72, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(OFFSET);
			setState(408);
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

	public static class AggregateFunctionContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(SqlParser.COUNT, 0); }
		public TerminalNode SUM() { return getToken(SqlParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(SqlParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(SqlParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SqlParser.MAX, 0); }
		public AggregateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitAggregateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitAggregateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateFunctionContext aggregateFunction() throws RecognitionException {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_aggregateFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COUNT) | (1L << SUM) | (1L << AVG) | (1L << MAX) | (1L << MIN))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return havingOrExpression_sempred((HavingOrExpressionContext)_localctx, predIndex);
		case 18:
			return havingAndExpression_sempred((HavingAndExpressionContext)_localctx, predIndex);
		case 25:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 26:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean havingOrExpression_sempred(HavingOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean havingAndExpression_sempred(HavingAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean orExpression_sempred(OrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u019f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\7\3V\n\3\f\3\16\3Y\13\3\3\3\3\3\5\3]\n\3\3\3\3\3\5\3a\n\3\3\3\3\3\5"+
		"\3e\n\3\3\3\5\3h\n\3\3\3\5\3k\n\3\3\3\5\3n\n\3\3\3\5\3q\n\3\3\4\3\4\3"+
		"\4\3\4\5\4w\n\4\3\5\3\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\5\5\u0082"+
		"\n\5\3\6\3\6\5\6\u0086\n\6\3\6\5\6\u0089\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u0096\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u009d\n\t\f\t"+
		"\16\t\u00a0\13\t\5\t\u00a2\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u00a9\n\n\f\n\16"+
		"\n\u00ac\13\n\3\13\3\13\5\13\u00b0\n\13\3\13\5\13\u00b3\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00ba\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cc\n\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\7\21\u00d5\n\21\f\21\16\21\u00d8\13\21\3\22\3\22\3\22"+
		"\7\22\u00dd\n\22\f\22\16\22\u00e0\13\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u00e8\n\23\f\23\16\23\u00eb\13\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u00f3\n\24\f\24\16\24\u00f6\13\24\3\25\3\25\3\25\5\25\u00fb\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0102\n\26\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0109\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0111\n\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\5\30\u0135\n\30\3\31\3\31\3\32\3\32\3\32\7\32\u013c"+
		"\n\32\f\32\16\32\u013f\13\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0147"+
		"\n\33\f\33\16\33\u014a\13\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0152"+
		"\n\34\f\34\16\34\u0155\13\34\3\35\3\35\3\35\5\35\u015a\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0161\n\36\3\37\3\37\3\37\5\37\u0166\n\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u017b\n\37\3 \3 \3!\3!\3!\7!\u0182\n!\f!\16!\u0185"+
		"\13!\3\"\3\"\3\"\3\"\7\"\u018b\n\"\f\"\16\"\u018e\13\"\3\"\5\"\u0191\n"+
		"\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\2\6$&\64\66(\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\5\4\2##"+
		"*+\3\2\22\23\3\2\35!\u01ac\2N\3\2\2\2\4P\3\2\2\2\6v\3\2\2\2\b\u0081\3"+
		"\2\2\2\n\u0083\3\2\2\2\f\u008a\3\2\2\2\16\u0095\3\2\2\2\20\u0097\3\2\2"+
		"\2\22\u00a5\3\2\2\2\24\u00ad\3\2\2\2\26\u00b9\3\2\2\2\30\u00bb\3\2\2\2"+
		"\32\u00bd\3\2\2\2\34\u00cb\3\2\2\2\36\u00cd\3\2\2\2 \u00d1\3\2\2\2\"\u00d9"+
		"\3\2\2\2$\u00e1\3\2\2\2&\u00ec\3\2\2\2(\u00fa\3\2\2\2*\u0101\3\2\2\2,"+
		"\u0108\3\2\2\2.\u0134\3\2\2\2\60\u0136\3\2\2\2\62\u0138\3\2\2\2\64\u0140"+
		"\3\2\2\2\66\u014b\3\2\2\28\u0159\3\2\2\2:\u0160\3\2\2\2<\u017a\3\2\2\2"+
		">\u017c\3\2\2\2@\u017e\3\2\2\2B\u0186\3\2\2\2D\u0192\3\2\2\2F\u0194\3"+
		"\2\2\2H\u0196\3\2\2\2J\u0199\3\2\2\2L\u019c\3\2\2\2NO\5\4\3\2O\3\3\2\2"+
		"\2PQ\7\3\2\2QR\5\b\5\2RS\7\5\2\2SW\5\22\n\2TV\5\32\16\2UT\3\2\2\2VY\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2X\\\3\2\2\2YW\3\2\2\2Z[\7\6\2\2[]\5\64\33\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^_\7\21\2\2_a\5\"\22\2`^\3\2\2\2`a\3\2"+
		"\2\2ad\3\2\2\2bc\7\7\2\2ce\5$\23\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\5B"+
		"\"\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\5H%\2ji\3\2\2\2jk\3\2\2\2km\3\2\2"+
		"\2ln\5J&\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oq\7%\2\2po\3\2\2\2pq\3\2\2\2"+
		"q\5\3\2\2\2rw\7#\2\2st\7#\2\2tu\7&\2\2uw\7#\2\2vr\3\2\2\2vs\3\2\2\2w\7"+
		"\3\2\2\2x\u0082\7,\2\2y~\5\n\6\2z{\7\'\2\2{}\5\n\6\2|z\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"x\3\2\2\2\u0081y\3\2\2\2\u0082\t\3\2\2\2\u0083\u0088\5\16\b\2\u0084\u0086"+
		"\7\4\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\5\f\7\2\u0088\u0085\3\2\2\2\u0088\u0089\3\2\2\2\u0089\13\3\2\2"+
		"\2\u008a\u008b\7#\2\2\u008b\r\3\2\2\2\u008c\u0096\7#\2\2\u008d\u0096\7"+
		",\2\2\u008e\u008f\7#\2\2\u008f\u0090\7&\2\2\u0090\u0096\7#\2\2\u0091\u0092"+
		"\7#\2\2\u0092\u0093\7&\2\2\u0093\u0096\7,\2\2\u0094\u0096\5\20\t\2\u0095"+
		"\u008c\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u0091\3\2"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\17\3\2\2\2\u0097\u0098\5L\'\2\u0098\u00a1"+
		"\7(\2\2\u0099\u009e\5\16\b\2\u009a\u009b\7\'\2\2\u009b\u009d\5\16\b\2"+
		"\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7)\2\2\u00a4\21\3\2\2\2"+
		"\u00a5\u00aa\5\24\13\2\u00a6\u00a7\7\'\2\2\u00a7\u00a9\5\24\13\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\23\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b2\5\26\f\2\u00ae\u00b0"+
		"\7\4\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\5\f\7\2\u00b2\u00af\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\25\3\2\2"+
		"\2\u00b4\u00ba\5\30\r\2\u00b5\u00b6\7(\2\2\u00b6\u00b7\5\4\3\2\u00b7\u00b8"+
		"\7)\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba"+
		"\27\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc\31\3\2\2\2\u00bd\u00be\5\34\17\2"+
		"\u00be\u00bf\5\30\r\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1\5\36\20\2\u00c1"+
		"\33\3\2\2\2\u00c2\u00c3\7\27\2\2\u00c3\u00cc\7\26\2\2\u00c4\u00c5\7\30"+
		"\2\2\u00c5\u00cc\7\26\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00cc\7\26\2\2\u00c8"+
		"\u00c9\7\32\2\2\u00c9\u00ca\7\33\2\2\u00ca\u00cc\7\26\2\2\u00cb\u00c2"+
		"\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc"+
		"\35\3\2\2\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\7$\2\2\u00cf\u00d0\5 \21\2"+
		"\u00d0\37\3\2\2\2\u00d1\u00d6\5\b\5\2\u00d2\u00d3\7\'\2\2\u00d3\u00d5"+
		"\5\b\5\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00de\5\6\4\2"+
		"\u00da\u00db\7\'\2\2\u00db\u00dd\5\6\4\2\u00dc\u00da\3\2\2\2\u00dd\u00e0"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df#\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e2\b\23\1\2\u00e2\u00e3\5&\24\2\u00e3\u00e9\3"+
		"\2\2\2\u00e4\u00e5\f\4\2\2\u00e5\u00e6\7\f\2\2\u00e6\u00e8\5&\24\2\u00e7"+
		"\u00e4\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea%\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\b\24\1\2\u00ed\u00ee"+
		"\5(\25\2\u00ee\u00f4\3\2\2\2\u00ef\u00f0\f\4\2\2\u00f0\u00f1\7\13\2\2"+
		"\u00f1\u00f3\5(\25\2\u00f2\u00ef\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\'\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f8\7\r\2\2\u00f8\u00fb\5(\25\2\u00f9\u00fb\5*\26\2\u00fa\u00f7\3\2"+
		"\2\2\u00fa\u00f9\3\2\2\2\u00fb)\3\2\2\2\u00fc\u00fd\7(\2\2\u00fd\u00fe"+
		"\5$\23\2\u00fe\u00ff\7)\2\2\u00ff\u0102\3\2\2\2\u0100\u0102\5.\30\2\u0101"+
		"\u00fc\3\2\2\2\u0101\u0100\3\2\2\2\u0102+\3\2\2\2\u0103\u0109\7,\2\2\u0104"+
		"\u0109\7#\2\2\u0105\u0106\7#\2\2\u0106\u0107\7&\2\2\u0107\u0109\7#\2\2"+
		"\u0108\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2\u0109-\3"+
		"\2\2\2\u010a\u010b\5L\'\2\u010b\u010c\7(\2\2\u010c\u010d\5,\27\2\u010d"+
		"\u010e\7)\2\2\u010e\u0110\7\24\2\2\u010f\u0111\7\r\2\2\u0110\u010f\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\25\2\2\u0113"+
		"\u0135\3\2\2\2\u0114\u0115\5L\'\2\u0115\u0116\7(\2\2\u0116\u0117\5,\27"+
		"\2\u0117\u0118\7)\2\2\u0118\u0119\7$\2\2\u0119\u011a\5\60\31\2\u011a\u0135"+
		"\3\2\2\2\u011b\u011c\5L\'\2\u011c\u011d\7(\2\2\u011d\u011e\5,\27\2\u011e"+
		"\u011f\7)\2\2\u011f\u0120\7\t\2\2\u0120\u0121\5\60\31\2\u0121\u0135\3"+
		"\2\2\2\u0122\u0123\5L\'\2\u0123\u0124\7(\2\2\u0124\u0125\5,\27\2\u0125"+
		"\u0126\7)\2\2\u0126\u0127\7\b\2\2\u0127\u0128\5\60\31\2\u0128\u0129\7"+
		"\13\2\2\u0129\u012a\5\60\31\2\u012a\u0135\3\2\2\2\u012b\u012c\5L\'\2\u012c"+
		"\u012d\7(\2\2\u012d\u012e\5,\27\2\u012e\u012f\7)\2\2\u012f\u0130\7\n\2"+
		"\2\u0130\u0131\7(\2\2\u0131\u0132\5\62\32\2\u0132\u0133\7)\2\2\u0133\u0135"+
		"\3\2\2\2\u0134\u010a\3\2\2\2\u0134\u0114\3\2\2\2\u0134\u011b\3\2\2\2\u0134"+
		"\u0122\3\2\2\2\u0134\u012b\3\2\2\2\u0135/\3\2\2\2\u0136\u0137\t\2\2\2"+
		"\u0137\61\3\2\2\2\u0138\u013d\5\60\31\2\u0139\u013a\7\'\2\2\u013a\u013c"+
		"\5\60\31\2\u013b\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2"+
		"\u013d\u013e\3\2\2\2\u013e\63\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141"+
		"\b\33\1\2\u0141\u0142\5\66\34\2\u0142\u0148\3\2\2\2\u0143\u0144\f\4\2"+
		"\2\u0144\u0145\7\f\2\2\u0145\u0147\5\66\34\2\u0146\u0143\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\65\3\2\2"+
		"\2\u014a\u0148\3\2\2\2\u014b\u014c\b\34\1\2\u014c\u014d\58\35\2\u014d"+
		"\u0153\3\2\2\2\u014e\u014f\f\4\2\2\u014f\u0150\7\13\2\2\u0150\u0152\5"+
		"8\35\2\u0151\u014e\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\67\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7\r\2"+
		"\2\u0157\u015a\58\35\2\u0158\u015a\5:\36\2\u0159\u0156\3\2\2\2\u0159\u0158"+
		"\3\2\2\2\u015a9\3\2\2\2\u015b\u015c\7(\2\2\u015c\u015d\5\64\33\2\u015d"+
		"\u015e\7)\2\2\u015e\u0161\3\2\2\2\u015f\u0161\5<\37\2\u0160\u015b\3\2"+
		"\2\2\u0160\u015f\3\2\2\2\u0161;\3\2\2\2\u0162\u0163\7#\2\2\u0163\u0165"+
		"\7\24\2\2\u0164\u0166\7\r\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167\u017b\7\25\2\2\u0168\u0169\7#\2\2\u0169\u016a"+
		"\7$\2\2\u016a\u017b\5> \2\u016b\u016c\7#\2\2\u016c\u016d\7\t\2\2\u016d"+
		"\u017b\5> \2\u016e\u016f\7#\2\2\u016f\u0170\7\b\2\2\u0170\u0171\5> \2"+
		"\u0171\u0172\7\13\2\2\u0172\u0173\5> \2\u0173\u017b\3\2\2\2\u0174\u0175"+
		"\7#\2\2\u0175\u0176\7\n\2\2\u0176\u0177\7(\2\2\u0177\u0178\5@!\2\u0178"+
		"\u0179\7)\2\2\u0179\u017b\3\2\2\2\u017a\u0162\3\2\2\2\u017a\u0168\3\2"+
		"\2\2\u017a\u016b\3\2\2\2\u017a\u016e\3\2\2\2\u017a\u0174\3\2\2\2\u017b"+
		"=\3\2\2\2\u017c\u017d\t\2\2\2\u017d?\3\2\2\2\u017e\u0183\5> \2\u017f\u0180"+
		"\7\'\2\2\u0180\u0182\5> \2\u0181\u017f\3\2\2\2\u0182\u0185\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184A\3\2\2\2\u0185\u0183\3\2\2\2"+
		"\u0186\u0187\7\20\2\2\u0187\u018c\5D#\2\u0188\u0189\7\'\2\2\u0189\u018b"+
		"\5D#\2\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\5F"+
		"$\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191C\3\2\2\2\u0192\u0193"+
		"\7#\2\2\u0193E\3\2\2\2\u0194\u0195\t\3\2\2\u0195G\3\2\2\2\u0196\u0197"+
		"\7\16\2\2\u0197\u0198\7*\2\2\u0198I\3\2\2\2\u0199\u019a\7\17\2\2\u019a"+
		"\u019b\7*\2\2\u019bK\3\2\2\2\u019c\u019d\t\4\2\2\u019dM\3\2\2\2*W\\`d"+
		"gjmpv~\u0081\u0085\u0088\u0095\u009e\u00a1\u00aa\u00af\u00b2\u00b9\u00cb"+
		"\u00d6\u00de\u00e9\u00f4\u00fa\u0101\u0108\u0110\u0134\u013d\u0148\u0153"+
		"\u0159\u0160\u0165\u017a\u0183\u018c\u0190";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}