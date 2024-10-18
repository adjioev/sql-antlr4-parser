package com.ecwid.query.where;

import java.util.List;
import java.util.stream.Collectors;

public class InCondition implements WhereComponent {
    private String column;
    private List<Object> values;

    public InCondition(String column, List<Object> values) {
        this.column = column;
        this.values = values;
    }

    public String getColumn() {
        return column;
    }

    public List<Object> getValues() {
        return values;
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