package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Αποφασίζει εαν ένας int είναι άρτιος η περιττός.
 */
public class EvenOddApp {
    public static void main(String[] args) {
        int num1;
        //boolean isNumEven = false;

        Scanner in = new Scanner(System.in);


        System.out.println("Please provide a number");
        num1 = in.nextInt();

        //isNumEven = isEven(num1)

        System.out.println("Num " + num1 + "is Even:" + isEven(num1));





    }

    /**
     * Evaluates an int if it
     * is even or not.
     *
     * @param n the number (int) to evaluate.
     * @return true if n % 2 ==0 is even, else false.
     */
    public static boolean isEven (int n) {

        return n % 2 == 0;

        //Το n % 2 είναι 0 μόνο στους άρτιους.
//        if (n % 2 == 0) {
//           return true;
//       }else {
//           return false;
//       }
    }
}
