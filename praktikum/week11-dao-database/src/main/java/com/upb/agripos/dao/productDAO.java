package main.java.com.upb.agripos.dao;

import java.util.List;

import sql.Productq;

public interface productDAO {
    void insert(Productq p);
    void update(Productq p);
    void delete(String code);
    Produk findByCode(String code);
    List<Productq> findAll();
}
