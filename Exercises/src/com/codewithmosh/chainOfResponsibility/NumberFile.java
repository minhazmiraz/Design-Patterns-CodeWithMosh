package com.codewithmosh.chainOfResponsibility;

public class NumberFile extends FileType{

    public NumberFile(FileType fileType) {
        super(fileType);
    }

    @Override
    public boolean importFile(String fileName) {
        if(!fileName.isEmpty() && fileName.endsWith(".numbers")){
            System.out.println("Number spreadsheet File imported");
            return true;
        } else return false;
    }
}
