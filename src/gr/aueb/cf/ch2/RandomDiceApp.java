package gr.aueb.cf.ch2;

/**
 * Ρίχνει δύο ζάρια
 */
public class RandomDiceApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        int die1 = 0;
        int die2 = 0;

        //Τύπος Math random() * max -min+ max)+min και typecast γιατί ως γνωστόν η random επιστρεφει double απο 0-0,99 και εμεις θελουμε int.
        die1 = (int) (Math.random() *6)+1;
        die2 = (int) (Math.random() *6)+1;

        // Εκτύπωση
        System.out.printf("Die1: %d, Die2: %d", die1, die2);

    }
}
