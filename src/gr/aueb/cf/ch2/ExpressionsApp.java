package gr.aueb.cf.ch2;

/**
 * Expressions Examples
 */
public class ExpressionsApp {
    public static void main(String[] args) {
        // Δήλωση και Αρχικοποίηση
        int num1= 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;

        // Εντολή
        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        result1 = num1 + num2 * (num2 - 15 / num1);
        result2 = num1++;
        result3= ++num2;

        //Εκτύπωση
        System.out.printf("sum: %d, sub: %d, mul: %d, div: %d, mod: %d, result1: %d, result2 : %d, result3: %d",
        sum, sub, mul, div, mod, result1, result2, result3);
    }

}
