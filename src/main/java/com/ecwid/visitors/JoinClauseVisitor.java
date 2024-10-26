package com.ecwid.visitors;

import com.ecwid.antlrparser.SqlParser;
import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.query.join.Join;
import com.ecwid.query.join.JoinCondition;

public class JoinClauseVisitor extends SqlParserBaseVisitor<Join> {
    @Override
    public Join visitJoinClause(SqlParser.JoinClauseContext ctx) {
        String tableName = ctx.tableName().getText();
        String joinType = ctx.joinType().getText();
        SqlParser.JoinConditionContext joinConditionContext = ctx.joinCondition();
        String leftCondition = joinConditionContext.joinElements(0).getText();
        String rightCondition = joinConditionContext.joinElements(1).getText();
        String opeator = joinConditionContext.COMP_OPERATOR().getText();
        JoinCondition joinCondition = new JoinCondition(leftCondition, rightCondition, opeator);
        return new Join(tableName, joinType, joinCondition);
    }
}
