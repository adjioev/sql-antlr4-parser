package com.ecwid.query.join;

public record JoinCondition(String leftCondition, String rightCondition, String operator) {
    public String toString() {
        return String.format("{ '%s' %s '%s' }", leftCondition, operator, rightCondition
        );
    }
}
