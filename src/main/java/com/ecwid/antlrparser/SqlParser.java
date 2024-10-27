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
		SELECT=1, AS=2, FROM=3, WHERE=4, BETWEEN=5, LIKE=6, IN=7, AND=8, OR=9, 
		NOT=10, LIMIT=11, OFFSET=12, ORDERBY=13, GROUPBY=14, ASC=15, DESC=16, 
		JOIN=17, INNER=18, LEFT=19, RIGHT=20, FULL=21, OUTER=22, ON=23, LOGICAL_OPERATOR=24, 
		IDENTIFIER=25, COMP_OPERATOR=26, SEMICOLON=27, DOT=28, COMMA=29, LPAREN=30, 
		RPAREN=31, NUMBER=32, STRING=33, ASTERIX=34, WS=35;
	public static final int
		RULE_statement = 0, RULE_select = 1, RULE_groupByClause = 2, RULE_groupColumn = 3, 
		RULE_selectElements = 4, RULE_selectElement = 5, RULE_alias = 6, RULE_expression = 7, 
		RULE_functionCall = 8, RULE_tableList = 9, RULE_tableElement = 10, RULE_tableSource = 11, 
		RULE_tableName = 12, RULE_joinClause = 13, RULE_joinType = 14, RULE_joinCondition = 15, 
		RULE_joinElements = 16, RULE_orExpression = 17, RULE_andExpression = 18, 
		RULE_unaryExpression = 19, RULE_primaryExpression = 20, RULE_whereClause = 21, 
		RULE_whereValue = 22, RULE_whereValueList = 23, RULE_orderByClause = 24, 
		RULE_orderColumn = 25, RULE_order = 26, RULE_limitClause = 27, RULE_offsetClause = 28;
	public static final String[] ruleNames = {
		"statement", "select", "groupByClause", "groupColumn", "selectElements", 
		"selectElement", "alias", "expression", "functionCall", "tableList", "tableElement", 
		"tableSource", "tableName", "joinClause", "joinType", "joinCondition", 
		"joinElements", "orExpression", "andExpression", "unaryExpression", "primaryExpression", 
		"whereClause", "whereValue", "whereValueList", "orderByClause", "orderColumn", 
		"order", "limitClause", "offsetClause"
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
			setState(58);
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
		public TerminalNode GROUPBY() { return getToken(SqlParser.GROUPBY, 0); }
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
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
			setState(60);
			match(SELECT);
			setState(61);
			selectElements();
			setState(62);
			match(FROM);
			setState(63);
			tableList();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INNER) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
				{
				{
				setState(64);
				joinClause();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			_la = _input.LA(1);
			if (_la==GROUPBY) {
				{
				setState(70);
				match(GROUPBY);
				setState(71);
				groupByClause();
				}
			}

			setState(76);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(74);
				match(WHERE);
				setState(75);
				orExpression(0);
				}
			}

			setState(79);
			_la = _input.LA(1);
			if (_la==ORDERBY) {
				{
				setState(78);
				orderByClause();
				}
			}

			setState(82);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(81);
				limitClause();
				}
			}

			setState(85);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(84);
				offsetClause();
				}
			}

			setState(88);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(87);
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
		enterRule(_localctx, 4, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			groupColumn();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				groupColumn();
				}
				}
				setState(97);
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
		enterRule(_localctx, 6, RULE_groupColumn);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new GroupByColumnNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new GroupByQualifiedColumnNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(IDENTIFIER);
				setState(100);
				match(DOT);
				setState(101);
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
		enterRule(_localctx, 8, RULE_selectElements);
		try {
			int _alt;
			setState(113);
			switch (_input.LA(1)) {
			case ASTERIX:
				_localctx = new AsteriskSelectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(ASTERIX);
				}
				break;
			case IDENTIFIER:
				_localctx = new SelectListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				selectElement();
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(106);
						match(COMMA);
						setState(107);
						selectElement();
						}
						} 
					}
					setState(112);
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
		enterRule(_localctx, 10, RULE_selectElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			expression();
			setState(120);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER) {
				{
				setState(117);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(116);
					match(AS);
					}
				}

				setState(119);
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
		enterRule(_localctx, 12, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ColumnNameExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QualifiedColumnNameExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(IDENTIFIER);
				setState(126);
				match(DOT);
				setState(127);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new TableAsteriskExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(IDENTIFIER);
				setState(129);
				match(DOT);
				setState(130);
				match(ASTERIX);
				}
				break;
			case 4:
				_localctx = new FunctionCallExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
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
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IDENTIFIER);
			setState(135);
			match(LPAREN);
			setState(144);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(136);
				expression();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(137);
					match(COMMA);
					setState(138);
					expression();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(146);
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
		enterRule(_localctx, 18, RULE_tableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			tableElement();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(149);
				match(COMMA);
				setState(150);
				tableElement();
				}
				}
				setState(155);
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
		enterRule(_localctx, 20, RULE_tableElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			tableSource();
			setState(161);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER) {
				{
				setState(158);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(157);
					match(AS);
					}
				}

				setState(160);
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
		enterRule(_localctx, 22, RULE_tableSource);
		try {
			setState(168);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new TableNameSourceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				tableName();
				}
				break;
			case LPAREN:
				_localctx = new SubquerySourceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(LPAREN);
				setState(165);
				select();
				setState(166);
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
		enterRule(_localctx, 24, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		enterRule(_localctx, 26, RULE_joinClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			joinType();
			setState(173);
			tableName();
			setState(174);
			match(ON);
			setState(175);
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
		enterRule(_localctx, 28, RULE_joinType);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(INNER);
				setState(178);
				match(JOIN);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(LEFT);
				setState(180);
				match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(RIGHT);
				setState(182);
				match(JOIN);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(FULL);
				setState(184);
				match(OUTER);
				setState(185);
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
		enterRule(_localctx, 30, RULE_joinCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			joinElements();
			setState(189);
			match(COMP_OPERATOR);
			setState(190);
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
		enterRule(_localctx, 32, RULE_joinElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			selectElements();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(193);
				match(COMMA);
				setState(194);
				selectElements();
				}
				}
				setState(199);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndExpressionInOrContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(201);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrOperationContext(new OrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(203);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(204);
					match(OR);
					setState(205);
					andExpression(0);
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnaryExpressionInAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(212);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOperationContext(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(214);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(215);
					match(AND);
					setState(216);
					unaryExpression();
					}
					} 
				}
				setState(221);
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
		enterRule(_localctx, 38, RULE_unaryExpression);
		try {
			setState(225);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(NOT);
				setState(223);
				unaryExpression();
				}
				break;
			case IDENTIFIER:
			case LPAREN:
				_localctx = new PrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
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
		enterRule(_localctx, 40, RULE_primaryExpression);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new NestedExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(LPAREN);
				setState(228);
				orExpression(0);
				setState(229);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				_localctx = new SimpleConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
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
		enterRule(_localctx, 42, RULE_whereClause);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new ComparisonConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(IDENTIFIER);
				setState(235);
				match(COMP_OPERATOR);
				setState(236);
				whereValue();
				}
				break;
			case 2:
				_localctx = new LikeConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(IDENTIFIER);
				setState(238);
				match(LIKE);
				setState(239);
				whereValue();
				}
				break;
			case 3:
				_localctx = new BetweenConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(IDENTIFIER);
				setState(241);
				match(BETWEEN);
				setState(242);
				whereValue();
				setState(243);
				match(AND);
				setState(244);
				whereValue();
				}
				break;
			case 4:
				_localctx = new InConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				match(IDENTIFIER);
				setState(247);
				match(IN);
				setState(248);
				match(LPAREN);
				setState(249);
				whereValueList();
				setState(250);
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
		enterRule(_localctx, 44, RULE_whereValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 46, RULE_whereValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			whereValue();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(257);
				match(COMMA);
				setState(258);
				whereValue();
				}
				}
				setState(263);
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
		enterRule(_localctx, 48, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ORDERBY);
			setState(265);
			orderColumn();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(266);
				match(COMMA);
				setState(267);
				orderColumn();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(273);
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
		enterRule(_localctx, 50, RULE_orderColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		enterRule(_localctx, 52, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		enterRule(_localctx, 54, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(LIMIT);
			setState(281);
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
		enterRule(_localctx, 56, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(OFFSET);
			setState(284);
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
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 18:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0121\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\5\3K\n\3\3\3\3\3\5\3O\n\3\3\3"+
		"\5\3R\n\3\3\3\5\3U\n\3\3\3\5\3X\n\3\3\3\5\3[\n\3\3\4\3\4\3\4\7\4`\n\4"+
		"\f\4\16\4c\13\4\3\5\3\5\3\5\3\5\5\5i\n\5\3\6\3\6\3\6\3\6\7\6o\n\6\f\6"+
		"\16\6r\13\6\5\6t\n\6\3\7\3\7\5\7x\n\7\3\7\5\7{\n\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0087\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u008e\n\n\f"+
		"\n\16\n\u0091\13\n\5\n\u0093\n\n\3\n\3\n\3\13\3\13\3\13\7\13\u009a\n\13"+
		"\f\13\16\13\u009d\13\13\3\f\3\f\5\f\u00a1\n\f\3\f\5\f\u00a4\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00bd\n\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\7\22\u00c6\n\22\f\22\16\22\u00c9\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u00d1\n\23\f\23\16\23\u00d4\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u00dc\n\24\f\24\16\24\u00df\13\24\3\25\3\25"+
		"\3\25\5\25\u00e4\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u00eb\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u00ff\n\27\3\30\3\30\3\31\3\31\3\31\7\31\u0106\n\31"+
		"\f\31\16\31\u0109\13\31\3\32\3\32\3\32\3\32\7\32\u010f\n\32\f\32\16\32"+
		"\u0112\13\32\3\32\5\32\u0115\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\2\4$&\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:\2\4\4\2\33\33\"#\3\2\21\22\u0127\2<\3\2\2\2\4>\3"+
		"\2\2\2\6\\\3\2\2\2\bh\3\2\2\2\ns\3\2\2\2\fu\3\2\2\2\16|\3\2\2\2\20\u0086"+
		"\3\2\2\2\22\u0088\3\2\2\2\24\u0096\3\2\2\2\26\u009e\3\2\2\2\30\u00aa\3"+
		"\2\2\2\32\u00ac\3\2\2\2\34\u00ae\3\2\2\2\36\u00bc\3\2\2\2 \u00be\3\2\2"+
		"\2\"\u00c2\3\2\2\2$\u00ca\3\2\2\2&\u00d5\3\2\2\2(\u00e3\3\2\2\2*\u00ea"+
		"\3\2\2\2,\u00fe\3\2\2\2.\u0100\3\2\2\2\60\u0102\3\2\2\2\62\u010a\3\2\2"+
		"\2\64\u0116\3\2\2\2\66\u0118\3\2\2\28\u011a\3\2\2\2:\u011d\3\2\2\2<=\5"+
		"\4\3\2=\3\3\2\2\2>?\7\3\2\2?@\5\n\6\2@A\7\5\2\2AE\5\24\13\2BD\5\34\17"+
		"\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FJ\3\2\2\2GE\3\2\2\2HI\7\20"+
		"\2\2IK\5\6\4\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LM\7\6\2\2MO\5$\23\2NL\3\2"+
		"\2\2NO\3\2\2\2OQ\3\2\2\2PR\5\62\32\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\5"+
		"8\35\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VX\5:\36\2WV\3\2\2\2WX\3\2\2\2XZ\3"+
		"\2\2\2Y[\7\35\2\2ZY\3\2\2\2Z[\3\2\2\2[\5\3\2\2\2\\a\5\b\5\2]^\7\37\2\2"+
		"^`\5\b\5\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\7\3\2\2\2ca\3\2\2"+
		"\2di\7\33\2\2ef\7\33\2\2fg\7\36\2\2gi\7\33\2\2hd\3\2\2\2he\3\2\2\2i\t"+
		"\3\2\2\2jt\7$\2\2kp\5\f\7\2lm\7\37\2\2mo\5\f\7\2nl\3\2\2\2or\3\2\2\2p"+
		"n\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2sj\3\2\2\2sk\3\2\2\2t\13\3\2\2"+
		"\2uz\5\20\t\2vx\7\4\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\5\16\b\2zw\3\2"+
		"\2\2z{\3\2\2\2{\r\3\2\2\2|}\7\33\2\2}\17\3\2\2\2~\u0087\7\33\2\2\177\u0080"+
		"\7\33\2\2\u0080\u0081\7\36\2\2\u0081\u0087\7\33\2\2\u0082\u0083\7\33\2"+
		"\2\u0083\u0084\7\36\2\2\u0084\u0087\7$\2\2\u0085\u0087\5\22\n\2\u0086"+
		"~\3\2\2\2\u0086\177\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\21\3\2\2\2\u0088\u0089\7\33\2\2\u0089\u0092\7 \2\2\u008a\u008f\5\20\t"+
		"\2\u008b\u008c\7\37\2\2\u008c\u008e\5\20\t\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\7!\2\2\u0095\23\3\2\2\2\u0096\u009b\5\26\f"+
		"\2\u0097\u0098\7\37\2\2\u0098\u009a\5\26\f\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\25\3\2\2"+
		"\2\u009d\u009b\3\2\2\2\u009e\u00a3\5\30\r\2\u009f\u00a1\7\4\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\5\16"+
		"\b\2\u00a3\u00a0\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\27\3\2\2\2\u00a5\u00ab"+
		"\5\32\16\2\u00a6\u00a7\7 \2\2\u00a7\u00a8\5\4\3\2\u00a8\u00a9\7!\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab\31\3\2\2"+
		"\2\u00ac\u00ad\7\33\2\2\u00ad\33\3\2\2\2\u00ae\u00af\5\36\20\2\u00af\u00b0"+
		"\5\32\16\2\u00b0\u00b1\7\31\2\2\u00b1\u00b2\5 \21\2\u00b2\35\3\2\2\2\u00b3"+
		"\u00b4\7\24\2\2\u00b4\u00bd\7\23\2\2\u00b5\u00b6\7\25\2\2\u00b6\u00bd"+
		"\7\23\2\2\u00b7\u00b8\7\26\2\2\u00b8\u00bd\7\23\2\2\u00b9\u00ba\7\27\2"+
		"\2\u00ba\u00bb\7\30\2\2\u00bb\u00bd\7\23\2\2\u00bc\u00b3\3\2\2\2\u00bc"+
		"\u00b5\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\37\3\2\2"+
		"\2\u00be\u00bf\5\"\22\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1\5\"\22\2\u00c1"+
		"!\3\2\2\2\u00c2\u00c7\5\n\6\2\u00c3\u00c4\7\37\2\2\u00c4\u00c6\5\n\6\2"+
		"\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8#\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\b\23\1\2\u00cb"+
		"\u00cc\5&\24\2\u00cc\u00d2\3\2\2\2\u00cd\u00ce\f\4\2\2\u00ce\u00cf\7\13"+
		"\2\2\u00cf\u00d1\5&\24\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3%\3\2\2\2\u00d4\u00d2\3\2\2\2"+
		"\u00d5\u00d6\b\24\1\2\u00d6\u00d7\5(\25\2\u00d7\u00dd\3\2\2\2\u00d8\u00d9"+
		"\f\4\2\2\u00d9\u00da\7\n\2\2\u00da\u00dc\5(\25\2\u00db\u00d8\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\'\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\f\2\2\u00e1\u00e4\5(\25\2\u00e2\u00e4"+
		"\5*\26\2\u00e3\u00e0\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4)\3\2\2\2\u00e5"+
		"\u00e6\7 \2\2\u00e6\u00e7\5$\23\2\u00e7\u00e8\7!\2\2\u00e8\u00eb\3\2\2"+
		"\2\u00e9\u00eb\5,\27\2\u00ea\u00e5\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb+"+
		"\3\2\2\2\u00ec\u00ed\7\33\2\2\u00ed\u00ee\7\34\2\2\u00ee\u00ff\5.\30\2"+
		"\u00ef\u00f0\7\33\2\2\u00f0\u00f1\7\b\2\2\u00f1\u00ff\5.\30\2\u00f2\u00f3"+
		"\7\33\2\2\u00f3\u00f4\7\7\2\2\u00f4\u00f5\5.\30\2\u00f5\u00f6\7\n\2\2"+
		"\u00f6\u00f7\5.\30\2\u00f7\u00ff\3\2\2\2\u00f8\u00f9\7\33\2\2\u00f9\u00fa"+
		"\7\t\2\2\u00fa\u00fb\7 \2\2\u00fb\u00fc\5\60\31\2\u00fc\u00fd\7!\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00ec\3\2\2\2\u00fe\u00ef\3\2\2\2\u00fe\u00f2\3\2"+
		"\2\2\u00fe\u00f8\3\2\2\2\u00ff-\3\2\2\2\u0100\u0101\t\2\2\2\u0101/\3\2"+
		"\2\2\u0102\u0107\5.\30\2\u0103\u0104\7\37\2\2\u0104\u0106\5.\30\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\61\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7\17\2\2\u010b\u0110"+
		"\5\64\33\2\u010c\u010d\7\37\2\2\u010d\u010f\5\64\33\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\5\66\34\2\u0114\u0113\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\63\3\2\2\2\u0116\u0117\7\33\2\2\u0117"+
		"\65\3\2\2\2\u0118\u0119\t\3\2\2\u0119\67\3\2\2\2\u011a\u011b\7\r\2\2\u011b"+
		"\u011c\7\"\2\2\u011c9\3\2\2\2\u011d\u011e\7\16\2\2\u011e\u011f\7\"\2\2"+
		"\u011f;\3\2\2\2 EJNQTWZahpswz\u0086\u008f\u0092\u009b\u00a0\u00a3\u00aa"+
		"\u00bc\u00c7\u00d2\u00dd\u00e3\u00ea\u00fe\u0107\u0110\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}