package com.company.lesson2homework;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("DOGNAME" , 24 ,12);
        String dog1Name = dog1.getName();
        int dog1Age = dog1.getAge();
        int dog1Weight = dog1.getWeight();
        dog1.setName("PUPKIN");
        dog1.setAge(7);
        dog1.setWeight(8);
        dog1.setBreed("PITBULL");

        System.out.println("Имя : " + dog1Name);
        System.out.println("Возраст : " + dog1Age);
        System.out.println("Вес : " + dog1Weight);
        System.out.println("Порода : " + dog1 );
    }
}
