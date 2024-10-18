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
	 * Visit a parse tree produced by {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(SqlParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereExpression(SqlParser.WhereExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClauses(SqlParser.WhereClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(SqlParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(SqlParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereValue(SqlParser.WhereValueContext ctx);
}