package com.ecwid.query;

import com.ecwid.query.condition.Condition;
import com.ecwid.query.join.Join;
import com.ecwid.query.select.AsteriskSelect;
import com.ecwid.query.select.SelectComponent;
import com.ecwid.query.select.SelectList;
import com.ecwid.query.source.SourceComponent;
import lombok.Getter;
import lombok.Setter;
import java.util.Collections;
import java.util.List;

@Setter
@Getter
public class Query {

    private SelectComponent selectComponent;

    private SourceComponent sourceComponent;

    private List<Join> joins;

    private Condition whereComponent;

    private Condition havingComponent;

    private GroupBy groupBy;

    private Sort sort;

    private int limit;

    private int offset;

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
        StringBuilder sb = new StringBuilder();
        sb.append("Query{\n");

        if (selectComponent != null) {
            sb.append(String.format("    columns='%s',\n", selectComponent));
        }
        if (sourceComponent != null) {
            sb.append(String.format("    sources='%s',\n", sourceComponent));
        }
        if (joins != null) {
            sb.append(String.format("    joins='%s',\n", joins));
        }
        if (whereComponent != null) {
            sb.append(String.format("    Where='%s',\n", whereComponent));
        }
        if (groupBy != null) {
            sb.append(String.format("    GroupBy='%s',\n", groupBy));
        }
        if (havingComponent != null) {
            sb.append(String.format("    Having='%s',\n", havingComponent));
        }
        if (sort != null) {
            sb.append(String.format("    Sort='%s',\n", sort));
        }
        if (limit != 0) {
            sb.append(String.format("    Limit='%s',\n", limit));
        }
        if (offset != 0) {
            sb.append(String.format("    Offset='%s',\n", offset));
        }

        // Remove the last comma and newline if they exist
        int lastCommaIndex = sb.lastIndexOf(",\n");
        if (lastCommaIndex != -1 && lastCommaIndex == sb.length() - 2) {
            sb.delete(lastCommaIndex, sb.length());
        }

        sb.append("\n}");

        return sb.toString();
    }


}
