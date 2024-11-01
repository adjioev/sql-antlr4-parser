package com.ecwid.visitors;

import com.ecwid.antlrparser.SqlParser;
import com.ecwid.antlrparser.SqlParserBaseVisitor;
import com.ecwid.query.join.Join;
import com.ecwid.query.condition.JoinCondition;
import com.ecwid.query.join.JoinType;

public class JoinClauseVisitor extends SqlParserBaseVisitor<Join> {
    @Override
    public Join visitJoinClause(SqlParser.JoinClauseContext ctx) {
        String tableName = ctx.tableName().getText();
        JoinType joinType = mapJoinType(ctx.joinType());
        SqlParser.JoinConditionContext joinConditionContext = ctx.joinCondition();
        // This is for cross join
        if (joinConditionContext == null) {
            return new Join(joinType, tableName);
        } else {
            String leftCondition = joinConditionContext.joinElements(0).getText();
            String rightCondition = joinConditionContext.joinElements(1).getText();
            String operator = joinConditionContext.COMP_OPERATOR().getText();
            JoinCondition joinCondition = new JoinCondition(leftCondition, rightCondition, operator);
            return new Join(joinType, tableName, joinCondition);
        }
    }

    private JoinType mapJoinType(SqlParser.JoinTypeContext ctx) {
        if (ctx.INNER() != null) {
            return JoinType.INNER;
        } else if (ctx.LEFT() != null) {
            return JoinType.LEFT;
        } else if (ctx.RIGHT() != null) {
            return JoinType.RIGHT;
        } else if (ctx.FULL() != null && ctx.OUTER() != null) {
            return JoinType.FULL_OUTER;
        } else if (ctx.CROSS() != null) {
            return JoinType.CROSS;
        } else if (ctx.NATURAL() != null) {
            return JoinType.NATURAL;
        }else {
            return JoinType.INNER;
        }
    }



}








