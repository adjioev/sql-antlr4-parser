package com.ecwid.query.select;

import lombok.Getter;

@Getter
public record SelectElement(Expression expression, String alias) implements SelectComponent {

    public String toString() {
        return expression.toString() + (alias != null ? " AS " + alias : "");
    }
}