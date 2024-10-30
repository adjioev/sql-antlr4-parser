package com.ecwid.query.condition.where;

import com.ecwid.query.condition.LikeCondition;

public class WhereLikeCondition implements LikeCondition {
    private final String column;
    private final String pattern;

    public WhereLikeCondition(String column, Object pattern) {
        this.column = column;
        this.pattern = pattern.toString();
    }

    @Override
    public String toString() {
        return column + " LIKE '" + pattern + "'";
    }
}