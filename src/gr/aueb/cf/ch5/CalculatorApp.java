package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υλοποιέι έναν απλό calculator
 *  που παρέχει τις υπηρεσίες add, sub, mul, dic, mod.
 *  Εμφανίζει ένα μενού προς τον χρήστη με επιλογές.
 *  Λαμβάνει την τιμή της επιλογής και στην συνέχεια 2 ακόμα τιμές
 *  των num1, num2. Τελικά εμφανίζει το αποτέλεσμα.
 */
public class CalculatorApp {

    //GLOBAL ΜΕΤΑΒΛΗΤΗ ΑΥΤΗ!!!!
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        int choice = 0;
        int result = 0;



        do {
            printMenu();
            choice = getNextInt("Please insert your choice");

            // validation
            if (isChoiceInvalid(choice)) {
                System.out.println("Choice is Invalid");
                continue;
            }
            if (isChoiceQuit(choice)) {
                System.out.println("Επιλέξατε Έξοδο");
                break;
            }


            result = onChoiceGetResult(choice);
            System.out.println("Result = " + result);
        } while (true);
    }

    public static void printMenu ()

    {
        System.out.println(" Επιλέξτε ένα απο τα παρακάτω");
        System.out.println(" 1. Πρόσθεση");
        System.out.println(" 2. Αφαίρεση");
        System.out.println(" 3. Πολλαπλασιασμός");
        System.out.println(" 4. Διαίρεση");
        System.out.println(" 5. Υπόλοιπο");
        System.out.println(" 6. Έξοδος");
    }

    //Λογική ΙΟ AYTH H ΜΕΘΟΔΟΣ
    public static int getNextInt(String message){



        {
            System.out.println(message);
            // Επιστρέφει στην main την Int choice....
            return in.nextInt();
        }
    }
    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
        //Eπιστρέφει στην main if choice is invalid or valid και αυτή επειδή κανει το IO θα
        // κάνει Interact με τον χρήστη και θα του πει αν έχει κάνει κακή επιλογή με ένα μήνθμα τύπου sout και if.
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    public static int add(int num1, int num2) {
        //πρόσθεση πρώτα
        return num1 + num2;

    }

    public static int sub(int num1, int num2) {
        //αφαίρεση
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        //πολλαπλασιασμός
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        int value = 0;
        //διαίρεση
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 / num2;
    }


    public static int mod(int num1, int num2) {
        //mod
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 % num2;
    }

    public static int onChoiceGetResult(int choice) {
        int num1 = getNextInt("Please insert the first number (int)");
        int num2 = getNextInt("Please insert the second  number (int)");
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
            default:
               break;
        }
        return result;
    }

}
