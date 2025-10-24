package com.upb.agripos;

import com.upb.agripos.model.Produk;
import com.upb.agripos.util.CreditBy;

public class MainProduk {
    public static void main(String[] args) {
       
        Produk p1 = new Produk("BNH-001", "Benih Padi IR64", 25000, 100);
        Produk p2 = new Produk("PPK-101", "Pupuk Urea 50kg", 350000, 40);
        Produk p3 = new Produk("ALT-501", "Cangkul Baja", 90000, 15);

        
        System.out.println("=== Data Awal Produk ===");
        printProduk(p1, p2, p3);

        
        p1.tambahStok(50);   // stok p1: 100 -> 150
        p2.kurangiStok(10);  // stok p2: 40 -> 30
        p3.setHarga(95000);  // harga p3: 90000 -> 95000

        
        System.out.println("\n=== Data Produk Setelah Update ===");
        printProduk(p1, p2, p3);

        
        CreditBy.print("240202899", "Fiki Anto");
    }

    
    public static void printProduk(Produk... produkList) {
        for (Produk p : produkList) {
            System.out.println("Kode: " + p.getKode() 
                    + ", Nama: " + p.getNama() 
                    + ", Harga: " + p.getHarga() 
                    + ", Stok: " + p.getStok());
        }
    }
}
