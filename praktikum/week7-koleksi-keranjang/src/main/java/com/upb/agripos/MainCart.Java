package com.upb.agripos;

public class MainCart {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product("P01", "Pupuk", 5000, 10);
        Product p2 = new Product("P02", "Benih Jagung", 3000, 20);

        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.printCart();

        cart.removeProduct(p1);
        cart.printCart();
    }
}
