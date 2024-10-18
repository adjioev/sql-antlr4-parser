package com.ecwid.query.where;

public class BetweenCondition implements WhereComponent {
    private String column;
    private Object lowerBound;
    private Object upperBound;

    public BetweenCondition(String column, Object lowerBound, Object upperBound) {
        this.column = column;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public String getColumn() {
        return column;
    }

    public Object getLowerBound() {
        return lowerBound;
    }

    public Object getUpperBound() {
        return upperBound;
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