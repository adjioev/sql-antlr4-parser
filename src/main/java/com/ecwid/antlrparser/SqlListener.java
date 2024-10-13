// Generated from Sql.g4 by ANTLR 4.5.3
package com.ecwid.antlrparser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(SqlParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(SqlParser.SelectStatementContext ctx);
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
}