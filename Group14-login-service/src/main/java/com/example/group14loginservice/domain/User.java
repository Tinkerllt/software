package com.example.group14loginservice.domain;

public class User {
    private int id;
    private String name;
    private String password;
    private int age;

    public User(int id4, String name3, String password2) {
        id = id4;
        name = name3;
        password = password2;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public void setName(String name) {
        this.name = name;
    }
}
