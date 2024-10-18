package com.ecwid.query.where;

public class NotCondition implements WhereComponent {
    private WhereComponent condition;

    public NotCondition(WhereComponent condition) {
        this.condition = condition;
    }

    public WhereComponent getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "NOT (" + condition.toString() + ")";
    }
}