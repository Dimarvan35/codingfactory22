package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει με βάση
 * την θερμοκρασία. Αν η θερμοκρασία
 * είναι <ο, τότε χιονίζει, αλλιώς
 * δε χιονίζει. Ο χρήστης δίνει τη
 * θερμοκρασία.
 */
public class TemperatureApp {
    public static void main(String[] args) {
       //Δήλωση και αρχικοποίηση μεταβλητών.
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        //Εντολές
        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        //Μπούλιαν Παράσταση
        isSnowing = (temp<0);

        //Εκτύπωση
        System.out.println("Is snowing: " + isSnowing);
    }
}
