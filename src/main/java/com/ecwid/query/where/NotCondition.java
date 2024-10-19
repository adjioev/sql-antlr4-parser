package com.ecwid.query.where;

import lombok.Getter;

@Getter
public class NotCondition implements WhereComponent {
    private final WhereComponent condition;

    public NotCondition(WhereComponent condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "NOT (" + condition.toString() + ")";
    }
}