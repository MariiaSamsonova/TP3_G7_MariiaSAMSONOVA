package main.java;

import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        InputStream is;
        try{
            is = new DataInputStream(new FileInputStream(new File("src/main/demo.txt")));
        } catch (FileNotFoundException e)
        {
            throw new NullPointerException(e.toString());
        }

        SafeScanner safeScanner = new SafeScanner(is);
        System.out.println("What is your age?");
        int answer = safeScanner.getInt();
        System.out.printf("Oh, sorry, we have it in the file. Your age is %d.%n", answer);
        System.out.println("cat with size from the file for you:");
        ASCIIArt.printCat(safeScanner.getInt(), safeScanner.getInt());
        System.out.println("Meow");
        safeScanner.closeScanner();
    }
}