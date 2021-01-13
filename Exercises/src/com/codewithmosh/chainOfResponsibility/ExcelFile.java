package com.codewithmosh.chainOfResponsibility;

public class ExcelFile extends FileType {

    public ExcelFile(FileType fileType) {
        super(fileType);
    }

    @Override
    public boolean importFile(String fileName) {
        if(!fileName.isEmpty() && fileName.endsWith(".xls")){
            System.out.println("Excel File imported");
            return true;
        } else return false;
    }
}
