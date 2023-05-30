package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Aποφασίζει αν χιονίζει η όχι
 * με βάση όχι μόνο την θερμοκρασία
 * αλλά και το εαν βρέχει. Αν βρέχει δηλαδή και
 * ταυτόχρονα η θερμοκρασία είναι <0
 * τότε χιονίζει, αλλιώς όχι.
 */
public class SnowingApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner (System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        //Εντολές
        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature (int)");
        temp = in.nextInt();

        //Μεταβλητή Boolean
        isSnowing = isRaining && (temp <0);

        //Εκτύπωση

        System.out.println("Is snowing: " + isSnowing);


    }


}
