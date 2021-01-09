package com.codewithmosh.state;

public class DirectionService {
    private TravelType travelMode;

    public DirectionService(TravelType travelMode){
        this.travelMode = travelMode;
    }

    public Object getEta() {
        return travelMode.getEta();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }

    public TravelType getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelType travelMode) {
        this.travelMode = travelMode;
    }
}
