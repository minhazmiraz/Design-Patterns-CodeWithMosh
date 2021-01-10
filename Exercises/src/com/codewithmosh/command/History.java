package com.codewithmosh.command;

import java.util.Stack;

public class History {
    private Stack<UndoableCommand> command = new Stack<>();

    public UndoableCommand pop() {
        return command.pop();
    }

    public void addCommand(UndoableCommand command) {
        this.command.push(command);
    }

    public int size(){
        return command.size();
    }
}
