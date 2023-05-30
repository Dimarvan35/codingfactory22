package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει το α^n
 * με Big Integer.
 */
public class BigIntPowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a;
        BigInteger n;
        // Αντι για BigInteger ("1") μπορούμε να βάλουμε BigInteger.ONE;
        BigInteger result = new BigInteger("1");

        System.out.println("Please insert two its, base and power");
        //Typecast.
        a = BigInteger.valueOf(in.nextInt());
        n = BigInteger.valueOf(in.nextInt());
        // Πάλι typecast απο biginteger  σε Int αυτη την φορά. Αλλά και εδω πέρα δεν μπορέι να γίνει σύγκριση του
        // Big integer με τον Integer, οπότε typecast. Αυτό γίνεται με την n.intValue.
        for (int i = 1; i<= n.intValue(); i++ ) {
           // Δυνατότητα να μην κάνουμε κανένα typecast αλλά να κάνουμε μόνο ένα typecast στο αποτέλεσμα και όλα τα
            //άλλα να τα αφήσουμε ακέραια και να αλλάξουμε μόνο το αποτέλεσμα σε Big integer αφου αυτό τελικά είναι το ζητούμενο,
            //με μέθοδο Value of.  --result = result.multiply(BigInteger.valueOf(a));----
            result = result.multiply(a);
        }

        System.out.println("Result : " +result);



    }
}
