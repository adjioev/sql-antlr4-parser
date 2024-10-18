package com.ecwid.query.where;

public class LikeCondition implements WhereComponent {
    private String column;
    private String pattern;

    public LikeCondition(String column, Object pattern) {
        this.column = column;
        this.pattern = pattern.toString();
    }

    public String getColumn() {
        return column;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return column + " LIKE '" + pattern + "'";
    }
}