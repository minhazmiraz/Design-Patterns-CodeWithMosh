package com.codewithmosh.template;

public abstract class Window {
    public void close() {
        completeTaskBeforeClosing();

        System.out.println("Removing the window from the screen");

        completeTaskAfterClosing();
    }

    protected abstract void completeTaskBeforeClosing();

    protected abstract void completeTaskAfterClosing();
}
