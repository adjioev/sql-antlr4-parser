package com.ecwid.query.expression;

import java.util.List;
import java.util.stream.Collectors;

public record FunctionCallExpression(String functionName, List<Expression> arguments) implements Expression {

    public String toString() {
        return functionName + "(" + arguments.stream().map(Expression::toString).collect(Collectors.joining(", ")) + ")";
    }
}
