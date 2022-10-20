package main.java;

public class ASCIIArt {

    public static void printCat(int width, int height)
    {
        System.out.println("|\\" + ("-").repeat(width-4) + "/|");

        for(int i = 1; i < height-1; i++)
        {
            if (i == height/2)
            {
                System.out.println("|  0" + ("-").repeat(width - 8) + "0  |");
            }
            System.out.println("|" + (" ").repeat(width-2) + "|");

        }

        System.out.println(" \\_" + ("^").repeat(width-4-2) + "_/ ");
    }


}