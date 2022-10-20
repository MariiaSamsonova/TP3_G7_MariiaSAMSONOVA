package main;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your age?");
        SafeScanner safeScanner = new SafeScanner(Objects.requireNonNull(SafeScanner.class.getResourceAsStream("demo.txt")));
        System.out.println(safeScanner.getInt());
        safeScanner.closeScanner();

//        ASCIIArt.printCat(10, 5);
    }
}