package com.company.lesson6;

import java.io.*;

public class FileReader {
    public static void main(String[] args) {


        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("F:\\javTEST\\test.txt"))) {

            while (bufferedInputStream.available() > 0) {
                char ch = (char) bufferedInputStream.read();
                System.out.print(ch);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
