package com.ecwid.query.where;

import java.util.List;
import java.util.stream.Collectors;

public class AndCondition implements WhereComponent {
    private final List<WhereComponent> conditions;

    public AndCondition(List<WhereComponent> conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "(" + conditions.stream()
                .map(WhereComponent::toString)
                .collect(Collectors.joining(" AND ")) + ")";
    }
}