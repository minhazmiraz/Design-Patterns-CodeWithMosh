package com.codewithmosh.visitor;

public class NoiseReduction implements Filter {
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reduce noise in format");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reduce noise int fact");
    }
}
