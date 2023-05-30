package gr.aueb.cf.ch6;

/**
 * Αναζήτηση στοιχείων πίνακα.
 */
public class ArraySearchApp {
    public static void main(String[] args) {
        final int SECRET = 12;
        int [] arr = {1, 5, 9, 3, 12};
        boolean secretIsFound= false;

        // ΑΠΛΗ FOR TRAVERSE
        for (int item : arr) {
            if (item == SECRET){
                secretIsFound = true;
                break;
            }
       }

        //ENHANCED FOR.....
   //     for (int i = 0; i < arr.length); i++){
   //         if (SECRET == arr[i]) {
    //            secretIsFound = true;
    //            break;
    //        }
    //    }

        if (secretIsFound) {
            System.out.println("Secret key was found"); }
                else {
                    System.out.println("Secret Key was not found");
                }
            }
        }


