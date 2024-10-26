package com.ecwid.query.source;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Source implements SourceComponent {
    protected String alias;

}