package com.ecwid.query.condition.where;

import com.ecwid.query.condition.ComparisonCondition;

public record WhereComparisonCondition(String column, String operator, Object value) implements ComparisonCondition {
    @Override
    public String toString() {
        String valueStr;
        if (value instanceof String) {
            valueStr = "'" + value + "'";
        } else {
            valueStr = value.toString();
        }
        return column + " " + operator + " " + valueStr;
    }
}