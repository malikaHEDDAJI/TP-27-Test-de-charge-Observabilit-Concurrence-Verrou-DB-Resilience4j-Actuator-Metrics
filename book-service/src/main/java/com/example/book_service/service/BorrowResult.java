package com.example.book_service.service;

public class BorrowResult {
    private final Long id;
    private final String title;
    private final int stockLeft;
    private final double price;

    public BorrowResult(Long id, String title, int stockLeft, double price) {
        this.id = id;
        this.title = title;
        this.stockLeft = stockLeft;
        this.price = price;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public int getStockLeft() { return stockLeft; }
    public double getPrice() { return price; }
}
