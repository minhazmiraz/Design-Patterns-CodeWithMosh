package com.codewithmosh.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventListener> eventListeners = new ArrayList<>();

    public void addEventListener(EventListener eventListener) {
        eventListeners.add(eventListener);
    }

    protected void notifyEventListeners() {
        for(var eventListener : eventListeners){
            eventListener.update();
        }
    }
}
