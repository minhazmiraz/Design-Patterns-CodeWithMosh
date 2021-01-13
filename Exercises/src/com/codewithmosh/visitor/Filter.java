package com.codewithmosh.visitor;

public interface Filter {
    void apply(FormatSegment formatSegment);
    void apply(FactSegment factSegment);
}
