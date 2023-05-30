package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ΠΑΡΑΔΕΙΓΜΑ DO WHILE....
 * Εμφανίζει επαναληπτικά ένα μενού επιλογών
 * μέχρι ο χρήστης να επιλέξει έξοδο.
 */
public class MenuApp {
        public static void main(String[] args) {
            //Δήλωση και αρχικοποίηση μεταβλητών.
            Scanner in = new Scanner(System.in);
            int choice = 0;
            /**
             * Εμφανίζει οπωςδήποτε μια φορά το μενου, διότι η
             * do τρέχει πριν την while.
             * Εαν όμως επιλέξει το 3 τότε μπαίνει στο προσκήνιο
             * η while.
             */
            do {
                System.out.println("Επιλέξτε ένα από τα παρακάτω");
                System.out.println("1. Εισαγωγή προιόντος");
                System.out.println("2. Διαγραφή προιόντος");
                System.out.println("3. Έξοδος");
                choice = in.nextInt();
            }while (choice !=3);


    }
}
