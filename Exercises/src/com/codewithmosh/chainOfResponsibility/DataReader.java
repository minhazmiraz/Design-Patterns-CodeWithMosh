package com.codewithmosh.chainOfResponsibility;

public class DataReader {
    public void read(String fileName) {
        ErrorFile errorFile = new ErrorFile(null);
        WorkBookFile workBookFile = new WorkBookFile(errorFile);
        NumberFile numberFile = new NumberFile(workBookFile);
        ExcelFile excelFile = new ExcelFile(numberFile);

        excelFile.importNow(fileName);
    }
}
