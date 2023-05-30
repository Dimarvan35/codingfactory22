package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει την δυναμη ενός αριθμού,
 * με αναδρομή.
 */
public class PowerRecursiveApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a;
        float b;
        float result;

        System.out.println("Please insert 2  (ints)");
        a = in.nextFloat();
        b = in.nextFloat();

        result = power(a, b);

        System.out.printf("The %d with power %d =  %,d", a, b, result);

    }

    /**
     * Αναδρομικα υπολογίζει την ύψωση σε δύναμη.
     *
     * @param a the base
     * @param b the power
     * @return the power of b.
     */
    public static float power(float a, float b) {
        if (b < 0) {
            return 1 / power(a, -b);
        }
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);

    }
}