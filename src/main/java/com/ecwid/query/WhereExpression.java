package com.ecwid.query;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WhereExpression implements WhereComponent {
    private WhereClauses whereClauses;  // A more complex combination of WhereClause and logical operators

//    @Override
//    public String toString() {
//        return whereClauses.toString();
//    }

}
