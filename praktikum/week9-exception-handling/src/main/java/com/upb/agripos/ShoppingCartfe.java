package main.java.com.upb.agripos;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartfe {
    private final Map<Productf, Integer> items = new HashMap<>();

    public void addProductf(Productf p, int qty)
            throws InvalidQuantityException, DuplicateProductException {

        if (qty <= 0) {
            throw new InvalidQuantityException(
                "Quantity harus lebih dari 0."
            );
        }

        if (items.containsKey(p)) {
            throw new DuplicateProductException(
                "Produk sudah ada di keranjang."
            );
        }

        items.put(p, qty);
    }

    public void removeProductf(Productf p) throws ProductfNotFoundException {
        if (!items.containsKey(p)) {
            throw new ProductfNotFoundException("Produk tidak ada dalam keranjang.");
        }
        items.remove(p);
    }

    public void checkoutf()
            throws CartEmptyException, InsufficientStockException {

        if (items.isEmpty()) {
            throw new CartEmptyException(
                "Keranjang masih kosong."
            );
        }

        for (Map.Entry<Productf, Integer> entry : items.entrySet()) {
            Productf productf = entry.getKey();
            int qty = entry.getValue();

            if (productf.getStock() < qty) {
                throw new InsufficientStockException(
                    "Stok tidak cukup untuk: " + productf.getName()
                );
            }
        }

        for (Map.Entry<Productf, Integer> entry : items.entrySet()) {
            entry.getKey().reduceStock(entry.getValue());
        }
    }
}