// Generated from SqlParser.g4 by ANTLR 4.5.3
package com.ecwid.antlrparser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SqlParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SqlParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SqlParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupByColumnName}
	 * labeled alternative in {@link SqlParser#groupColumn}.
	 * @param ctx the parse tree
	 */
	void enterGroupByColumnName(SqlParser.GroupByColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupByColumnName}
	 * labeled alternative in {@link SqlParser#groupColumn}.
	 * @param ctx the parse tree
	 */
	void exitGroupByColumnName(SqlParser.GroupByColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupByQualifiedColumnName}
	 * labeled alternative in {@link SqlParser#groupColumn}.
	 * @param ctx the parse tree
	 */
	void enterGroupByQualifiedColumnName(SqlParser.GroupByQualifiedColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupByQualifiedColumnName}
	 * labeled alternative in {@link SqlParser#groupColumn}.
	 * @param ctx the parse tree
	 */
	void exitGroupByQualifiedColumnName(SqlParser.GroupByQualifiedColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsteriskSelect}
	 * labeled alternative in {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterAsteriskSelect(SqlParser.AsteriskSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsteriskSelect}
	 * labeled alternative in {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitAsteriskSelect(SqlParser.AsteriskSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectList}
	 * labeled alternative in {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(SqlParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectList}
	 * labeled alternative in {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(SqlParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(SqlParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(SqlParser.SelectElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SqlParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SqlParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnNameExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterColumnNameExpr(SqlParser.ColumnNameExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnNameExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitColumnNameExpr(SqlParser.ColumnNameExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QualifiedColumnNameExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColumnNameExpr(SqlParser.QualifiedColumnNameExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QualifiedColumnNameExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColumnNameExpr(SqlParser.QualifiedColumnNameExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableAsteriskExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTableAsteriskExpr(SqlParser.TableAsteriskExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableAsteriskExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTableAsteriskExpr(SqlParser.TableAsteriskExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(SqlParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(SqlParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SqlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SqlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableList}.
	 * @param ctx the parse tree
	 */
	void enterTableList(SqlParser.TableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableList}.
	 * @param ctx the parse tree
	 */
	void exitTableList(SqlParser.TableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(SqlParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(SqlParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableNameSource}
	 * labeled alternative in {@link SqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableNameSource(SqlParser.TableNameSourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableNameSource}
	 * labeled alternative in {@link SqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableNameSource(SqlParser.TableNameSourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubquerySource}
	 * labeled alternative in {@link SqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterSubquerySource(SqlParser.SubquerySourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubquerySource}
	 * labeled alternative in {@link SqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitSubquerySource(SqlParser.SubquerySourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(SqlParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(SqlParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(SqlParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(SqlParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void enterJoinCondition(SqlParser.JoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void exitJoinCondition(SqlParser.JoinConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#joinElements}.
	 * @param ctx the parse tree
	 */
	void enterJoinElements(SqlParser.JoinElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#joinElements}.
	 * @param ctx the parse tree
	 */
	void exitJoinElements(SqlParser.JoinElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrOperation}
	 * labeled alternative in {@link SqlParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrOperation(SqlParser.OrOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrOperation}
	 * labeled alternative in {@link SqlParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrOperation(SqlParser.OrOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpressionInOr}
	 * labeled alternative in {@link SqlParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpressionInOr(SqlParser.AndExpressionInOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpressionInOr}
	 * labeled alternative in {@link SqlParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpressionInOr(SqlParser.AndExpressionInOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpressionInAnd}
	 * labeled alternative in {@link SqlParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionInAnd(SqlParser.UnaryExpressionInAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpressionInAnd}
	 * labeled alternative in {@link SqlParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionInAnd(SqlParser.UnaryExpressionInAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOperation}
	 * labeled alternative in {@link SqlParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndOperation(SqlParser.AndOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOperation}
	 * labeled alternative in {@link SqlParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndOperation(SqlParser.AndOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotOperation}
	 * labeled alternative in {@link SqlParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotOperation(SqlParser.NotOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotOperation}
	 * labeled alternative in {@link SqlParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotOperation(SqlParser.NotOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link SqlParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(SqlParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link SqlParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(SqlParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedExpr}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpr(SqlParser.NestedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedExpr}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpr(SqlParser.NestedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleCondition}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCondition(SqlParser.SimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleCondition}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCondition(SqlParser.SimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterComparisonCondition(SqlParser.ComparisonConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitComparisonCondition(SqlParser.ComparisonConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LikeCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterLikeCondition(SqlParser.LikeConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LikeCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitLikeCondition(SqlParser.LikeConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BetweenCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterBetweenCondition(SqlParser.BetweenConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BetweenCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitBetweenCondition(SqlParser.BetweenConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterInCondition(SqlParser.InConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitInCondition(SqlParser.InConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereValue}.
	 * @param ctx the parse tree
	 */
	void enterWhereValue(SqlParser.WhereValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereValue}.
	 * @param ctx the parse tree
	 */
	void exitWhereValue(SqlParser.WhereValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereValueList}.
	 * @param ctx the parse tree
	 */
	void enterWhereValueList(SqlParser.WhereValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereValueList}.
	 * @param ctx the parse tree
	 */
	void exitWhereValueList(SqlParser.WhereValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SqlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SqlParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#orderColumn}.
	 * @param ctx the parse tree
	 */
	void enterOrderColumn(SqlParser.OrderColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#orderColumn}.
	 * @param ctx the parse tree
	 */
	void exitOrderColumn(SqlParser.OrderColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(SqlParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(SqlParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(SqlParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(SqlParser.OffsetClauseContext ctx);
}