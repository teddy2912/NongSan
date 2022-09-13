package com.example.project.data.model;

public class User {
    public int id;
    public String email;
    public String pass;
    public String role;

    public User(int id, String email, String pass, String role) {
        this.id = id;
        this.email = email;
        this.pass = pass;
        this.role = role;
    }

    public User(String email, String pass, String role) {
        this.email = email;
        this.pass = pass;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
