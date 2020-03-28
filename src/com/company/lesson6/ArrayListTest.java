package com.company.lesson6;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        for (Integer number: list) {
            System.out.print(number);

        }
    }
}
