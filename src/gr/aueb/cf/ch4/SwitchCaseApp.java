package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Δείχνει λειτουργία της switch.
 * Δομή ελέγχου, Δομλη διακλάδωσης
 * συγκρισιμη με την If -else-if.
 * Gets a users choice based on a menu
 * and returns a feedback/confirmation.
 */
public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        // Eδώ επαναληπτική δομή.Βάζουμε do while διότι θέλουμε τουλάχιστον μια φορά να μπεί στο μενού.
        do {
            System.out.println("Please select one of the following");
            System.out.println("1. One-player game");
            System.out.println("2. Two-Player game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");
            System.out.println("Please provide a choice");

            choice= in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start one player game");
               break;
                case 2:
                    System.out.println("Start Two-player game");
                    break;
                case 3:
                    System.out.println("Start Team game");
                break;
                case 4:
                    System.out.println("quit");
                break;
                default:
                    System.out.println("Error in CHOICE");
                    break;
            }

        } while (choice != 4);

        System.out.println("Goodbye!");



    }
}
