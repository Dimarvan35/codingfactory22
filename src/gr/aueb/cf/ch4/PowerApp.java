package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογίζει το α^n
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;
        int result = 1;


        System.out.println("Please provide two integers");

       a = in.nextInt();
       n = in.nextInt();

        for (int i = 1; 1 <= n; i++) {
            result *= a;
        }
        System.out.printf(" Result:  %d  ", result);
    }
}
