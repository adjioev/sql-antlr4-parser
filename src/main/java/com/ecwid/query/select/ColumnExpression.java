package com.ecwid.query.select;

/**
 * @param tableName  Optional, can be null if unqualified
 * @param columnName Can be '*', or actual column name
 */
public record ColumnExpression(String tableName, String columnName) implements Expression {

    // Optional: Override toString() for debugging
    @Override
    public String toString() {
        if (tableName != null) {
            return tableName + "." + columnName;
        } else {
            return columnName;
        }
    }
}