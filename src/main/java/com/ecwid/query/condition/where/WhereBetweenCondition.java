package com.ecwid.query.condition.where;

import com.ecwid.query.condition.BetweenCondition;

public record WhereBetweenCondition(String column, Object lowerBound, Object upperBound) implements BetweenCondition {
    @Override
    public String toString() {
        return column + " BETWEEN " + formatValue(lowerBound) + " AND " + formatValue(upperBound);
    }

    private String formatValue(Object value) {
        return (value instanceof String) ? "'" + value + "'" : value.toString();
    }
}