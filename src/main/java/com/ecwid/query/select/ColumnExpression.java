package com.ecwid.query.select;

import lombok.Getter;

@Getter
public record ColumnExpression(String columnName) implements Expression {

    public String toString() {
        return columnName;
    }

}