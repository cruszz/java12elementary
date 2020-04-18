package com.company.lesson3homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatFamily {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grFatherName = reader.readLine();
        String grMotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();


        Cat catGrFather = new Cat(grFatherName);
        Cat catGrMother = new Cat(grMotherName);
        Cat catFather = new Cat(fatherName, catGrFather, null);
        Cat catMother = new Cat(motherName, null, catGrMother);
        Cat catSon = new Cat(sonName, catFather, catMother);
        Cat catDother = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrFather);
        System.out.println(catGrMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDother);

    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            String fathername;
            String mothername;
            if (father == null)
                fathername = ", no father";
            else fathername = ", father is " + father.name;
            if (mother == null)
                mothername = ", no mother";
            else mothername = ", mother is " + mother.name;
            return "Cat name is " + name + mothername + fathername;
        }
    }
}
