package com.example.project.data.dao;

import com.example.project.data.model.Category;
import com.example.project.data.model.OrderDetail;

import java.util.List;

public interface OrderDetailDao {
    OrderDetail find(int id);
    List<OrderDetail> all();
    void insert(OrderDetail orderDetail);
    void update(OrderDetail orderDetail);
    void delete(int id);
}
