package com.ecwid.query.source;

import com.ecwid.query.Query;
import lombok.Getter;

@Getter
public class SubquerySource extends Source {
    private final Query subquery;

    public SubquerySource(Query subquery) {
        this.subquery = subquery;
    }

    public String toString() {
        String s = "(" + subquery.toString() + ")";
        if (alias != null) {
            return s + " AS " + alias;
        }
        return s;
    }
}
