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
		NOT=10, LIMIT=11, OFFSET=12, ORDERBY=13, ASC=14, DESC=15, JOIN=16, INNER=17, 
		LEFT=18, RIGHT=19, FULL=20, OUTER=21, ON=22, LOGICAL_OPERATOR=23, IDENTIFIER=24, 
		COMP_OPERATOR=25, SEMICOLON=26, DOT=27, COMMA=28, LPAREN=29, RPAREN=30, 
		NUMBER=31, STRING=32, ASTERIX=33, WS=34;
	public static final int
		RULE_statement = 0, RULE_select = 1, RULE_tableList = 2, RULE_tableElement = 3, 
		RULE_tableSource = 4, RULE_tableName = 5, RULE_selectElements = 6, RULE_selectElement = 7, 
		RULE_alias = 8, RULE_expression = 9, RULE_columnName = 10, RULE_logicalOperator = 11, 
		RULE_joinClause = 12, RULE_joinType = 13, RULE_joinCondition = 14, RULE_joinElements = 15, 
		RULE_orExpression = 16, RULE_andExpression = 17, RULE_unaryExpression = 18, 
		RULE_primaryExpression = 19, RULE_whereClause = 20, RULE_whereValue = 21, 
		RULE_whereValueList = 22, RULE_orderByClause = 23, RULE_orderColumn = 24, 
		RULE_order = 25, RULE_limitClause = 26, RULE_offsetClause = 27;
	public static final String[] ruleNames = {
		"statement", "select", "tableList", "tableElement", "tableSource", "tableName", 
		"selectElements", "selectElement", "alias", "expression", "columnName", 
		"logicalOperator", "joinClause", "joinType", "joinCondition", "joinElements", 
		"orExpression", "andExpression", "unaryExpression", "primaryExpression", 
		"whereClause", "whereValue", "whereValueList", "orderByClause", "orderColumn", 
		"order", "limitClause", "offsetClause"
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
			setState(56);
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
			setState(58);
			match(SELECT);
			setState(59);
			selectElements();
			setState(60);
			match(FROM);
			setState(61);
			tableList();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INNER) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
				{
				{
				setState(62);
				joinClause();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(68);
				match(WHERE);
				setState(69);
				orExpression(0);
				}
			}

			setState(73);
			_la = _input.LA(1);
			if (_la==ORDERBY) {
				{
				setState(72);
				orderByClause();
				}
			}

			setState(76);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(75);
				limitClause();
				}
			}

			setState(79);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(78);
				offsetClause();
				}
			}

			setState(82);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(81);
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
		enterRule(_localctx, 4, RULE_tableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			tableElement();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				tableElement();
				}
				}
				setState(91);
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
		enterRule(_localctx, 6, RULE_tableElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			tableSource();
			setState(97);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER) {
				{
				setState(94);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(93);
					match(AS);
					}
				}

				setState(96);
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
		enterRule(_localctx, 8, RULE_tableSource);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new TableNameSourceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				tableName();
				}
				break;
			case LPAREN:
				_localctx = new SubquerySourceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(LPAREN);
				setState(101);
				select();
				setState(102);
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
		enterRule(_localctx, 10, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		enterRule(_localctx, 12, RULE_selectElements);
		try {
			int _alt;
			setState(117);
			switch (_input.LA(1)) {
			case ASTERIX:
				_localctx = new AsteriskSelectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(ASTERIX);
				}
				break;
			case IDENTIFIER:
				_localctx = new SelectListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				selectElement();
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						match(COMMA);
						setState(111);
						selectElement();
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 14, RULE_selectElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			expression();
			setState(124);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER) {
				{
				setState(121);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(120);
					match(AS);
					}
				}

				setState(123);
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
		enterRule(_localctx, 16, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ColumnNameExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QualifiedColumnNameExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(IDENTIFIER);
				setState(130);
				match(DOT);
				setState(131);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new TableAsteriskExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(IDENTIFIER);
				setState(133);
				match(DOT);
				setState(134);
				match(ASTERIX);
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

	public static class ColumnNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public TerminalNode ASTERIX() { return getToken(SqlParser.ASTERIX, 0); }
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
		enterRule(_localctx, 20, RULE_columnName);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(IDENTIFIER);
				setState(140);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(138);
					match(DOT);
					setState(139);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(IDENTIFIER);
				setState(145);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(143);
					match(DOT);
					setState(144);
					match(ASTERIX);
					}
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
		enterRule(_localctx, 22, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
			setState(151);
			joinType();
			setState(152);
			tableName();
			setState(153);
			match(ON);
			setState(154);
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
			setState(165);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(INNER);
				setState(157);
				match(JOIN);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(LEFT);
				setState(159);
				match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(RIGHT);
				setState(161);
				match(JOIN);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(FULL);
				setState(163);
				match(OUTER);
				setState(164);
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
			setState(167);
			joinElements();
			setState(168);
			match(COMP_OPERATOR);
			setState(169);
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
			setState(171);
			selectElements();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				selectElements();
				}
				}
				setState(178);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndExpressionInOrContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(180);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrOperationContext(new OrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(182);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(183);
					match(OR);
					setState(184);
					andExpression(0);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnaryExpressionInAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(191);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOperationContext(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(193);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(194);
					match(AND);
					setState(195);
					unaryExpression();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 36, RULE_unaryExpression);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(NOT);
				setState(202);
				unaryExpression();
				}
				break;
			case IDENTIFIER:
			case LPAREN:
				_localctx = new PrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
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
		enterRule(_localctx, 38, RULE_primaryExpression);
		try {
			setState(211);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new NestedExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(LPAREN);
				setState(207);
				orExpression(0);
				setState(208);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				_localctx = new SimpleConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
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
		enterRule(_localctx, 40, RULE_whereClause);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ComparisonConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(IDENTIFIER);
				setState(214);
				match(COMP_OPERATOR);
				setState(215);
				whereValue();
				}
				break;
			case 2:
				_localctx = new LikeConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(IDENTIFIER);
				setState(217);
				match(LIKE);
				setState(218);
				whereValue();
				}
				break;
			case 3:
				_localctx = new BetweenConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(IDENTIFIER);
				setState(220);
				match(BETWEEN);
				setState(221);
				whereValue();
				setState(222);
				match(AND);
				setState(223);
				whereValue();
				}
				break;
			case 4:
				_localctx = new InConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(IDENTIFIER);
				setState(226);
				match(IN);
				setState(227);
				match(LPAREN);
				setState(228);
				whereValueList();
				setState(229);
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
		enterRule(_localctx, 42, RULE_whereValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		enterRule(_localctx, 44, RULE_whereValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			whereValue();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(236);
				match(COMMA);
				setState(237);
				whereValue();
				}
				}
				setState(242);
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
		enterRule(_localctx, 46, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ORDERBY);
			setState(244);
			orderColumn();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(246);
				orderColumn();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(252);
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
		enterRule(_localctx, 48, RULE_orderColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		enterRule(_localctx, 50, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		enterRule(_localctx, 52, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(LIMIT);
			setState(260);
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
		enterRule(_localctx, 54, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(OFFSET);
			setState(263);
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
		case 16:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 17:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u010c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7"+
		"\3B\n\3\f\3\16\3E\13\3\3\3\3\3\5\3I\n\3\3\3\5\3L\n\3\3\3\5\3O\n\3\3\3"+
		"\5\3R\n\3\3\3\5\3U\n\3\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\5\3\5\5\5"+
		"a\n\5\3\5\5\5d\n\5\3\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\7\bs\n\b\f\b\16\bv\13\b\5\bx\n\b\3\t\3\t\5\t|\n\t\3\t\5\t\177\n\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\f"+
		"\5\f\u008f\n\f\3\f\3\f\3\f\5\f\u0094\n\f\5\f\u0096\n\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a8"+
		"\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00b1\n\21\f\21\16\21\u00b4"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00bc\n\22\f\22\16\22\u00bf"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00c7\n\23\f\23\16\23\u00ca"+
		"\13\23\3\24\3\24\3\24\5\24\u00cf\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00d6"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00ea\n\26\3\27\3\27\3\30\3\30\3\30\7\30"+
		"\u00f1\n\30\f\30\16\30\u00f4\13\30\3\31\3\31\3\31\3\31\7\31\u00fa\n\31"+
		"\f\31\16\31\u00fd\13\31\3\31\5\31\u0100\n\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\2\4\"$\36\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668\2\5\3\2\n\13\4\2\32\32!\"\3\2\20\21\u0110"+
		"\2:\3\2\2\2\4<\3\2\2\2\6V\3\2\2\2\b^\3\2\2\2\nj\3\2\2\2\fl\3\2\2\2\16"+
		"w\3\2\2\2\20y\3\2\2\2\22\u0080\3\2\2\2\24\u0089\3\2\2\2\26\u0095\3\2\2"+
		"\2\30\u0097\3\2\2\2\32\u0099\3\2\2\2\34\u00a7\3\2\2\2\36\u00a9\3\2\2\2"+
		" \u00ad\3\2\2\2\"\u00b5\3\2\2\2$\u00c0\3\2\2\2&\u00ce\3\2\2\2(\u00d5\3"+
		"\2\2\2*\u00e9\3\2\2\2,\u00eb\3\2\2\2.\u00ed\3\2\2\2\60\u00f5\3\2\2\2\62"+
		"\u0101\3\2\2\2\64\u0103\3\2\2\2\66\u0105\3\2\2\28\u0108\3\2\2\2:;\5\4"+
		"\3\2;\3\3\2\2\2<=\7\3\2\2=>\5\16\b\2>?\7\5\2\2?C\5\6\4\2@B\5\32\16\2A"+
		"@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DH\3\2\2\2EC\3\2\2\2FG\7\6\2\2"+
		"GI\5\"\22\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\60\31\2KJ\3\2\2\2KL\3\2"+
		"\2\2LN\3\2\2\2MO\5\66\34\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\58\35\2QP\3"+
		"\2\2\2QR\3\2\2\2RT\3\2\2\2SU\7\34\2\2TS\3\2\2\2TU\3\2\2\2U\5\3\2\2\2V"+
		"[\5\b\5\2WX\7\36\2\2XZ\5\b\5\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\\7\3\2\2\2][\3\2\2\2^c\5\n\6\2_a\7\4\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2"+
		"\2\2bd\5\22\n\2c`\3\2\2\2cd\3\2\2\2d\t\3\2\2\2ek\5\f\7\2fg\7\37\2\2gh"+
		"\5\4\3\2hi\7 \2\2ik\3\2\2\2je\3\2\2\2jf\3\2\2\2k\13\3\2\2\2lm\7\32\2\2"+
		"m\r\3\2\2\2nx\7#\2\2ot\5\20\t\2pq\7\36\2\2qs\5\20\t\2rp\3\2\2\2sv\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wn\3\2\2\2wo\3\2\2\2x\17\3"+
		"\2\2\2y~\5\24\13\2z|\7\4\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\5\22\n"+
		"\2~{\3\2\2\2~\177\3\2\2\2\177\21\3\2\2\2\u0080\u0081\7\32\2\2\u0081\23"+
		"\3\2\2\2\u0082\u008a\7\32\2\2\u0083\u0084\7\32\2\2\u0084\u0085\7\35\2"+
		"\2\u0085\u008a\7\32\2\2\u0086\u0087\7\32\2\2\u0087\u0088\7\35\2\2\u0088"+
		"\u008a\7#\2\2\u0089\u0082\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0086\3\2"+
		"\2\2\u008a\25\3\2\2\2\u008b\u008e\7\32\2\2\u008c\u008d\7\35\2\2\u008d"+
		"\u008f\7\32\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0096\3"+
		"\2\2\2\u0090\u0093\7\32\2\2\u0091\u0092\7\35\2\2\u0092\u0094\7#\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u008b\3\2"+
		"\2\2\u0095\u0090\3\2\2\2\u0096\27\3\2\2\2\u0097\u0098\t\2\2\2\u0098\31"+
		"\3\2\2\2\u0099\u009a\5\34\17\2\u009a\u009b\5\f\7\2\u009b\u009c\7\30\2"+
		"\2\u009c\u009d\5\36\20\2\u009d\33\3\2\2\2\u009e\u009f\7\23\2\2\u009f\u00a8"+
		"\7\22\2\2\u00a0\u00a1\7\24\2\2\u00a1\u00a8\7\22\2\2\u00a2\u00a3\7\25\2"+
		"\2\u00a3\u00a8\7\22\2\2\u00a4\u00a5\7\26\2\2\u00a5\u00a6\7\27\2\2\u00a6"+
		"\u00a8\7\22\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a2\3"+
		"\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\5 \21\2\u00aa"+
		"\u00ab\7\33\2\2\u00ab\u00ac\5 \21\2\u00ac\37\3\2\2\2\u00ad\u00b2\5\16"+
		"\b\2\u00ae\u00af\7\36\2\2\u00af\u00b1\5\16\b\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3!\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b5\u00b6\b\22\1\2\u00b6\u00b7\5$\23\2\u00b7\u00bd"+
		"\3\2\2\2\u00b8\u00b9\f\4\2\2\u00b9\u00ba\7\13\2\2\u00ba\u00bc\5$\23\2"+
		"\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be#\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\b\23\1\2\u00c1"+
		"\u00c2\5&\24\2\u00c2\u00c8\3\2\2\2\u00c3\u00c4\f\4\2\2\u00c4\u00c5\7\n"+
		"\2\2\u00c5\u00c7\5&\24\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9%\3\2\2\2\u00ca\u00c8\3\2\2\2"+
		"\u00cb\u00cc\7\f\2\2\u00cc\u00cf\5&\24\2\u00cd\u00cf\5(\25\2\u00ce\u00cb"+
		"\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\'\3\2\2\2\u00d0\u00d1\7\37\2\2\u00d1"+
		"\u00d2\5\"\22\2\u00d2\u00d3\7 \2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d6\5*"+
		"\26\2\u00d5\u00d0\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6)\3\2\2\2\u00d7\u00d8"+
		"\7\32\2\2\u00d8\u00d9\7\33\2\2\u00d9\u00ea\5,\27\2\u00da\u00db\7\32\2"+
		"\2\u00db\u00dc\7\b\2\2\u00dc\u00ea\5,\27\2\u00dd\u00de\7\32\2\2\u00de"+
		"\u00df\7\7\2\2\u00df\u00e0\5,\27\2\u00e0\u00e1\7\n\2\2\u00e1\u00e2\5,"+
		"\27\2\u00e2\u00ea\3\2\2\2\u00e3\u00e4\7\32\2\2\u00e4\u00e5\7\t\2\2\u00e5"+
		"\u00e6\7\37\2\2\u00e6\u00e7\5.\30\2\u00e7\u00e8\7 \2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00d7\3\2\2\2\u00e9\u00da\3\2\2\2\u00e9\u00dd\3\2\2\2\u00e9"+
		"\u00e3\3\2\2\2\u00ea+\3\2\2\2\u00eb\u00ec\t\3\2\2\u00ec-\3\2\2\2\u00ed"+
		"\u00f2\5,\27\2\u00ee\u00ef\7\36\2\2\u00ef\u00f1\5,\27\2\u00f0\u00ee\3"+
		"\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"/\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\17\2\2\u00f6\u00fb\5\62\32"+
		"\2\u00f7\u00f8\7\36\2\2\u00f8\u00fa\5\62\32\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\5\64\33\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\61\3\2\2\2\u0101\u0102\7\32\2\2\u0102\63\3\2\2\2"+
		"\u0103\u0104\t\4\2\2\u0104\65\3\2\2\2\u0105\u0106\7\r\2\2\u0106\u0107"+
		"\7!\2\2\u0107\67\3\2\2\2\u0108\u0109\7\16\2\2\u0109\u010a\7!\2\2\u010a"+
		"9\3\2\2\2\36CHKNQT[`cjtw{~\u0089\u008e\u0093\u0095\u00a7\u00b2\u00bd\u00c8"+
		"\u00ce\u00d5\u00e9\u00f2\u00fb\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}