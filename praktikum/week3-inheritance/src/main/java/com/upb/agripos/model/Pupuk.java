package com.upb.agripos.model;

public class Pupuk {
    protected String kode;
    protected String nama;
    protected double harga;
    protected int stok;

    public Pupuk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Kode: " + kode + " | Harga: " + harga + " | Stok: " + stok);
    }
}
