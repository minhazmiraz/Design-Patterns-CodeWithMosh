package com.codewithmosh.observer;

public class StockListView implements Observer {
    private StockList stockList;

    public StockListView(StockList stockList) {
        this.stockList = stockList;
    }

    @Override
    public void update() {
        System.out.println("StockListView: ");
        for(var stock : stockList.getStockList())
            System.out.println(stock);
    }
}
