package com.company.lesson2;

public class Person {
   public String name;
   public int age = 21;
   public Person() {
       name = "DEFAULT NAME";
       age = 1;
   }
   public static void PERSON_COUNT(){
       System.out.println(PERSON_COUNT);
   }
    public static int PERSON_COUNT;
    public Person (String name){
        this.name = name;
    }
    public Person(int age){
       this.age = age;
    }
    public Person(String name,int age) {
       this.name = name;
       this.age = age;
    }
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }





}
