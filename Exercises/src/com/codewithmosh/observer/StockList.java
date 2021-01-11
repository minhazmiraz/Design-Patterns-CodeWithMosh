package com.codewithmosh.observer;

import java.util.ArrayList;
import java.util.List;

public class StockList extends Subject {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        notifyObserver();
    }
    public void removeStock(Stock stock) {
        stocks.remove(stock);
        notifyObserver();
    }
    public List<Stock> getStockList() {
        return stocks;
    }
    public Stock getPopularStock() {
        Stock popularStock = new Stock("popular", 0);
        for(var stock : stocks){
            if(popularStock.getPrice() < stock.getPrice()){
                popularStock = stock;
            }
        }
        return popularStock;
    }
}
