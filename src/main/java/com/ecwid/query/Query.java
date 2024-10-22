package com.ecwid.query;

import com.ecwid.query.where.WhereComponent;
import lombok.Getter;
import lombok.Setter;

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
@Getter
public class Query {
    private final List<String> columns = new ArrayList<>();

    @Setter
    private WhereComponent whereComponent;

    @Setter
    private String tableName;

    @Setter
    private Sort sort;

    @Setter
    private int limit;

    @Setter
    private int offset;

    public void addColumn(String column) {
        columns.add(column);
    }

    @Override
    public String toString() {
        return String.format("""
                        Query{
                            columns='%s',
                            tableName='%s',
                            Where='%s',
                            Sort='%s',
                            Limit='%s',
                            Offset='%s'
                        }""",
                columns, tableName, whereComponent, sort, limit, offset
        );

    }


}
