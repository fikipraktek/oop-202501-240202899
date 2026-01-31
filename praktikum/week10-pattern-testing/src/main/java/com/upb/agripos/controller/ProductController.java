package com.upb.agripos.controller;

import com.upb.agripos.model.Produk;
import com.upb.agripos.view.ConsoleView;

public class ProductController {
    private final Produk model;
    private final ConsoleView view;

    public ProductController(Produk model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void showProduct() {
        view.showMessage("Produk: " + model.getCode() + " - " + model.getName());
    }
}