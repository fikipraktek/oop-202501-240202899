package main.java.com.upb.agripos.model;

public class Pupuk extends Produk {

    private String jenis;

    public Pupuk(String kode, String nama, int harga, int stok, String jenis) {
        super(kode, nama, harga, stok); // ✅ cocok
        this.jenis = jenis;
    }

    @Override
    public void info() {
        System.out.println(
            "Pupuk: " + nama +
            " | Jenis: " + jenis +
            " | Harga: " + harga +
            " | Stok: " + stok
        );
    }
}
