package com.ecwid.query.select;

import java.util.List;

public record SelectList(List<SelectElement> elements) implements SelectComponent {

    public List<String> getColumns() {
        return elements.stream()
                .map(SelectElement::expression)
                .map(Expression::toString)
                .toList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (SelectElement element : elements) {
            sb.append(element.toString());
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

}