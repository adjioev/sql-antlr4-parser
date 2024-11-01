package com.ecwid.query.join;

import com.ecwid.query.condition.JoinCondition;
import lombok.Getter;

@Getter
public class Join {
    private final JoinType joinType;

    private final String tableName;

    // TODO: USING condition is not supported yet (out of scope)
    private final JoinCondition joinCondition;

    public Join(JoinType joinType, String tableName, JoinCondition joinCondition) {
        this.joinType = joinType;
        this.tableName = tableName;
        this.joinCondition = joinCondition;
    }

    public Join(JoinType joinType, String tableName) {
        this.joinType = joinType;
        this.tableName = tableName;
        this.joinCondition = null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(joinType.toString()).append(" JOIN ").append(tableName);
        if (joinCondition != null) {
            sb.append(" ON ").append(joinCondition.toString());
        }
        return sb.toString();
    }
}