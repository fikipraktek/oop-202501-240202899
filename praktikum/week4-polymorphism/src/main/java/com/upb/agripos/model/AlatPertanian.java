package main.java.com.upb.agripos.model;

public class AlatPertanian extends Produk {

    private String jenis;

    public AlatPertanian(String kode, String nama, int harga, int stok, String jenis) {
        super(kode, nama, harga, stok); // ⬅ panggil constructor parent
        this.jenis = jenis;
    }

    @Override
    public void info() {
        System.out.println(
            nama + " (" + jenis + ") | Harga: " + harga + " | Stok: " + stok
        );
    }
}
