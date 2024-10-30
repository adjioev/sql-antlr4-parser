package com.ecwid.query.condition.having;

import com.ecwid.query.condition.ComparisonCondition;


public record HavingComparisonCondition(String aggregateFunction, String column, String operator,
                                        Object value) implements ComparisonCondition {
    @Override
    public String toString() {
        return aggregateFunction + "(" + column + ") " + operator + " " + value;
    }
}