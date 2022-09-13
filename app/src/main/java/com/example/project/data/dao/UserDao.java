package com.example.project.data.dao;

import com.example.project.data.model.Category;
import com.example.project.data.model.User;

import java.util.List;

public interface UserDao {
    User find(int id);
    List<User> all();
    void insert(User user);
    void update(User user);
    void delete(int id);
    List<User> findByName(String email);
}
