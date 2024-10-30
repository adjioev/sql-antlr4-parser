package com.ecwid.query.condition.having;

import com.ecwid.query.condition.BetweenCondition;

public record HavingBetweenCondition(String aggregateFunction, String column, Object lowerBound, Object upperBound) implements BetweenCondition {
    @Override
    public String toString() {
        return aggregateFunction + "(" + column + ") BETWEEN " + formatValue(lowerBound) + " AND " + formatValue(upperBound);
    }

    private String formatValue(Object value) {
        return (value instanceof String) ? "'" + value + "'" : value.toString();
    }
}