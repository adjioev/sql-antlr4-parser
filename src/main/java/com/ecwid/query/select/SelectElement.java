package com.ecwid.query.select;

import lombok.Getter;

@Getter
public class SelectElement implements SelectComponent {
    private final Expression expression;
    private final String alias;

    public SelectElement(Expression expression, String alias) {
        this.expression = expression;
        this.alias = alias;
    }

    public String toString() {
        return expression.toString() + (alias != null ? " AS " + alias : "");
    }
}