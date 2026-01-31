package main.java.com.upb.agripos;

import main.java.com.upb.agripos.model.*;

public class MainPolymorphism {
    public static void main(String[] args) {

        Produk p1 = new Benih("B01", "Benih Jagung", 5000, 10, "Jagung");
        Produk p2 = new Pupuk("P01", "Pupuk Urea", 15000, 5, "Kimia");
        Produk p3 = new AlatPertanian("A01", "Cangkul", 75000, 3, "Manual");

        p1.info();
        p2.info();
        p3.info();
    }
}
