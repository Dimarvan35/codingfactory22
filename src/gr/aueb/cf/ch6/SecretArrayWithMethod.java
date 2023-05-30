package gr.aueb.cf.ch6;

/**
 * Αναζήτηση στοιχείου μέ μέθοδο, σε έναν πίνακα.
 *
 */
public class SecretArrayWithMethod {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int value = 6;
        int position = 0;
        position = getElementPosition(arr, value);
        System.out.println(position); //5

    }

    /**
     * Επιστρέφει το Index του στοιχείου που αναζητά
     * η -1 αν δεν το βρει. Επιστρέφει -1.
     * @param arr ο input array
     * @param value η τιμή που αναζητάμε
     * @return  το index αν το στοιχείο βρεθεί.
     */
    public static int getElementPosition(int[] arr, int value) {

        if (arr == null) return -1;

        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                position =  i;
                break;
            }
        }
            return position;
    }
}

// for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == value) {
//          return i;
//  }
//  }
//          return -1;
// }
//  }
