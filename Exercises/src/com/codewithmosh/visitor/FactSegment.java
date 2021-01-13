package com.codewithmosh.visitor;

public class FactSegment implements Segment {
    @Override
    public void execute(Filter filter) {
        filter.apply(this);
    }
}
