package com.codewithmosh.observer;

public class StatusBar implements Observer {
    private StockList stockList;

    public StatusBar(StockList stockList) {
        this.stockList = stockList;
    }

    @Override
    public void update() {
        System.out.println("StatusBar: Most popular stock");
        System.out.println(stockList.getPopularStock());
    }
}
