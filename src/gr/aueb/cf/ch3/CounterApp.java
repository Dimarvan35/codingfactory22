package gr.aueb.cf.ch3;

/**
 *Εκτελεί έναν συγκεκριμένο αριθμό επαναλήψεων
 * που ορίζεται απο την αρχική τιμή, απο
 * την τελική τιμή και απο το step.
 */
public class CounterApp {
    public static void main(String[] args) {
      int i = 1;

      while (i <= 10) {
            System.out.print("*");
            i++;
        }
    }
}
