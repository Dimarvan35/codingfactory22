package gr.aueb.cf.ch4;

import java.io.IOException;


/**
 * Διαβάζει έναν char
 * με την system.in.read().
 */
public class CharInputApp {
    public static void main(String[] args) throws IOException {

        char inputChar;

        System.out.println("Please insert an ASCII char");
        //inputChar = System.in.read(); Eντολή όπως στην κλασσικη scanner εισαγωγης απο το πλητρολόγιο.
        // Επίσης η System.in.read ως χαμηλού επιπέδου επιστρέφει Int και όχι char γι αυτόν τον λόγο πρεπει να κάνουμε ένα typecast στο char.
        //AΝ δώσουμε κάποιο smiley δεν μας το δείχνει.
        System.out.println("Please insert a char");
        inputChar = (char) System.in.read();

        System.out.println("char: " + inputChar);
    }
}
