package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής.
 * Kai απόλυτο αριθμών.
 * Αυτο σε συντόμευση πολλαπλών if then else.
 * Το απόλυτο ενός αριθμού είναι χ αν ο αριθμος ειναι χ>ο,
 * και -χ αν ο αριθμός είναι μικρότερος του 0.
 *
 */
public class AbsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please provide a num");
        num = in.nextInt();
        // If το Num > 0 then Num είναι θετικός, αλλιως : -Num αρνητικός. Δηλαδη το απόλυτο ενος αρνητικου αριθμού είναι -Num και το αντίστροφο.
        abs = (num > 0) ? num : -num;
        // Η θα μπορόυσε κανείς να το κάνει πιο περίπλοκο. Αλλα χάνεται readability ετσι.
        // abs = (num > 0) ? num :  (num < 0) ? -num : 0;

        System.out.println("Abs : " + abs);

    }
}
