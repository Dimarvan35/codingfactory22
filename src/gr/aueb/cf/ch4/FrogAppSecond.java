package gr.aueb.cf.ch4;



/**
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
public class FrogAppSecond {
    public static void main(String[] args) {

        int jumps = 0;
        int x= 10;
        int y = 85;
        int jmp = 30;

       //Μέθοδος ceal.
        jumps = (int) Math.ceil (((y-x)) / (double) jmp);

        System.out.println("The jumps are: " +jumps);


    }
}
