package main.java.com.upb.agripos.model;

public class Produk {
    protected String kode;
    protected String nama;
    protected int harga;
    protected int stok;

    public Produk(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void info() {
        System.out.println(nama + " | Harga: " + harga + " | Stok: " + stok);
    }
}
