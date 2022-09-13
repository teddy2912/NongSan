package com.example.project.data.model;

public class Product {
    public int id;
    public String name;
    public int quantity;
    public double price;
    public String img;
    public int categoryId;

    public Product(int id, String name, int quantity, double price, String img, int categoryId) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.img = img;
        this.categoryId = categoryId;
    }

    public Product(String name, int quantity, double price, String img, int categoryId) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.img = img;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
