package gr.aueb.cf.ch7;

/**
 * Δήλωση και αρχικοποίηση string χαρακτήρων.
 */
public class StringDeclaration {
    public static void main(String[] args) {
        String alice = "Alice";
        String alice2 = "Alice";
        String bob = new String ("Bob");

        System.out.println(alice);
        System.out.println(alice + " " + bob);
        System.out.printf("%s", alice2);


    }

}
