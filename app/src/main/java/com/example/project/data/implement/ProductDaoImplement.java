package com.example.project.data.implement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.project.data.dao.ProductDao;
import com.example.project.data.model.Product;

import java.util.List;

public class ProductDaoImplement implements ProductDao {
    @Override
    public Product find(int id) {
        return null;
    }

    @Override
    public List<Product> all() {
        return null;
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Product> findByName(String name) {
        return null;
    }
}
