package gr.aueb.cf.ch4;

/**
 * Aέναο for loop.
 */
public class SpecialForCaseApp {
    public static void main(String[] args) {
        int counter = 0;

// Αυτό το for είναι σαν το while= true; H for δημιουργει την λουπα εδώ.
        for (;;) {
            System.out.print("Forever");
            counter++;
            if(counter % 20 == 0) System.out.println();
            if (counter == 100) break;


        }

    }
}
