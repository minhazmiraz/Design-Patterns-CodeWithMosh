package com.codewithmosh.state;

public class TravelTypeTransit implements TravelType{
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (transit)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 2;
    }
}
