package com.codewithmosh.chainOfResponsibility;

public abstract class FileType {
    private FileType nextFileType;

    public FileType(FileType fileType) {
        this.nextFileType = fileType;
    }

    public void importNow(String filename) {
        if(importFile(filename)) return;
        if(nextFileType != null) nextFileType.importNow(filename);
    }

    public abstract boolean importFile(String fileName);
}
