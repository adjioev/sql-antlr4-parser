package com.ecwid.query.condition.where;

import com.ecwid.query.condition.InCondition;
import java.util.List;
import java.util.stream.Collectors;

public record WhereInCondition(String column, List<Object> values) implements InCondition {
    @Override
    public String toString() {
        String valuesStr = values.stream()
                .map(this::formatValue)
                .collect(Collectors.joining(", "));
        return  column + " IN (" + valuesStr + ")";
    }

    private String formatValue(Object value) {
        return (value instanceof String) ? "'" + value + "'" : value.toString();
    }
}

