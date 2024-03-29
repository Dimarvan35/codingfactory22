package gr.aueb.cf.ch6;

/**
 * Δήλωση και αρχικοποίηση πίνακα
 * και populate (εισαγωγή στοιχείων).
 */
public class PopulateArray {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση πίνακα με length - size. To length είναι 3.
        int [] arr = new int [3];
        arr [0] = 5;
        arr[1] = 7;
        arr[2] = 8;

//        System.out.println(arr[0] + " " + arr[1] + " " +arr[2]);
        //FOR AND TRAVERSE
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        //Enhanced for
        for (int item :arr) {
            System.out.print(item + " " );
        }

        //Unsized Initialization

        int [] arr2 = {1, 5, 8, 9, 12};

        //Η ο ίδιος τρόπος που είναι πιο flexible γίνεται και ως εξής---Array initializer.

        int [] arr3 = new int [] {4, 6, 9, 10};

        //H the third way

        //int [] arr3;
        // arr3 = new int [] {4, 6, 9, 10};

    }
}
