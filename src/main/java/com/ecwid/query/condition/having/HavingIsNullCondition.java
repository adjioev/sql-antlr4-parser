package com.ecwid.query.condition.having;

import com.ecwid.query.condition.IsNullCondition;

public record HavingIsNullCondition(String aggregateFunction, String column, boolean isNot) implements IsNullCondition {
    @Override
    public String toString() {
        return  aggregateFunction + "(" + column + ") " + " IS " + (isNot ? "NOT " : "") + "NULL";
    }
}