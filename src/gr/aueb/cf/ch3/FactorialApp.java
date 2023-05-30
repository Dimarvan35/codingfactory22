package gr.aueb.cf.ch3;


import java.util.Scanner;

/**
 * Υπολογίζει τον n!
 * Τον ν παραγοντικο δηλαδη.
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Δήλωση και αρχικοποίηση μεταβλητών.
        //Αφου μιλάμε για πολλαπλασιασμούς τότε το ουδέτερο στοιχείο τους είναι το 1.
        long facto = 1L;
        //Στοιχείο ελέγχου που θα χρειαστω αργότερα στην while για να συγκρινω με του χρηστη
        int i = 1;
        int n = 0;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            // Εαν αυτο απο πάνω ειναι έτσι εκτέλεσε πολλαπλασιασμούς.
            facto *= i;
            i++;
        }

        System.out.printf(" %d! = %,d", n, facto);
    }

}