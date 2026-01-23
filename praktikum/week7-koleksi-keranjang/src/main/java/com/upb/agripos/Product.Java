package com.upb.agripos;

public class Product {

    private String code;
    private String name;
    private int price;
    private int stock;

    // ✅ constructor 4 parameter
    public Product(String code, String name, int price, int stock) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
