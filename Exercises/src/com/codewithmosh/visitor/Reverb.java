package com.codewithmosh.visitor;

public class Reverb implements Filter {
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Add reverb to format");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Add reverb to fact");
    }
}
