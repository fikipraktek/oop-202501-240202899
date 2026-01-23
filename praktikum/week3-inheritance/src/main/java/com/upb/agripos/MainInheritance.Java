package com.upb.agripos;

import com.upb.agripos.model.*;

public class MainInheritance {
    public static void main(String[] args) {
        Benih b = new Benih("BNH-001", "Benih Padi IR64", 25000, 100, "IR64");
        Pupuk p = new Pupuk("PPK-101", "Pupuk Urea", 350000, 40, "Urea");
        AlatPertanian a = new AlatPertanian("ALT-501", "Cangkul Baja", 90000, 15, "Baja");

        System.out.println("==========================================");
        System.out.println(b.getNama() + " - Varietas: " + b.getVarietas());
        System.out.println("Deskripsi Produk:");
        System.out.println("Kode: " + b.getKode() + " | Harga: " + b.getHarga() + " | Stok: " + b.getStok());
        System.out.println("==========================================");

        System.out.println(p.getNama() + " - Jenis: " + p.getJenis());
        System.out.println("Deskripsi Produk:");
        System.out.println("Kode: " + p.getKode() + " | Harga: " + p.getHarga() + " | Stok: " + p.getStok());
        System.out.println("==========================================");

        System.out.println(a.getNama() + " - Material: " + a.getMaterial());
        System.out.println("Deskripsi Produk:");
        System.out.println("Kode: " + a.getKode() + " | Harga: " + a.getHarga() + " | Stok: " + a.getStok());
        System.out.println("==========================================");
    }
}
