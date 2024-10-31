package com.ecwid.query.source;

import lombok.Getter;

@Getter
public class TableSource extends Source {
    private final String tableName;

    public TableSource(String tableName) {
        this.tableName = tableName;
    }

    public String toString() {
        if (alias != null) {
            return tableName + " AS " + alias;
        }
        return tableName;
    }
}