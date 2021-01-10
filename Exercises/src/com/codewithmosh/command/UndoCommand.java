package com.codewithmosh.command;

public class UndoCommand implements Command{
    private History commandHistory;

    public UndoCommand(History commandHistory) {
        this.commandHistory = commandHistory;
    }

    @Override
    public void execute() {
        if(commandHistory.size() > 0)
            commandHistory.pop().unexecute();
        else
            System.out.println("Empty History");
    }
}
