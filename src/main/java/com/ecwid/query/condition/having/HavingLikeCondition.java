package com.ecwid.query.condition.having;

import com.ecwid.query.condition.LikeCondition;

public class HavingLikeCondition implements LikeCondition {
    private final String aggregateFunction;
    private final String column;
    private final String pattern;

    public HavingLikeCondition(String aggregateFunction, String column, Object pattern) {
        this.aggregateFunction = aggregateFunction;
        this.column = column;
        this.pattern = pattern.toString();
    }

    @Override
    public String toString() {
        return  aggregateFunction + "(" + column + ") " + " LIKE '" + pattern + "'";
    }
}