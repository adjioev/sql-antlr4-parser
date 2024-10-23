package com.ecwid.query.join;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JoinCondition {
    private final String leftCondition;
    private final String rightCondition;
    private final String operator;

    public String toString() {
        return String.format("{ '%s' %s '%s' }", leftCondition, operator, rightCondition
        );
    }
}
