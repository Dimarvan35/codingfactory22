package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν ένα έτος είναι δίσεκτο
 *, όπου το δίσεκτο σημαίνει το έτος να διαιρείται
 * με το 4, να μην διαιρείται με το 100, και αν διαιρείται και με το 100,
 * να διαιρείται και με το 400.
 */
public class LeapYearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int year;
        boolean isLeap = false;

        System.out.println("Please provide a year (int)");
        year = in.nextInt();

        isLeap = (year % 4 ==0 && year % 100 !=0 || year % 400 ==0);

        System.out.println("The year is leap" +isLeap);
    }
}
