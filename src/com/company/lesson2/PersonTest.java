package com.company.lesson2;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Gary");
        Person person2 = new Person(31);
        System.out.println(person1.age + "   " + person1.name);

        if (person1 == person2) {
            System.out.println("persons equal");
        }else {
            System.out.println("persons not equal");
        }

    }








}
