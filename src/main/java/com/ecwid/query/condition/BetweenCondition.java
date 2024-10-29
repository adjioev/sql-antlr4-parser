package com.ecwid.query.condition;

/**
 * @param lowerBound TODO: string or int?
 */
public record BetweenCondition(String column, Object lowerBound, Object upperBound) implements Condition {

    @Override
    public String toString() {
        return column + " BETWEEN " + formatValue(lowerBound) + " AND " + formatValue(upperBound);
    }

    private String formatValue(Object value) {
        if (value instanceof String) {
            return "'" + value + "'";
        }
        return value.toString();
    }
}