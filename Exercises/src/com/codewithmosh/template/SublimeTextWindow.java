package com.codewithmosh.template;

public class SublimeTextWindow extends Window{
    @Override
    protected void completeTaskBeforeClosing() {
        System.out.println("Execute task before closing Sublime Text");
    }

    @Override
    protected void completeTaskAfterClosing() {
        System.out.println("Execute task after closing Sublime text");
    }
}
