# Laporan Praktikum Minggu 2

**Topik:** Class dan Object (Produk Pertanian)

## Identitas

- **Nama:** FIKI ANTO
- **NIM:** 240202899
- **Kelas:** 3IKRB

---

## Tujuan

- Mahasiswa mampu **menjelaskan konsep class, object, atribut, dan method** dalam OOP.
- Mahasiswa mampu **menerapkan access modifier dan enkapsulasi** dalam pembuatan class.
- Mahasiswa mampu **mengimplementasikan class Produk pertanian** dengan atribut dan method yang sesuai.
- Mahasiswa mampu **mendemonstrasikan instansiasi object** serta menampilkan data produk pertanian di console.
- Mahasiswa mampu **menyusun laporan praktikum** dengan bukti kode, hasil eksekusi, dan analisis sederhana.

---

## Dasar Teori

1. **Class** adalah blueprint atau cetak biru dari sebuah objek.
2. **Object** adalah instansiasi dari class yang berisi atribut (data) dan method (perilaku).
3. **Enkapsulasi** digunakan untuk menyembunyikan data menggunakan access modifier (`public`, `private`, `protected`) serta menyediakan akses melalui **getter** dan **setter**.

---

## Langkah Praktikum

1. **Membuat Class Produk**
   - Buat file `Produk.java` pada package `model`.
   - Tambahkan atribut: `kode`, `nama`, `harga`, dan `stok`.
   - Gunakan enkapsulasi dengan menjadikan atribut bersifat private dan membuat getter serta setter untuk masing-masing atribut.

2. **Membuat Class CreditBy**
   - Buat file `CreditBy.java` pada package `util`.
   - Isi class dengan method statis untuk menampilkan identitas mahasiswa di akhir output:
     `credit by: 240202899 - FIKI ANTO`.

3. **Membuat Objek Produk dan Menampilkan Credit**
   - Buat file `MainProduk.java`.
   - Instansiasi minimal tiga objek produk, misalnya "Benih Padi", "Pupuk Urea", dan satu produk alat pertanian.
   - Tampilkan informasi produk melalui method getter.
   - Panggil `CreditBy.print("240202899", "FIKI ANTO")` di akhir main.

4. **Commit dan Push**

   - Commit dengan pesan: `week2-class-object`.

---

## Kode Program

### Produk.java

```java
package com.upb.agripos.model;

public class Produk {
     private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }
}

```

### CreditBy.java

```java
package com.upb.agripos.util;

public class CreditBy {
    public static void print(String nim, String nama) {
        System.out.println("\nCredit by: " + nim + " - " + nama);
    }
}

```

### MainProduk.java

```java
package com.upb.agripos;

import com.upb.agripos.model.Produk;
import com.upb.agripos.util.CreditBy;

public class MainProduct {
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

```

---

## Hasil Eksekusi

![Screenshot hasil eksekusi](./screenshots/output.png)

---

## Analisis
Analisis

- Cara kerja kode:
    - Program menerapkan paradigma OOP, di mana data dan perilaku dibungkus dalam class Produk.
    - Setiap objek Produk menyimpan informasi unik seperti kode, nama, harga, dan stok.
    - Method tambahStok() dan kurangiStok() mengubah nilai stok dengan aman tanpa mengakses atribut secara langsung.
    - Class CreditBy menampilkan identitas mahasiswa melalui method statis print().
- Perbedaan dengan minggu sebelumnya:
    - Minggu sebelumnya masih menggunakan pendekatan prosedural, di mana semua data dan logika berada di satu fungsi main().
    - Minggu ini mulai menerapkan pendekatan OOP, membuat kode lebih modular dan mudah diperluas.
    - Enkapsulasi diterapkan untuk menjaga keamanan data dan meningkatkan keteraturan struktur kode.
- Kendala:
    - Tidak ditemukan error selama kompilasi dan eksekusi.

---

## Kesimpulan

Dengan menggunakan konsep **class** dan **object**, program menjadi lebih terstruktur, mudah dikembangkan, serta mendukung prinsip **reusability** dalam pemrograman berorientasi objek.

---

## Quiz

1. **Mengapa atribut sebaiknya dideklarasikan sebagai private dalam class?**
   **Jawaban:** Agar data terlindungi dari akses langsung oleh class lain dan hanya dapat dimodifikasi melalui method yang telah disediakan.

2. **Apa fungsi getter dan setter dalam enkapsulasi?**
   **Jawaban:** Getter digunakan untuk mengambil nilai atribut, sedangkan setter digunakan untuk mengubah nilai atribut dengan kontrol yang aman.

3. **Bagaimana cara class Produk mendukung pengembangan aplikasi POS yang lebih kompleks?**
   **Jawaban:** Dengan adanya class Produk, sistem POS dapat dengan mudah menambah fitur seperti transaksi penjualan, pengelolaan stok otomatis, serta integrasi dengan database dan antarmuka pengguna.