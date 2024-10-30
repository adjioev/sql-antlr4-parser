package com.ecwid.query.condition.where;

import com.ecwid.query.condition.ComparisonCondition;

public record WhereComparisonCondition(String column, String operator, Object value) implements ComparisonCondition {
    @Override
    public String toString() {
        return column + " " + operator + " " + value;
    }
}