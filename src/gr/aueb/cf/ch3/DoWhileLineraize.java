package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Linearizes if-then-else
 *3Η μέθοδος.
 */
public class DoWhileLineraize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 17;
        boolean bingo = false;

        do {
            System.out.println("Please provide a num");
            num = in.nextInt();

            if (num != SECRET) {
                System.out.println("Please try again!");
                continue;
            }

            System.out.println("Bingo!");
            // break;
            bingo = true;

        }while (!bingo);
    }
}
