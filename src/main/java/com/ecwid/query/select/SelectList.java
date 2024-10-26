package com.ecwid.query.select;

import lombok.Getter;
import java.util.List;

@Getter
public record SelectList(List<SelectElement> elements) implements SelectComponent {

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