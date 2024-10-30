package com.ecwid.query.condition.where;

import com.ecwid.query.condition.IsNullCondition;

public record WhereIsNullCondition(String column, boolean isNot) implements IsNullCondition {
    @Override
    public String toString() {
        return column + " IS " + (isNot ? "NOT " : "") + "NULL";
    }
}