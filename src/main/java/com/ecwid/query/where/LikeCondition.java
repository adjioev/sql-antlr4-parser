package com.ecwid.query.where;

import lombok.Getter;

@Getter
public class LikeCondition implements WhereComponent {
    private final String column;
    private final String pattern;

    public LikeCondition(String column, Object pattern) {
        this.column = column;
        this.pattern = pattern.toString();
    }

    @Override
    public String toString() {
        return column + " LIKE '" + pattern + "'";
    }
}