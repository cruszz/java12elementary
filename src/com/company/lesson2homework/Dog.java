package com.company.lesson2homework;

public class Dog {
    private String name, color, breed ;
    private int weight = 7, age = 5;


    public Dog(String name , int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
}
