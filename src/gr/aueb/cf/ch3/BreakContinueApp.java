package gr.aueb.cf.ch3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Δείχνει την χρήση των break και
 * continue.
 */
public class BreakContinueApp {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num = 0;
        int sum = 0;
        boolean found = false;

        while (true){
            System.out.println("Please provide a num");
            num = in.nextInt();
            if (num == 1) {
                continue;
            }
            sum +=num;
            if (num == 10) {
                System.out.println("Bingo!!!");
                found = true;
                break;
            }

        }
        System.out.println("Sum: " + sum);
    }


}
