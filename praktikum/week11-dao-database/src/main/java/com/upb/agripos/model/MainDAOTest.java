package main.java.com.upb.agripos.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import main.java.com.upb.agripos.dao.productDAO;
import main.java.com.upb.agripos.dao.productDAOlmpl;
import sql.productq;

public class MainDAOTest {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/agripos",
            "postgres",
            "postgres"
        );

        System.out.println("Database connected!");
        ProductDAO dao = new ProductDAOImpl(conn);

        // Bersihkan data lama agar tidak error duplicate key saat insert ulang
        dao.delete("P01");

        // 1. Insert
        System.out.println("Inserting product...");
        dao.insert(new Produk("P01", "Pupuk Organik", 25000, 10));
        
        // 2. Update
        System.out.println("Updating product...");
        dao.update(new Produk("P01", "Pupuk Organik Premium", 30000, 8));

        // 3. Find By Code
        Produk p = dao.findByCode("P01");
        System.out.println("Found: " + p.getName() + " | Price: " + p.getPrice());

        // 4. Find All
        System.out.println("All Products:");
        List<Produk> list = dao.findAll();
        for (Produk prod : list) {
            System.out.println("- " + prod.getName() + " (" + prod.getStock() + ")");
        }

        // 5. Delete
        System.out.println("Deleting product...");
        dao.delete("P01");
        
        conn.close();
        System.out.println("\ncredit by: 240202889 - Wahyu Tri Cahya");
    }
}