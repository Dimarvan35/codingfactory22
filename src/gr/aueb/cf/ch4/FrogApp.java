package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Δύο μέθοδοι με while και for. Εδω πιο σωστος η while
 * διότι δεν ξέρουμε ακριβώς τον αριθμό τω επαναλήψεων.
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * ο frog βρίκσεται στην θέση X και θέλει να φτάσει στην θέση Y η σε θέση > Y
 * Ο frog jumps a fixed distance, D.
 *
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο small frog πρέπει να κάνει ωστε να
 * φτάσει η να ξεπερασει τον στόχο.
 * Για παράδειγμα αν έχουμε:
 * X=10
 * Y=85
 * D=30
 *
 * τότε ο small frog θα χρειαστεί 3 jumps, γιατί  Starts at 10, και μετά πάει στην θέση 10 + 30= 40
 * Στο δεύτερο jump, πάει 40+30 =70
 * και στο 3 Jump πάει 70 + 30 = 100
 */
public class FrogApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startPos;
        int goal;
        int JumpDistance;
        int jumpCount = 0;
//        int i = 0;


        System.out.println("Please insert start position, goal and jump distance");
        startPos = in.nextInt();
        goal = in.nextInt();
        JumpDistance = in.nextInt();

        for (int i = startPos; i < goal; i += JumpDistance) {
            jumpCount++;

        }
// int i = startPos;
//         while (i <goal) {
//                i+= JumpDistance;
//                jumpCount++;
//         }


        System.out.printf("It took the frog %d jumps to go from %d to %d with a jump distance of %d.", jumpCount,
                startPos, goal, JumpDistance);
    }
}


