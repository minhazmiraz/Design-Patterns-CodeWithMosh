package com.codewithmosh.visitor;

public class Contrast implements Filter{
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Add contrast to format");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Add contrast to fact");
    }
}
