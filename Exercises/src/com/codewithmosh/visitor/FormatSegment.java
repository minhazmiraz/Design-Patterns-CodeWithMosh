package com.codewithmosh.visitor;

public class FormatSegment implements Segment {
    @Override
    public void execute(Filter filter) {
        filter.apply(this);
    }
}
