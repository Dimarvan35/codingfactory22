package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ένας μετρητής είναι
 * μετράει το πλήθος των θετικών αριθμών που δίνει
 * ο χρήστης. Όταν θα δώσει αρνητικό θα σταματήσει
 * το πρόγραμμα.
 */
public class PositivesCountApp {
    public static void main(String[] args) {
       //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0;


        System.out.println("Please give a num");
        num = in.nextInt();

            while (num >=0) {
            // Εαν αυτο απο πάνω ειναι έτσι εκτέλεσε
                /** Αύξησε τον αριθμο τον θετικων σχολίων.Χωρίς αυτό δεν θα μπορούσαμε δεν θα εκανε στο final count */
                positiveCount ++;
                System.out.println("Please give a num:");
                num = in.nextInt();
        }
        System.out.println(" Positives counts : " + positiveCount );

    }
}
