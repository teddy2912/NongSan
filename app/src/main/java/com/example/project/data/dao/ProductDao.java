package com.example.project.data.dao;

import com.example.project.data.model.Product;

import java.util.List;

public interface ProductDao {
    Product find(int id);
    List<Product> all();
    void insert(Product product);
    void update(Product product);
    void delete(int id);
    List<Product> findByName(String name);
}
