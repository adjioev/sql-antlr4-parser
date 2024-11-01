package com.ecwid.query.select;


import com.ecwid.query.expression.Expression;

public record SelectElement(Expression expression, String alias) implements SelectComponent {
    public String toString() {
        return expression.toString() + (alias != null ? " AS " + alias : "");
    }
}