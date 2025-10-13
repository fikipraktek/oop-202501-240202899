# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: [Tuliskan judul topik, misalnya "Class dan Object"]

## Identitas
- Nama  : [FikiAnto]
- NIM   : [240202899]
- Kelas : [3IKRB]

---

## Tujuan
[-Mahasiswa mampu mendefinisikan paradigma prosedural, OOP, dan fungsional.]
[-Mahasiswa mampu membandingkan kelebihan dan keterbatasan tiap paradigma.]
[-Mahasiswa mampu memberikan contoh program sederhana untuk masing-masing paradigma.]
[-Mahasiswa aktif dalam diskusi kelas (bertanya, menjawab, memberi opini).]
----

## Dasar Teori
1.Prosedural: program dibangun sebagai rangkaian perintah (fungsi/prosedur).
2.OOP (Object-Oriented Programming): program dibangun dari objek yang memiliki data (atribut) dan perilaku (method).
3.Fungsional: program dipandang sebagai pemetaan fungsi matematika, lebih menekankan ekspresi dan transformasi data.

---

## Langkah Praktikum
1.Menginstall JDK versi terbaru dan cek instalasinya menggunakan perintah java -version
2.Membuat file program HelloProcedural.java, HelloOOP.java, dan HelloFunctional.java.
3.Menulis kode sesuai paradigma yang diminta.
4.Melakukan eksekusi program
5.Mengecek hasil eksekusi di terminal.
6.Membuat commit ke repository GitHub dengan pesan commit "week1-setup-hello-pos"
---

## Kode Program
1.// HelloProcedural
public class HelloProcedural {
    public static void main(String[] args) {
        String nim = "240202899";
        String name = "Fiki Anto";

        System.out.println("Hello World, I am " + name + " - " + nim);
    }
}


2.
// HelloOOP
class Student {
    String nim;
    String name;
    Student(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    void introduce() {
        System.out.println("Hello World, I am " + name + " - " + nim);
    }
}

public class HelloOOP {
    public static void main(String[] args) {
        Student s = new Student("240202899", "Fiki Anto");
        s.introduce();
    }
}


3.// HelloFunctional
import java.util.function.BiConsumer;

public class HelloFunctional {
    public static void main(String[] args) {
        BiConsumer<String, String> introduce =
            (nim, name) -> System.out.println("Hello World, I am " + name + " - " + nim);

        introduce.accept("240202899", "Fiki Anto");
    }
}
## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
1.Cara kerja kode:
Pada paradigma prosedural, kode hanya berupa urutan instruksi tanpa class.
Pada paradigma OOP, kode dibungkus dalam class Student sehingga data (nim, name) dan perilaku (introduce()) disatukan.
Pada paradigma fungsional, digunakan lambda expression dan functional interface (BiConsumer) untuk mencetak pesan.

2.Perbedaan dengan minggu sebelumnya:
Minggu ini mulai diperkenalkan perbedaan paradigma, tidak hanya menulis instruksi sederhana.
Pendekatan OOP membuat program lebih terstruktur, sedangkan functional membuat kode lebih ringkas.

3.Kendala:
Awalnya bingung membedakan kapan harus pakai class vs lambda.
Solusi: membaca dokumentasi Java tentang java.util.function dan contoh penggunaan OOP sederhana.

## Kesimpulan
1.Paradigma prosedural cocok untuk program sederhana dan cepat dibuat.
2.Paradigma OOP memberikan struktur yang jelas dengan memanfaatkan class dan object, sehingga 3.program lebih mudah dikembangkan.
4.Paradigma fungsional membuat kode lebih ringkas dan mengurangi boilerplate dengan memanfaatkan lambda expression.
5.Dengan memahami ketiga paradigma, mahasiswa dapat memilih pendekatan yang tepat sesuai kebutuhan aplikasi.


## Quiz
(1. [Apakah OOP selalu lebih baik dari prosedural?]  
   **Jawaban:** …  

2. [ Kapan functional programming lebih cocok digunakandibanding OOP atau prosedural? ]  
   **Jawaban:** …  

3. [Bagaimana paradigma (prosedural, OOP, fungsional)
memengaruhi maintainability dan scalability aplikasi?]  
   **Jawaban:** …  )

4.[ Mengapa OOP lebih cocok untuk mengembangkan
aplikasi POS dibanding prosedural?]
  **Jawaban**

5.[Bagaimana paradigma fungsional dapat membantu
mengurangi kode berulang (boilerplate code)? ]
  **Jawaban**
