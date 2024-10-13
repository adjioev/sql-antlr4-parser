package com.ecwid.query;

import java.util.ArrayList;
import java.util.List;

public class Query {
    private String tableName;

    private final List<String> columns = new ArrayList<>();


    public List<String> getColumns() {
        return columns;
    }

    public void addColumn(String column) {
        columns.add(column);
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    @Override
    public String toString() {
        return String.format("Query{columns=%s, tableName='%s'}", columns, tableName);
    }


}
