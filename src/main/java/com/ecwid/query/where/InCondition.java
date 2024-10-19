package com.ecwid.query.where;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class InCondition implements WhereComponent {
    private final String column;
    private final List<Object> values;

    public InCondition(String column, List<Object> values) {
        this.column = column;
        this.values = values;
    }

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