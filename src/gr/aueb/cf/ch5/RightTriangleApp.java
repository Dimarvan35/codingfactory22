package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 τιμές double απο τον χρήστη,
 * a,b,c ¨οπου a είναι η υποτείνουσα
 * και b,c Οι δύο πλευρές.
 *
 * Ελέγχει αν το τρίγωνο είναι ορθογώνιο, δηλαδή
 * a^2 == b^2 + c^2.
 *
 * Έστω EPSILON = 0.000005 (έξι σημαντικά ψηφία).
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please insert 3 sides");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = (Math.abs(a*a -( b*b - c*c)) <=EPSILON);
        System.out.println("Ορθογώνιο" +isRight);


    }
}
