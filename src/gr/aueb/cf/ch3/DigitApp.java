package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων
 * ενός ακεραίου, το άθροισμα των ψηφίων
 * και  το άθροισμα του πρώτου ψηφίου και
 * του τελευταιου.
 * πχ. 531 Τότε το πλήθος των ψηφίων είναι 3
 * το άθροισμα είναι 9, και το αθροισμα
 * του πρώτου και του τελευταίου είναι 6.
 * count: 3, sum = 9, leftmost + rightmost: 6
 */
public class DigitApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int count = 0;
        int currentDigit = 0;
        int rightMost = 0;
        int leftmost = 0;

        System.out.println("Please insert a number");
        inputNum = in.nextInt();
        num = inputNum;


        do {
            count++;
            currentDigit = num % 10;
            sum = sum + currentDigit;
            if (count == 1) {
                rightMost = currentDigit;
            }
            num = num / 10;
        } while (num != 0);
        leftmost = currentDigit;
        sumLeftRight = leftmost + rightMost;

        System.out.println("Count : " + count);
        System.out.println("Sum of Digits: " + sum);
        System.out.println("Sum of lefMost, rightmost digits: " + sumLeftRight);


    }

}
