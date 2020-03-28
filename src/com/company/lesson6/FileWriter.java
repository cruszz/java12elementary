package com.company.lesson6;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) throws FileNotFoundException {
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("output.txt"))) {
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeUTF("TEST133333");
            dataOutputStream.writeInt(2222);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
