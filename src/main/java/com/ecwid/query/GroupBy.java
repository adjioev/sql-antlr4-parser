package com.ecwid.query;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GroupBy {
    private final List<String> columns = new ArrayList<>();

    public void addColumn(String column) {
        columns.add(column);
    }

    public String toString() {
        return String.format("""
                        GroupBy{
                            columns='%s',
                        }""",
                columns
        );
    }
}