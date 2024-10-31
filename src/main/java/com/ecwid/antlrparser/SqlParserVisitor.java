// Generated from SqlParser.g4 by ANTLR 4.5.3
package com.ecwid.antlrparser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SqlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(SqlParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupByColumnName}
	 * labeled alternative in {@link SqlParser#groupColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByColumnName(SqlParser.GroupByColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupByQualifiedColumnName}
	 * labeled alternative in {@link SqlParser#groupColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByQualifiedColumnName(SqlParser.GroupByQualifiedColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsteriskSelect}
	 * labeled alternative in {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsteriskSelect(SqlParser.AsteriskSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectList}
	 * labeled alternative in {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(SqlParser.SelectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElement(SqlParser.SelectElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SqlParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnNameExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameExpr(SqlParser.ColumnNameExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsteriskExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsteriskExpr(SqlParser.AsteriskExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QualifiedColumnNameExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedColumnNameExpr(SqlParser.QualifiedColumnNameExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableAsteriskExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAsteriskExpr(SqlParser.TableAsteriskExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(SqlParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SqlParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableList(SqlParser.TableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(SqlParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableNameSource}
	 * labeled alternative in {@link SqlParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNameSource(SqlParser.TableNameSourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubquerySource}
	 * labeled alternative in {@link SqlParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquerySource(SqlParser.SubquerySourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(SqlParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(SqlParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#joinCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCondition(SqlParser.JoinConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#joinElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinElements(SqlParser.JoinElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(SqlParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingAndExpressionInOr}
	 * labeled alternative in {@link SqlParser#havingOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingAndExpressionInOr(SqlParser.HavingAndExpressionInOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingOrOperation}
	 * labeled alternative in {@link SqlParser#havingOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingOrOperation(SqlParser.HavingOrOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingAndOperation}
	 * labeled alternative in {@link SqlParser#havingAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingAndOperation(SqlParser.HavingAndOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingUnaryExpressionInAnd}
	 * labeled alternative in {@link SqlParser#havingAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingUnaryExpressionInAnd(SqlParser.HavingUnaryExpressionInAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingNotOperation}
	 * labeled alternative in {@link SqlParser#havingUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingNotOperation(SqlParser.HavingNotOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingPrimaryExpr}
	 * labeled alternative in {@link SqlParser#havingUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingPrimaryExpr(SqlParser.HavingPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingNestedExpr}
	 * labeled alternative in {@link SqlParser#havingPrimaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingNestedExpr(SqlParser.HavingNestedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingSimpleCondition}
	 * labeled alternative in {@link SqlParser#havingPrimaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingSimpleCondition(SqlParser.HavingSimpleConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingColumnName}
	 * labeled alternative in {@link SqlParser#havingColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingColumnName(SqlParser.HavingColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingQualifiedColumnName}
	 * labeled alternative in {@link SqlParser#havingColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingQualifiedColumnName(SqlParser.HavingQualifiedColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingIsNullCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingIsNullCondition(SqlParser.HavingIsNullConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingComparisonCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingComparisonCondition(SqlParser.HavingComparisonConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingLikeCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingLikeCondition(SqlParser.HavingLikeConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingBetweenCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingBetweenCondition(SqlParser.HavingBetweenConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingInCondition}
	 * labeled alternative in {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingInCondition(SqlParser.HavingInConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#havingValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingValue(SqlParser.HavingValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#havingValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingValueList(SqlParser.HavingValueListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrOperation}
	 * labeled alternative in {@link SqlParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperation(SqlParser.OrOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpressionInOr}
	 * labeled alternative in {@link SqlParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpressionInOr(SqlParser.AndExpressionInOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpressionInAnd}
	 * labeled alternative in {@link SqlParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionInAnd(SqlParser.UnaryExpressionInAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOperation}
	 * labeled alternative in {@link SqlParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperation(SqlParser.AndOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotOperation}
	 * labeled alternative in {@link SqlParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperation(SqlParser.NotOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link SqlParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(SqlParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NestedExpr}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpr(SqlParser.NestedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleCondition}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCondition(SqlParser.SimpleConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsNullCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullCondition(SqlParser.IsNullConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonCondition(SqlParser.ComparisonConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LikeCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeCondition(SqlParser.LikeConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BetweenCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenCondition(SqlParser.BetweenConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InCondition}
	 * labeled alternative in {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInCondition(SqlParser.InConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereValue(SqlParser.WhereValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereValueList(SqlParser.WhereValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SqlParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orderColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderColumn(SqlParser.OrderColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(SqlParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(SqlParser.OffsetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aggregateFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunction(SqlParser.AggregateFunctionContext ctx);
}