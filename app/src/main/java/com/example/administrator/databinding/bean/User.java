package com.example.administrator.databinding.bean;

public class User {
    private String name; //姓名
    private String age; //年龄
    private String price;//价值

    public User() {
    }

    public User(String name, String age, String price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
