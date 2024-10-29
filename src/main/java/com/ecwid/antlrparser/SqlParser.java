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
		JOIN=18, INNER=19, LEFT=20, RIGHT=21, FULL=22, OUTER=23, ON=24, COUNT=25, 
		SUM=26, AVG=27, MAX=28, MIN=29, LOGICAL_OPERATOR=30, IDENTIFIER=31, COMP_OPERATOR=32, 
		SEMICOLON=33, DOT=34, COMMA=35, LPAREN=36, RPAREN=37, NUMBER=38, STRING=39, 
		ASTERIX=40, WS=41;
	public static final int
		RULE_statement = 0, RULE_select = 1, RULE_groupColumn = 2, RULE_selectElements = 3, 
		RULE_selectElement = 4, RULE_alias = 5, RULE_expression = 6, RULE_functionCall = 7, 
		RULE_tableList = 8, RULE_tableElement = 9, RULE_tableSource = 10, RULE_tableName = 11, 
		RULE_joinClause = 12, RULE_joinType = 13, RULE_joinCondition = 14, RULE_joinElements = 15, 
		RULE_groupByClause = 16, RULE_havingOrExpression = 17, RULE_havingAndExpression = 18, 
		RULE_havingUnaryExpression = 19, RULE_havingPrimaryExpression = 20, RULE_aggregateFunction = 21, 
		RULE_havingColumn = 22, RULE_havingValue = 23, RULE_havingClause = 24, 
		RULE_orExpression = 25, RULE_andExpression = 26, RULE_unaryExpression = 27, 
		RULE_primaryExpression = 28, RULE_whereClause = 29, RULE_whereValue = 30, 
		RULE_whereValueList = 31, RULE_orderByClause = 32, RULE_orderColumn = 33, 
		RULE_order = 34, RULE_limitClause = 35, RULE_offsetClause = 36;
	public static final String[] ruleNames = {
		"statement", "select", "groupColumn", "selectElements", "selectElement", 
		"alias", "expression", "functionCall", "tableList", "tableElement", "tableSource", 
		"tableName", "joinClause", "joinType", "joinCondition", "joinElements", 
		"groupByClause", "havingOrExpression", "havingAndExpression", "havingUnaryExpression", 
		"havingPrimaryExpression", "aggregateFunction", "havingColumn", "havingValue", 
		"havingClause", "orExpression", "andExpression", "unaryExpression", "primaryExpression", 
		"whereClause", "whereValue", "whereValueList", "orderByClause", "orderColumn", 
		"order", "limitClause", "offsetClause"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'AS'", "'FROM'", "'WHERE'", "'HAVING'", "'BETWEEN'", 
		"'LIKE'", "'IN'", "'AND'", "'OR'", "'NOT'", "'LIMIT'", "'OFFSET'", "'ORDER BY'", 
		"'GROUP BY'", "'ASC'", "'DESC'", "'JOIN'", "'INNER'", "'LEFT'", "'RIGHT'", 
		"'FULL'", "'OUTER'", "'ON'", "'COUNT'", "'SUM'", "'AVG'", "'MAX'", "'MIN'", 
		null, null, null, "';'", "'.'", "','", "'('", "')'", null, null, "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "AS", "FROM", "WHERE", "HAVING", "BETWEEN", "LIKE", "IN", 
		"AND", "OR", "NOT", "LIMIT", "OFFSET", "ORDERBY", "GROUPBY", "ASC", "DESC", 
		"JOIN", "INNER", "LEFT", "RIGHT", "FULL", "OUTER", "ON", "COUNT", "SUM", 
		"AVG", "MAX", "MIN", "LOGICAL_OPERATOR", "IDENTIFIER", "COMP_OPERATOR", 
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
			setState(74);
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
			setState(76);
			match(SELECT);
			setState(77);
			selectElements();
			setState(78);
			match(FROM);
			setState(79);
			tableList();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INNER) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
				{
				{
				setState(80);
				joinClause();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(86);
				match(WHERE);
				setState(87);
				orExpression(0);
				}
			}

			setState(92);
			_la = _input.LA(1);
			if (_la==GROUPBY) {
				{
				setState(90);
				match(GROUPBY);
				setState(91);
				groupByClause();
				}
			}

			setState(96);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(94);
				match(HAVING);
				setState(95);
				havingOrExpression(0);
				}
			}

			setState(99);
			_la = _input.LA(1);
			if (_la==ORDERBY) {
				{
				setState(98);
				orderByClause();
				}
			}

			setState(102);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(101);
				limitClause();
				}
			}

			setState(105);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(104);
				offsetClause();
				}
			}

			setState(108);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(107);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new GroupByColumnNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new GroupByQualifiedColumnNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(IDENTIFIER);
				setState(112);
				match(DOT);
				setState(113);
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
			setState(125);
			switch (_input.LA(1)) {
			case ASTERIX:
				_localctx = new AsteriskSelectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(ASTERIX);
				}
				break;
			case COUNT:
			case SUM:
			case AVG:
			case MAX:
			case MIN:
			case IDENTIFIER:
				_localctx = new SelectListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				selectElement();
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(118);
						match(COMMA);
						setState(119);
						selectElement();
						}
						} 
					}
					setState(124);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			setState(127);
			expression();
			setState(132);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER) {
				{
				setState(129);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(128);
					match(AS);
					}
				}

				setState(131);
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
			setState(134);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ColumnNameExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QualifiedColumnNameExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(IDENTIFIER);
				setState(138);
				match(DOT);
				setState(139);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new TableAsteriskExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(IDENTIFIER);
				setState(141);
				match(DOT);
				setState(142);
				match(ASTERIX);
				}
				break;
			case 4:
				_localctx = new FunctionCallExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
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
			setState(146);
			aggregateFunction();
			setState(147);
			match(LPAREN);
			setState(156);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COUNT) | (1L << SUM) | (1L << AVG) | (1L << MAX) | (1L << MIN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(148);
				expression();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(149);
					match(COMMA);
					setState(150);
					expression();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(158);
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
			setState(160);
			tableElement();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(161);
				match(COMMA);
				setState(162);
				tableElement();
				}
				}
				setState(167);
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
			setState(168);
			tableSource();
			setState(173);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER) {
				{
				setState(170);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(169);
					match(AS);
					}
				}

				setState(172);
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
			setState(180);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new TableNameSourceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				tableName();
				}
				break;
			case LPAREN:
				_localctx = new SubquerySourceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(LPAREN);
				setState(177);
				select();
				setState(178);
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
			setState(182);
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
			setState(184);
			joinType();
			setState(185);
			tableName();
			setState(186);
			match(ON);
			setState(187);
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
			setState(198);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(INNER);
				setState(190);
				match(JOIN);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(LEFT);
				setState(192);
				match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(RIGHT);
				setState(194);
				match(JOIN);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(FULL);
				setState(196);
				match(OUTER);
				setState(197);
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
			setState(200);
			joinElements();
			setState(201);
			match(COMP_OPERATOR);
			setState(202);
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
			setState(204);
			selectElements();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				setState(206);
				selectElements();
				}
				}
				setState(211);
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
			setState(212);
			groupColumn();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(213);
				match(COMMA);
				setState(214);
				groupColumn();
				}
				}
				setState(219);
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

			setState(221);
			havingAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
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
					setState(223);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(224);
					match(OR);
					setState(225);
					havingAndExpression(0);
					}
					} 
				}
				setState(230);
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

			setState(232);
			havingUnaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
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
					setState(234);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(235);
					match(AND);
					setState(236);
					havingUnaryExpression();
					}
					} 
				}
				setState(241);
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
			setState(245);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new HavingNotOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(NOT);
				setState(243);
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
				setState(244);
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
			setState(252);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new HavingNestedExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(LPAREN);
				setState(248);
				havingOrExpression(0);
				setState(249);
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
				setState(251);
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
		enterRule(_localctx, 42, RULE_aggregateFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 44, RULE_havingColumn);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new HavingColumnNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new HavingQualifiedColumnNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(IDENTIFIER);
				setState(258);
				match(DOT);
				setState(259);
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
			setState(262);
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

	public static class HavingClauseContext extends ParserRuleContext {
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
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_havingClause);
		try {
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
			match(COMP_OPERATOR);
			setState(269);
			havingValue();
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

			setState(272);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrOperationContext(new OrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(274);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(275);
					match(OR);
					setState(276);
					andExpression(0);
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

			setState(283);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOperationContext(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(285);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(286);
					match(AND);
					setState(287);
					unaryExpression();
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(296);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(NOT);
				setState(294);
				unaryExpression();
				}
				break;
			case IDENTIFIER:
			case LPAREN:
				_localctx = new PrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
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
			setState(303);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new NestedExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(LPAREN);
				setState(299);
				orExpression(0);
				setState(300);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				_localctx = new SimpleConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
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
		enterRule(_localctx, 58, RULE_whereClause);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new ComparisonConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(IDENTIFIER);
				setState(306);
				match(COMP_OPERATOR);
				setState(307);
				whereValue();
				}
				break;
			case 2:
				_localctx = new LikeConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(IDENTIFIER);
				setState(309);
				match(LIKE);
				setState(310);
				whereValue();
				}
				break;
			case 3:
				_localctx = new BetweenConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(IDENTIFIER);
				setState(312);
				match(BETWEEN);
				setState(313);
				whereValue();
				setState(314);
				match(AND);
				setState(315);
				whereValue();
				}
				break;
			case 4:
				_localctx = new InConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				match(IDENTIFIER);
				setState(318);
				match(IN);
				setState(319);
				match(LPAREN);
				setState(320);
				whereValueList();
				setState(321);
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
			setState(325);
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
			setState(327);
			whereValue();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(328);
				match(COMMA);
				setState(329);
				whereValue();
				}
				}
				setState(334);
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
			setState(335);
			match(ORDERBY);
			setState(336);
			orderColumn();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(337);
				match(COMMA);
				setState(338);
				orderColumn();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(344);
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
			setState(347);
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
			setState(349);
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
			setState(351);
			match(LIMIT);
			setState(352);
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
			setState(354);
			match(OFFSET);
			setState(355);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0168\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3T\n"+
		"\3\f\3\16\3W\13\3\3\3\3\3\5\3[\n\3\3\3\3\3\5\3_\n\3\3\3\3\3\5\3c\n\3\3"+
		"\3\5\3f\n\3\3\3\5\3i\n\3\3\3\5\3l\n\3\3\3\5\3o\n\3\3\4\3\4\3\4\3\4\5\4"+
		"u\n\4\3\5\3\5\3\5\3\5\7\5{\n\5\f\5\16\5~\13\5\5\5\u0080\n\5\3\6\3\6\5"+
		"\6\u0084\n\6\3\6\5\6\u0087\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0093\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u009a\n\t\f\t\16\t\u009d\13\t\5"+
		"\t\u009f\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9\13\n\3\13"+
		"\3\13\5\13\u00ad\n\13\3\13\5\13\u00b0\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00b7"+
		"\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u00c9\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21"+
		"\u00d2\n\21\f\21\16\21\u00d5\13\21\3\22\3\22\3\22\7\22\u00da\n\22\f\22"+
		"\16\22\u00dd\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e5\n\23\f\23"+
		"\16\23\u00e8\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00f0\n\24\f\24"+
		"\16\24\u00f3\13\24\3\25\3\25\3\25\5\25\u00f8\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00ff\n\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0107\n\30\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\7\33\u0118\n\33\f\33\16\33\u011b\13\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\7\34\u0123\n\34\f\34\16\34\u0126\13\34\3\35\3\35\3\35\5\35\u012b\n"+
		"\35\3\36\3\36\3\36\3\36\3\36\5\36\u0132\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0146\n\37\3 \3 \3!\3!\3!\7!\u014d\n!\f!\16!\u0150\13!\3\"\3\"\3\"\3"+
		"\"\7\"\u0156\n\"\f\"\16\"\u0159\13\"\3\"\5\"\u015c\n\"\3#\3#\3$\3$\3%"+
		"\3%\3%\3&\3&\3&\3&\2\6$&\64\66\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJ\2\5\3\2\33\37\4\2!!()\3\2\22\23\u016c"+
		"\2L\3\2\2\2\4N\3\2\2\2\6t\3\2\2\2\b\177\3\2\2\2\n\u0081\3\2\2\2\f\u0088"+
		"\3\2\2\2\16\u0092\3\2\2\2\20\u0094\3\2\2\2\22\u00a2\3\2\2\2\24\u00aa\3"+
		"\2\2\2\26\u00b6\3\2\2\2\30\u00b8\3\2\2\2\32\u00ba\3\2\2\2\34\u00c8\3\2"+
		"\2\2\36\u00ca\3\2\2\2 \u00ce\3\2\2\2\"\u00d6\3\2\2\2$\u00de\3\2\2\2&\u00e9"+
		"\3\2\2\2(\u00f7\3\2\2\2*\u00fe\3\2\2\2,\u0100\3\2\2\2.\u0106\3\2\2\2\60"+
		"\u0108\3\2\2\2\62\u010a\3\2\2\2\64\u0111\3\2\2\2\66\u011c\3\2\2\28\u012a"+
		"\3\2\2\2:\u0131\3\2\2\2<\u0145\3\2\2\2>\u0147\3\2\2\2@\u0149\3\2\2\2B"+
		"\u0151\3\2\2\2D\u015d\3\2\2\2F\u015f\3\2\2\2H\u0161\3\2\2\2J\u0164\3\2"+
		"\2\2LM\5\4\3\2M\3\3\2\2\2NO\7\3\2\2OP\5\b\5\2PQ\7\5\2\2QU\5\22\n\2RT\5"+
		"\32\16\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VZ\3\2\2\2WU\3\2\2\2X"+
		"Y\7\6\2\2Y[\5\64\33\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\]\7\21\2\2]_\5\""+
		"\22\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`a\7\7\2\2ac\5$\23\2b`\3\2\2\2bc\3"+
		"\2\2\2ce\3\2\2\2df\5B\"\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gi\5H%\2hg\3\2"+
		"\2\2hi\3\2\2\2ik\3\2\2\2jl\5J&\2kj\3\2\2\2kl\3\2\2\2ln\3\2\2\2mo\7#\2"+
		"\2nm\3\2\2\2no\3\2\2\2o\5\3\2\2\2pu\7!\2\2qr\7!\2\2rs\7$\2\2su\7!\2\2"+
		"tp\3\2\2\2tq\3\2\2\2u\7\3\2\2\2v\u0080\7*\2\2w|\5\n\6\2xy\7%\2\2y{\5\n"+
		"\6\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2"+
		"\177v\3\2\2\2\177w\3\2\2\2\u0080\t\3\2\2\2\u0081\u0086\5\16\b\2\u0082"+
		"\u0084\7\4\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\5\f\7\2\u0086\u0083\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\13\3\2\2\2\u0088\u0089\7!\2\2\u0089\r\3\2\2\2\u008a\u0093\7!\2\2\u008b"+
		"\u008c\7!\2\2\u008c\u008d\7$\2\2\u008d\u0093\7!\2\2\u008e\u008f\7!\2\2"+
		"\u008f\u0090\7$\2\2\u0090\u0093\7*\2\2\u0091\u0093\5\20\t\2\u0092\u008a"+
		"\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\17\3\2\2\2\u0094\u0095\5,\27\2\u0095\u009e\7&\2\2\u0096\u009b\5\16\b"+
		"\2\u0097\u0098\7%\2\2\u0098\u009a\5\16\b\2\u0099\u0097\3\2\2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\7\'\2\2\u00a1\21\3\2\2\2\u00a2\u00a7\5\24\13\2\u00a3"+
		"\u00a4\7%\2\2\u00a4\u00a6\5\24\13\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3"+
		"\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\23\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00af\5\26\f\2\u00ab\u00ad\7\4\2\2\u00ac\u00ab\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\5\f\7\2\u00af"+
		"\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\25\3\2\2\2\u00b1\u00b7\5\30\r"+
		"\2\u00b2\u00b3\7&\2\2\u00b3\u00b4\5\4\3\2\u00b4\u00b5\7\'\2\2\u00b5\u00b7"+
		"\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7\27\3\2\2\2\u00b8"+
		"\u00b9\7!\2\2\u00b9\31\3\2\2\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\5\30"+
		"\r\2\u00bc\u00bd\7\32\2\2\u00bd\u00be\5\36\20\2\u00be\33\3\2\2\2\u00bf"+
		"\u00c0\7\25\2\2\u00c0\u00c9\7\24\2\2\u00c1\u00c2\7\26\2\2\u00c2\u00c9"+
		"\7\24\2\2\u00c3\u00c4\7\27\2\2\u00c4\u00c9\7\24\2\2\u00c5\u00c6\7\30\2"+
		"\2\u00c6\u00c7\7\31\2\2\u00c7\u00c9\7\24\2\2\u00c8\u00bf\3\2\2\2\u00c8"+
		"\u00c1\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\35\3\2\2"+
		"\2\u00ca\u00cb\5 \21\2\u00cb\u00cc\7\"\2\2\u00cc\u00cd\5 \21\2\u00cd\37"+
		"\3\2\2\2\u00ce\u00d3\5\b\5\2\u00cf\u00d0\7%\2\2\u00d0\u00d2\5\b\5\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4!\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00db\5\6\4\2\u00d7\u00d8"+
		"\7%\2\2\u00d8\u00da\5\6\4\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc#\3\2\2\2\u00dd\u00db\3\2\2\2"+
		"\u00de\u00df\b\23\1\2\u00df\u00e0\5&\24\2\u00e0\u00e6\3\2\2\2\u00e1\u00e2"+
		"\f\4\2\2\u00e2\u00e3\7\f\2\2\u00e3\u00e5\5&\24\2\u00e4\u00e1\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7%\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e9\u00ea\b\24\1\2\u00ea\u00eb\5(\25\2\u00eb\u00f1"+
		"\3\2\2\2\u00ec\u00ed\f\4\2\2\u00ed\u00ee\7\13\2\2\u00ee\u00f0\5(\25\2"+
		"\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\'\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\r\2\2\u00f5"+
		"\u00f8\5(\25\2\u00f6\u00f8\5*\26\2\u00f7\u00f4\3\2\2\2\u00f7\u00f6\3\2"+
		"\2\2\u00f8)\3\2\2\2\u00f9\u00fa\7&\2\2\u00fa\u00fb\5$\23\2\u00fb\u00fc"+
		"\7\'\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00ff\5\62\32\2\u00fe\u00f9\3\2\2\2"+
		"\u00fe\u00fd\3\2\2\2\u00ff+\3\2\2\2\u0100\u0101\t\2\2\2\u0101-\3\2\2\2"+
		"\u0102\u0107\7!\2\2\u0103\u0104\7!\2\2\u0104\u0105\7$\2\2\u0105\u0107"+
		"\7!\2\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0107/\3\2\2\2\u0108\u0109"+
		"\t\3\2\2\u0109\61\3\2\2\2\u010a\u010b\5,\27\2\u010b\u010c\7&\2\2\u010c"+
		"\u010d\5.\30\2\u010d\u010e\7\'\2\2\u010e\u010f\7\"\2\2\u010f\u0110\5\60"+
		"\31\2\u0110\63\3\2\2\2\u0111\u0112\b\33\1\2\u0112\u0113\5\66\34\2\u0113"+
		"\u0119\3\2\2\2\u0114\u0115\f\4\2\2\u0115\u0116\7\f\2\2\u0116\u0118\5\66"+
		"\34\2\u0117\u0114\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\65\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\b\34\1"+
		"\2\u011d\u011e\58\35\2\u011e\u0124\3\2\2\2\u011f\u0120\f\4\2\2\u0120\u0121"+
		"\7\13\2\2\u0121\u0123\58\35\2\u0122\u011f\3\2\2\2\u0123\u0126\3\2\2\2"+
		"\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\67\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0127\u0128\7\r\2\2\u0128\u012b\58\35\2\u0129\u012b\5:\36\2\u012a"+
		"\u0127\3\2\2\2\u012a\u0129\3\2\2\2\u012b9\3\2\2\2\u012c\u012d\7&\2\2\u012d"+
		"\u012e\5\64\33\2\u012e\u012f\7\'\2\2\u012f\u0132\3\2\2\2\u0130\u0132\5"+
		"<\37\2\u0131\u012c\3\2\2\2\u0131\u0130\3\2\2\2\u0132;\3\2\2\2\u0133\u0134"+
		"\7!\2\2\u0134\u0135\7\"\2\2\u0135\u0146\5> \2\u0136\u0137\7!\2\2\u0137"+
		"\u0138\7\t\2\2\u0138\u0146\5> \2\u0139\u013a\7!\2\2\u013a\u013b\7\b\2"+
		"\2\u013b\u013c\5> \2\u013c\u013d\7\13\2\2\u013d\u013e\5> \2\u013e\u0146"+
		"\3\2\2\2\u013f\u0140\7!\2\2\u0140\u0141\7\n\2\2\u0141\u0142\7&\2\2\u0142"+
		"\u0143\5@!\2\u0143\u0144\7\'\2\2\u0144\u0146\3\2\2\2\u0145\u0133\3\2\2"+
		"\2\u0145\u0136\3\2\2\2\u0145\u0139\3\2\2\2\u0145\u013f\3\2\2\2\u0146="+
		"\3\2\2\2\u0147\u0148\t\3\2\2\u0148?\3\2\2\2\u0149\u014e\5> \2\u014a\u014b"+
		"\7%\2\2\u014b\u014d\5> \2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014fA\3\2\2\2\u0150\u014e\3\2\2\2"+
		"\u0151\u0152\7\20\2\2\u0152\u0157\5D#\2\u0153\u0154\7%\2\2\u0154\u0156"+
		"\5D#\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\5F"+
		"$\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015cC\3\2\2\2\u015d\u015e"+
		"\7!\2\2\u015eE\3\2\2\2\u015f\u0160\t\4\2\2\u0160G\3\2\2\2\u0161\u0162"+
		"\7\16\2\2\u0162\u0163\7(\2\2\u0163I\3\2\2\2\u0164\u0165\7\17\2\2\u0165"+
		"\u0166\7(\2\2\u0166K\3\2\2\2&UZ^behknt|\177\u0083\u0086\u0092\u009b\u009e"+
		"\u00a7\u00ac\u00af\u00b6\u00c8\u00d3\u00db\u00e6\u00f1\u00f7\u00fe\u0106"+
		"\u0119\u0124\u012a\u0131\u0145\u014e\u0157\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}