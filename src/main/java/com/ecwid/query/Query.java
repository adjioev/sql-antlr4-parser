package com.ecwid.query;

import com.ecwid.query.join.Join;
import com.ecwid.query.select.SelectComponent;
import com.ecwid.query.where.WhereComponent;
import lombok.Getter;
import lombok.Setter;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;

//class Query {
//    private List<String> columns; - SelectItem
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
    @Setter
    private SelectComponent selectComponent;

    //FROM Sources
    private List<Source> fromSources = new ArrayList<>();

    //
    private final List<Join> joins = new ArrayList<>();

    @Setter
    private WhereComponent whereComponent;

    //TODO: delete this, temp solution
    @Setter
    private String tableName;

    @Setter
    private Sort sort;

    @Setter
    private int limit;

    @Setter
    private int offset;

    public void addJoin(Join join) {
        joins.add(join);
    }

    @Override
    public String toString() {
        return String.format("""
                        Query{
                            columns='%s',
                            tableName='%s',
                            joins='%s',
                            Where='%s',
                            Sort='%s',
                            Limit='%s',
                            Offset='%s'
                        }""",
                selectComponent, tableName, joins, whereComponent, sort, limit, offset
        );

    }


}
