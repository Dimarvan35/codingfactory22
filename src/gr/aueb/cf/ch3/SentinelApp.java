package gr.aueb.cf.ch3;

/**
 * Όταν δεν ξέρουμε απο
 * πριν τον αριθμό επαναλήψεων τότε έχουμε
 * τον αριθμο κόμβο. Το στοπ.
 * Η πιο κλασσική χρήση της while είναι αυτή.
 *
 * Keeps reading until a sentinel value
 * is provided.
 */

import java.util.Scanner;

public class SentinelApp {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num = 0;
        int counter = 0;

        System.out.println("Please provide a num");
        num = in.nextInt();

        // 0 = sentinel κόμβος φρουρός.
        while (num != 0){
            //Do υπονοείται
//            System.out.println(num);
            counter++;
            System.out.println("Please provide a num");
            num = in.nextInt();

        }
        System.out.printf("%d counter",  counter);
    }
}
