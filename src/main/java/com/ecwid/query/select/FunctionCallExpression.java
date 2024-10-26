package com.ecwid.query.select;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionCallExpression implements Expression {
    private String functionName;
    private List<Expression> arguments;

    public FunctionCallExpression(String functionName, List<Expression> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public String toString() {
        return functionName + "(" + arguments.stream().map(Expression::toString).collect(Collectors.joining(", ")) + ")";
    }
}
