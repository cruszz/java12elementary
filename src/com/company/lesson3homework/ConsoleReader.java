package com.company.lesson3homework;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = reader.read();
        String readDouble = reader.readLine();
        System.out.println("Считано с клавиатуры эта строка:");
        System.out.println(s);
        System.out.println(x);
        System.out.println(readDouble);


    }
    public static String readString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readString = reader.readLine();
        return readString;
    }
    public static int readInt() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int readInt = reader.read();
        return readInt;
    }
    public static double readDouble() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double readDouble = readDouble();
        return readDouble;
    }
    public static void readLn() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readLn = readString();

    }
}
