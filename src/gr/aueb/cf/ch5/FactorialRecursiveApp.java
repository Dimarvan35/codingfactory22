package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Recursieve n! Παραγοντικό του n με αναδρομή.
 */

public class FactorialRecursiveApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        int result;

        System.out.println("Please insert n (int)");
        n = in.nextInt();

        result =  facto(n);

        System.out.printf("The facto of %d =  %,d" , n, result);

    }

    /**
     *
     * @param n  n of n!
     * @return   n!
     */
    public static int facto (int n) {

        if (n <= 1) {
            return 1;
        } else {
            return n * facto(n - 1);
        }
    }
//    Αλλιως με τριαδικό τελεστή.
//        return (n <=1) ? 1 : n * facto(n-1);
}
