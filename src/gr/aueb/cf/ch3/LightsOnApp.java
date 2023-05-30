package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Aποφασίζει αν πρέπει να ανάψουν τα φώτα
 * του αυτοκινητου με βάση 3 μεταβλητές
 * άμα βρέχει, και τουλάχιστον ισχύει
 * ένα τουλάχιστον απο τα επόμενα: είναι σκοτάδι,
 * και τρέχουμε (speed > 100). Τιμές απο
 * χρήστη (standart input).
 *
 *
 */
public class LightsOnApp {
    public static <ΙΙ> void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών.

        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean Lightson = false;

        //Εντολές

        System.out.println("Please insert if it is raining (true/false");
        isRaining = in.nextBoolean ();

        System.out.println("Please insert if it is Dark (true/false");
        isDark = in.nextBoolean();

        System.out.println("Please insert your speed (int)");
        speed= in.nextInt();

        isRunning = (speed >100);
        Lightson = isRaining && (isDark || isRunning);


                //Ekτύπωση
        System.out.println("Lights On:" + Lightson);



    }
}

