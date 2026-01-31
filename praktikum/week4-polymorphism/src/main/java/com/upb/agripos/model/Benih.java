package main.java.com.upb.agripos.model;

public class Benih extends Produk {

    private String jenis;

    public Benih(String kode, String nama, int harga, int stok, String jenis) {
        super(kode, nama, harga, stok); // WAJIB cocok dengan Produk
        this.jenis = jenis;
    }

    @Override
    public void info() {
        System.out.println(
            "Benih: " + nama +
            " | Jenis: " + jenis +
            " | Harga: " + harga +
            " | Stok: " + stok
        );
    }
}
