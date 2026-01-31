package main.java.com.upb.agripos.model;

public class ObatHama extends Produk {

    private String jenis;

    public ObatHama(String kode, String nama, int harga, int stok, String jenis) {
        super(kode, nama, harga, stok); // ✅ cocok
        this.jenis = jenis;
    }
}
