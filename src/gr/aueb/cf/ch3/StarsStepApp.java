package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δίνουμε start, end και step
 * κσι εκτυπώενι αντίστοιχα
 * αστεράκια
 */
public class StarsStepApp {
    public static void main(String[] args) {

        //Δήλωση κι αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int i = 0;

        //Εντολές
        System.out.println("Please insert start, end value and step");
        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();
        i = start;

        while (i <= end) {
            System.out.println("*");
            i = i + step;
        }
    }
}
