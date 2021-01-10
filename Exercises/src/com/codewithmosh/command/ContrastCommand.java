package com.codewithmosh.command;

public class ContrastCommand implements UndoableCommand{
    private History history;
    private float prevContrast;
    private float curContrast;
    private VideoEditor videoEditor;

    public ContrastCommand(History history, float curContrast, VideoEditor videoEditor) {
        this.history = history;
        this.curContrast = curContrast;
        this.videoEditor = videoEditor;
    }

    @Override
    public void execute() {
        prevContrast = videoEditor.getContrast();
        videoEditor.setContrast(curContrast);
        history.addCommand(this);
    }

    @Override
    public void unexecute() {
        videoEditor.setContrast(prevContrast);
    }
}
