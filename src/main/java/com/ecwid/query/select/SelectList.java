package com.ecwid.query.select;

import lombok.Getter;

import java.util.List;

@Getter
public class SelectList implements SelectComponent {
    private final List<SelectElement> elements;

    public SelectList(List<SelectElement> elements) {
        this.elements = elements;
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