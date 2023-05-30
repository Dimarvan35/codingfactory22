package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφωλιασμένη μορφή if και
 * else if μορφή στο παράδεισμα Μin Max App.
 */
public class ElseIf {
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

    } else if (num1> num2) {
            min = num2;
             max = num1;
        } else  {         //num1 ==num2
            System.out.println("Nums are equal");


        }
        System.out.println("Min :" + min);
        System.out.println("Max :" + max);
    }
    }
