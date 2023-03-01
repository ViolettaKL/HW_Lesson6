package org.example;

public class User {
    String name;
    int age;
    int id;

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }
}
