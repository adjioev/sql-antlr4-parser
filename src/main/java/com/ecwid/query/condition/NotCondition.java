package com.ecwid.query.condition;

import lombok.Getter;

@Getter
public class NotCondition implements Condition {
    private final Condition condition;

    public NotCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "NOT (" + condition.toString() + ")";
    }
}