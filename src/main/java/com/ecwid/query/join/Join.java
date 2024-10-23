package com.ecwid.query.join;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Join {
    private final String tableName;
    private final String joinType;
    private final JoinCondition joinCondition;
}