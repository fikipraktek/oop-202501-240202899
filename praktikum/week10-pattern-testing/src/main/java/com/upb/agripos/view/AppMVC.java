package com.upb.agripos.view;

import com.upb.agripos.config.DatabaseConnection;
import com.upb.agripos.controller.ProductController;
import com.upb.agripos.model.Produk;
import com.upb.agripos.view.ConsoleView;
public class AppMVC {
    public static void main(String[] args) {

        System.out.println("Hello, I am FIKI ANTO-240202899 (Week10)");

        // Singleton test
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();

        // MVC
        Produk product = new Produk("P01", "Pupuk Organik");
        ConsoleView view = new ConsoleView();
        ProductController controller = new ProductController(product, view);

        controller.showProduct();
    }
}