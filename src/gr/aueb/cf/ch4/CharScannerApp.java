package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει char μέσω της εντολής scanner.
 */
public class CharScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Αν αρχικοποιούμε αργότερα μέσα στον κώδικα δεν υπάρχει πρόβλημα να μην αρχικοποιήσουμε στην αρχή του κώδικα.
        char inputChar;

        inputChar = in.next().charAt(0);


        System.out.println(" Char: " + inputChar);

    }
}
