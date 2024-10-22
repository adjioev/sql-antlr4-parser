package com.ecwid.query.where;

import lombok.Getter;

@Getter
public class BetweenCondition implements WhereComponent {
    private final String column;
    private final Object lowerBound; // TODO: string or int?
    private final Object upperBound;

    public BetweenCondition(String column, Object lowerBound, Object upperBound) {
        this.column = column;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

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