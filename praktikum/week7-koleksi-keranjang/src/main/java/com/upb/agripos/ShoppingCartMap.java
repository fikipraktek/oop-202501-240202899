package com.upb.agripos;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartMap {
    private Map<Product, Integer> cart = new HashMap<>();

    public void addProduct(Product p) {
        if (cart.containsKey(p)) {
            cart.put(p, cart.get(p) + 1);
        } else {
            cart.put(p, 1);
        }
    }

    public void removeProduct(Product p) {
        cart.remove(p);
    }

    public void printCart() {
        System.out.println("Isi Keranjang (Map):");
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            Product p = entry.getKey();
            int qty = entry.getValue();
            System.out.println(
                p.getCode() + " - " +
                p.getName() + " - " +
                p.getPrice() +
                " | Qty: " + qty
            );
        }
    }
}
