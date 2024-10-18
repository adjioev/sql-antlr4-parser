package com.ecwid.query.where;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WhereClause implements WhereComponent {
    private String column;
    private String operator;
    private Object value;

    @Override
    public String toString() {
        return column + " " + operator + " " + value;
    }
}