package com.codewithmosh.chainOfResponsibility;

public class WorkBookFile extends FileType {

    public WorkBookFile(FileType fileType) {
        super(fileType);
    }

    @Override
    public boolean importFile(String fileName) {
        if(!fileName.isEmpty() && fileName.endsWith(".qwb")){
            System.out.println("Workbook File imported");
            return true;
        } else return false;
    }
}
