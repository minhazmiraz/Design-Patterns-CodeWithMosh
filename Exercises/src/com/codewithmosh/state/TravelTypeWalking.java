package com.codewithmosh.state;

public class TravelTypeWalking implements TravelType{
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
