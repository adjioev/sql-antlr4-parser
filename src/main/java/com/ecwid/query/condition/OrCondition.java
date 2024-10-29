package com.ecwid.query.condition;

import java.util.List;
import java.util.stream.Collectors;

public class OrCondition implements Condition {
    private final List<Condition> conditions;

    public OrCondition(List<Condition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "(" + conditions.stream()
                .map(Condition::toString)
                .collect(Collectors.joining(" OR ")) + ")";
    }
}