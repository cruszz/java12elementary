package com.company.lesson2;

public class references {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("before call  " + number);
        System.out.println("after change  " + number);


    }
    public static void changeNumber(int number){
        System.out.println("before call  " + number);
        number =  10;
        System.out.println("after change  " + number);

    }

}
