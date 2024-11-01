package com.ecwid.query.condition;

public record JoinCondition(String leftCondition, String rightCondition, String operator) implements Condition {
    public String toString() {
        return String.format("%s %s %s", leftCondition, operator, rightCondition
        );
    }
}
