package com.ecwid.query;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Sort {
    private final List<String> columns = new ArrayList<>();

    public enum SortOrder {
        ASC,
        DESC
    }

    private SortOrder order = SortOrder.ASC;

    public void addColumn(String column) {
        columns.add(column);
    }

    public void setOrder(String order) {
        try {
            this.order = SortOrder.valueOf(order.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid sort order: " + order);
        }
    }


    public String toString() {
        return String.format("""
                        Sort{
                            columns='%s',
                            order='%s'
                        }""",
                columns, order
        );
    }
}
