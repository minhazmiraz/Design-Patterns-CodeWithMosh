package com.codewithmosh.command;

public class LabelCommand implements UndoableCommand{
    private History history;
    private String prevLabel;
    private String curText;
    private VideoEditor videoEditor;

    public LabelCommand(History history, String curText, VideoEditor videoEditor) {
        this.history = history;
        this.curText = curText;
        this.videoEditor = videoEditor;
    }

    @Override
    public void execute() {
        prevLabel = videoEditor.getText();
        videoEditor.setText(curText);
        history.addCommand(this);
    }

    @Override
    public void unexecute() {
        videoEditor.setText(prevLabel);
    }
}
