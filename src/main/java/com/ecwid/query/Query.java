package com.ecwid.query;

import java.util.ArrayList;
import java.util.List;

//class Query {
//    private List<String> columns; - need support for *
//    private List<Source> fromSources;
//    private List<Join> joins;
//    private List<WhereClause> whereClauses;
//    private List<String> groupByColumns;
//    private List<Sort> sortColumns;
//    private Integer limit;
//    private Integer offset;
//}
public class Query {
    private final List<String> columns = new ArrayList<>();

    private String tableName;

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
