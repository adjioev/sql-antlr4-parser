package com.ecwid.query.select;

import lombok.Getter;

@Getter
public class ColumnExpression implements Expression {
    private final String columnName;

    public ColumnExpression(String columnName) {
        this.columnName = columnName;
    }

    public String toString() {
        return columnName;
    }

}