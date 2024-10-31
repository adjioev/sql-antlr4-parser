package com.ecwid.query.source;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class SourceList implements SourceComponent {

    public final List<SourceComponent> sources = new ArrayList<>();

    public void add(SourceComponent source) {
        sources.add(source);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (SourceComponent element : sources) {
            sb.append(element.toString());
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

}