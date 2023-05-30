package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * a ^ b
 *
 */
public class PowerApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        // 1 διότι έχουμε πολλαπλασιασμό.
        int result = 1;
        //Στοιχείο ελέγχου
        int i = 1;

        //Εντολές.
        System.out.println("Please insert a, b:");
        a = in.nextInt();
        b = in.nextInt();


        //While.
        while (i <= b) {
           result =result * a;
           i++;
       }

        //Eκτύπωση

        System.out.printf("%d^%d = %d", a, b, result );




    }
}
