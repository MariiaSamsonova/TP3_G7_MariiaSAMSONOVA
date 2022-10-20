package main;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeScanner {
    private Scanner sc;

    public SafeScanner(InputStream is) {
        this.sc = new Scanner(is);
        }

    public int getInt(){
        while (true)
        {
            try{

                int answer = this.sc.nextInt();
                return answer;
            }
            catch (InputMismatchException e){
                System.out.println(e.toString() + "\nTry again.");
                this.sc = new Scanner(System.in);
            }
        }
    }

    public void closeScanner(){
        this.sc.close();
    }
}
