package main.java.com.upb.agripos;

public class MainExceptionDemo { 
    public static void main(String[] args) {
        System.out.println("Hello, I am Fiki Anto-240202899 (Week9)");

        ShoppingCartfe cart = new ShoppingCartfe();
        Productf p1 = new Productf("P01", "Pupuk Organik", 25000, 3);

        // InvalidQuantityException
        try {
            cart.addProductf(p1, -1);
        } catch (Exception e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }

        // ProductNotFoundException
        try {
            cart.removeProductf(p1);
        } catch (Exception e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }

        // CartEmptyException
        try {
            cart.checkoutf();
        } catch (Exception e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }

        // DuplicateProductException
        try {
            cart.addProductf(p1, 1);
            cart.addProductf(p1, 1); // duplikat
        } catch (Exception e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }

        // InsufficientStockException
        try {
            ShoppingCartfe cart2 = new ShoppingCartfe();
            cart2.addProductf(p1, 5); // stok cuma 3
            cart2.checkoutf();
        } catch (Exception e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}
