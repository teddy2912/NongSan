package com.example.project.data.dao;

import com.example.project.data.model.Category;
import com.example.project.data.model.Order;

import java.util.List;

public interface OrderDao {
    Order find(int id);
    List<Order> all();
    void insert(Order order);
    void update(Order order);
    void delete(int id);
    List<Order> findByName(String code);
}
