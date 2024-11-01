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
	 * Enter a parse tree produced by the {@code AsteriskExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAsteriskExpr(SqlParser.AsteriskExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsteriskExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAsteriskExpr(SqlParser.AsteriskExprContext ctx);
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
	 * Enter a parse tree produced by the {@code HavingAndExpressionInOr}
	 * labeled alternative in {@link SqlParser#havingOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterHavingAndExpressionInOr(SqlParser.HavingAndExpressionInOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingAndExpressionInOr}
	 * labeled alternative in {@link SqlParser#havingOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitHavingAndExpressionInOr(SqlParser.HavingAndExpressionInOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingOrOperation}
	 * labeled alternative in {@link SqlParser#havingOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterHavingOrOperation(SqlParser.HavingOrOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingOrOperation}
	 * labeled alternative in {@link SqlParser#havingOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitHavingOrOperation(SqlParser.HavingOrOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingAndOperation}
	 * labeled alternative in {@link SqlParser#havingAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterHavingAndOperation(SqlParser.HavingAndOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingAndOperation}
	 * labeled alternative in {@link SqlParser#havingAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitHavingAndOperation(SqlParser.HavingAndOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingUnaryExpressionInAnd}
	 * labeled alternative in {@link SqlParser#havingAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterHavingUnaryExpressionInAnd(SqlParser.HavingUnaryExpressionInAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingUnaryExpressionInAnd}
	 * labeled alternative in {@link SqlParser#havingAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitHavingUnaryExpressionInAnd(SqlParser.HavingUnaryExpressionInAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingNotOperation}
	 * labeled alternative in {@link SqlParser#havingUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterHavingNotOperation(SqlParser.HavingNotOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingNotOperation}
	 * labeled alternative in {@link SqlParser#havingUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitHavingNotOperation(SqlParser.HavingNotOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingPrimaryExpr}
	 * labeled alternative in {@link SqlParser#havingUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterHavingPrimaryExpr(SqlParser.HavingPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingPrimaryExpr}
	 * labeled alternative in {@link SqlParser#havingUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitHavingPrimaryExpr(SqlParser.HavingPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingNestedExpr}
	 * labeled alternative in {@link SqlParser#havingPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterHavingNestedExpr(SqlParser.HavingNestedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingNestedExpr}
	 * labeled alternative in {@link SqlParser#havingPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitHavingNestedExpr(SqlParser.HavingNestedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingSimpleCondition}
	 * labeled alternative in {@link SqlParser#havingPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterHavingSimpleCondition(SqlParser.HavingSimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingSimpleCondition}
	 * labeled alternative in {@link SqlParser#havingPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitHavingSimpleCondition(SqlParser.HavingSimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingAsterisk}
	 * labeled alternative in {@link SqlParser#havingColumn}.
	 * @param ctx the parse tree
	 */
	void enterHavingAsterisk(SqlParser.HavingAsteriskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingAsterisk}
	 * labeled alternative in {@link SqlParser#havingColumn}.
	 * @param ctx the parse tree
	 */
	void exitHavingAsterisk(SqlParser.HavingAsteriskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingColumnName}
	 * labeled alternative in {@link SqlParser#havingColumn}.
	 * @param ctx the parse tree
	 */
	void enterHavingColumnName(SqlParser.HavingColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingColumnName}
	 * labeled alternative in {@link SqlParser#havingColumn}.
	 * @param ctx the parse tree
	 */
	void exitHavingColumnName(SqlParser.HavingColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingQualifiedColumnName}
	 * labeled alternative in {@link SqlParser#havingColumn}.
	 * @param ctx the parse tree
	 */
	void enterHavingQualifiedColumnName(SqlParser.HavingQualifiedColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingQualifiedColumnName}
	 * labeled alternative in {@link SqlParser#havingColumn}.
	 * @param ctx the parse tree
	 */
	void exitHavingQualifiedColumnName(SqlParser.HavingQualifiedColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingIsNullCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingIsNullCondition(SqlParser.HavingIsNullConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingIsNullCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingIsNullCondition(SqlParser.HavingIsNullConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingComparisonCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingComparisonCondition(SqlParser.HavingComparisonConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingComparisonCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingComparisonCondition(SqlParser.HavingComparisonConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingLikeCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingLikeCondition(SqlParser.HavingLikeConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingLikeCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingLikeCondition(SqlParser.HavingLikeConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingBetweenCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingBetweenCondition(SqlParser.HavingBetweenConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingBetweenCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingBetweenCondition(SqlParser.HavingBetweenConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingInCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingInCondition(SqlParser.HavingInConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingInCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingInCondition(SqlParser.HavingInConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#havingValue}.
	 * @param ctx the parse tree
	 */
	void enterHavingValue(SqlParser.HavingValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#havingValue}.
	 * @param ctx the parse tree
	 */
	void exitHavingValue(SqlParser.HavingValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#havingValueList}.
	 * @param ctx the parse tree
	 */
	void enterHavingValueList(SqlParser.HavingValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#havingValueList}.
	 * @param ctx the parse tree
	 */
	void exitHavingValueList(SqlParser.HavingValueListContext ctx);
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
	 * Enter a parse tree produced by the {@code IsNullCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterIsNullCondition(SqlParser.IsNullConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNullCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitIsNullCondition(SqlParser.IsNullConditionContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SqlParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunction(SqlParser.AggregateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunction(SqlParser.AggregateFunctionContext ctx);
}