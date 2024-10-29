package com.ecwid.query;

import com.ecwid.query.condition.Condition;
import com.ecwid.query.join.Join;
import com.ecwid.query.select.AsteriskSelect;
import com.ecwid.query.select.SelectComponent;
import com.ecwid.query.select.SelectList;
import com.ecwid.query.source.SourceComponent;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
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

    @Setter
    private SourceComponent sourceComponent;


    private final List<Join> joins = new ArrayList<>();

    @Setter
    private Condition whereComponent;

    @Setter
    private Condition havingComponent;

    //TODO: delete this, temp solution
    @Setter
    private String tableName;

    @Setter
    private GroupBy groupBy;

    @Setter
    private Sort sort;

    @Setter
    private int limit;

    @Setter
    private int offset;

    public void addJoin(Join join) {
        joins.add(join);
    }


    // Method to get the list of selected columns
    public List<String> getColumns() {
        if (selectComponent instanceof AsteriskSelect) {
            return List.of("*");
        } else if (selectComponent instanceof SelectList selectList) {
            return selectList.getColumns();
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public String toString() {
        return String.format("""
                        Query{
                            columns='%s',
                            sources='%s',
                            joins='%s',
                            GroupBy='%s',
                            Where='%s',
                            Sort='%s',
                            Limit='%s',
                            Offset='%s'
                        }""",
                selectComponent, sourceComponent, joins, groupBy, whereComponent, sort, limit, offset
        );

    }


}
