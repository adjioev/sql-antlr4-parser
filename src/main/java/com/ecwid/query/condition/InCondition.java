package com.ecwid.query.condition;

import java.util.List;
import java.util.stream.Collectors;

public record InCondition(String column, List<Object> values) implements Condition {

    @Override
    public String toString() {
        String valuesStr = values.stream()
                .map(this::formatValue)
                .collect(Collectors.joining(", "));
        return column + " IN (" + valuesStr + ")";
    }

    private String formatValue(Object value) {
        if (value instanceof String) {
            return "'" + value + "'";
        }
        return value.toString();
    }
}