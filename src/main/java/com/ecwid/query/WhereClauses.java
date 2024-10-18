package com.ecwid.query;

import java.util.ArrayList;
import java.util.List;

public class WhereClauses {

    private List<WhereComponent> components = new ArrayList<>();  // Can be WhereClause or WhereExpression
    private List<String> logicalOperators = new ArrayList<>();    // List of logical operators ("AND", "OR")


    public List<WhereComponent> getWhereComponents() {
        return components;
    }

    public void addWhereComponent(WhereComponent component) {
        components.add(component);
    }

    public List<String> getLogicalOperators() {
        return logicalOperators;
    }

    public void addLogicalOperator(String logicalOperator) {
        logicalOperators.add(logicalOperator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < components.size(); i++) {
            sb.append(components.get(i));
            if (i < logicalOperators.size()) {
                sb.append(" ").append(logicalOperators.get(i)).append(" ");
            }
        }
        return sb.toString();
    }
}