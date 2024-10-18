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
	 * Enter a parse tree produced by {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(SqlParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(SqlParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhereExpression(SqlParser.WhereExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhereExpression(SqlParser.WhereExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereClauses}.
	 * @param ctx the parse tree
	 */
	void enterWhereClauses(SqlParser.WhereClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereClauses}.
	 * @param ctx the parse tree
	 */
	void exitWhereClauses(SqlParser.WhereClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(SqlParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(SqlParser.ColumnNameContext ctx);
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
	 * Enter a parse tree produced by {@link SqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(SqlParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(SqlParser.LogicalOperatorContext ctx);
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
}