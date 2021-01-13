package com.codewithmosh.visitor;

public class Normalize implements Filter{
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Normalize-Format-Segment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Normalize-Fact-Segment");
    }
}
