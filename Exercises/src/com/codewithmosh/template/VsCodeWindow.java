package com.codewithmosh.template;

public class VsCodeWindow extends Window{
    @Override
    protected void completeTaskBeforeClosing() {
        System.out.println("Execute task before closing VsCode");
    }

    @Override
    protected void completeTaskAfterClosing() {
        System.out.println("Execute task after closing VsCOde");
    }
}
