package com.upb.agripos;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> cart = new ArrayList<>();

    public void addProduct(Product p) {
        cart.add(p);
    }

    public void removeProduct(Product p) {
        cart.remove(p);
    }

    public void printCart() {
        System.out.println("Isi Keranjang:");
        for (Product p : cart) {
            System.out.println(
                p.getCode() + " - " +
                p.getName() + " - " +
                p.getPrice()
            );
        }
    }
}
