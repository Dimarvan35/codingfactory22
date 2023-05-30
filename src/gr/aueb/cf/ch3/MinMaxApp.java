package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το Min kai to Max
 * δύο αριθμών που παρέχει ο χρήστης.
 */
public class MinMaxApp {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1 = 0;
        int num2 = 0;
        int max = 0;
        int min = 0;

        System.out.println("Please provide 2 numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num2 > num1) {
            min = num1;
            max = num2;

            //System.out.println("Minimum" + num1);
            //System.out.println("Maximum" + num2);


        } else {
            min = num2;
            max = num1;

        }
        //Δυνατότητα για εμφωλιασμεένο if εδώ
        //if (num1 > num2) {
           // System.out.println("Minimum" + num2);
            //System.out.println("Maximum" + num1);


        //}



    }
}
