package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ένα αεροσκάφος έχει δύο δεξαμενές.
 * Αν  μια δεξαμενή έχει λιγότερο απο 1/4 καύσιμα
 * τότε ανάβει πορτοκαλί σήμα, ενώ αν και οι δύο δεξαμενές έχουν
 * λιγότερο απο 1/4 τότε ανάβει κόκκινο σήμα.
 * Ο πιλότος (χρήστης) δίνει true η false
 * ανάλογα αν το tank < 1/4 η όχι, αντίστοιχα.
 */
public class OrangeRedSignalApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner (System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        //Εντολές
        System.out.println("Please insert if tank1, tank2 are less than 1/4");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        //Εκτύπωση
        System.out.println("Orange on :" + orangeOn);
        System.out.println("Red on:" +redOn) ;



    }
}
