package com.company.lesson2homework;

public class Cat {
    public String name, color, address ;
    public int weight = 12, age = 9;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public Cat() {

    }
}