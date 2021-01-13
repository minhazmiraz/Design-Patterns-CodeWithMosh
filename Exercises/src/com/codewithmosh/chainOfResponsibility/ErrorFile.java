package com.codewithmosh.chainOfResponsibility;

public class ErrorFile extends FileType {

    public ErrorFile(FileType fileType) {
        super(fileType);
    }

    @Override
    public boolean importFile(String fileName) {
        System.out.println("File type not supported");
        return true;
    }
}
