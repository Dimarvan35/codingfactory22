package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει σε φθίνουσα σειρά
 *  * 1,2,3,4,5....,10 αστεράκια,
 *  1 αστεράκι σε κάθε γραμμή.
 */
public class Stars10Desc {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            for (int j = 10; j >= i; j--) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}