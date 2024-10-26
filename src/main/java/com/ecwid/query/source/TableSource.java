package com.ecwid.query.source;

public class TableSource extends Source {
    private String tableName;

    public TableSource(String tableName, String alias) {
        this.tableName = tableName;
        this.alias = alias;
    }

    public String getTableName() {
        return tableName;
    }
}