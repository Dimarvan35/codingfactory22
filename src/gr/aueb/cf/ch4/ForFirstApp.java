package gr.aueb.cf.ch4;

/**
 * A simple for iteration
 * that runs 10 times. FOR
 */
public class ForFirstApp {
    public static void main(String[] args) {
        //Προσοχή σε αντιδιαστολή η i εδω η δομη ελέγχου δεν είναι στο σωμα της for
        //αλλά στην παρένθεση. Αυτό την κάνει πιο αποδοτική, διότι όταν ολοκληρώνεται η συνθήκη η i
        //πεθαίνει μαζί με την for. Δεν κρατιέται στην μνήμη του υπολογιστή. Τοιπική μεταβλητη της for.
        for (int i = 1;  i <=10; i++) {
            System.out.print("*");
        }

    }
}
