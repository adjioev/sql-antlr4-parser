package com.ecwid.query.condition;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ComparisonCondition implements Condition {
    private String column;
    private String operator;
    private Object value;

    @Override
    public String toString() {
        return column + " " + operator + " " + value;
    }
}