package com.ecwid.query.where;

import java.util.List;
import java.util.stream.Collectors;

public class OrCondition implements WhereComponent {
    private final List<WhereComponent> conditions;

    public OrCondition(List<WhereComponent> conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "(" + conditions.stream()
                .map(WhereComponent::toString)
                .collect(Collectors.joining(" OR ")) + ")";
    }
}