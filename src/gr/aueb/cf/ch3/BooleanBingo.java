package gr.aueb.cf.ch3;

/**
 * Linearizes if-then-else
 *2Η μέθοδος.
 */
import java.util.Scanner;

public class BooleanBingo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 17;
        boolean bingo = false;

        while (!bingo) {
            System.out.println("Please provide a num");
            num = in.nextInt();

            if (num != SECRET) {
                System.out.println("Please try again!");
                continue;
            }

            System.out.println("Bingo!");
           // break;
            bingo = true;

        }
    }
}
