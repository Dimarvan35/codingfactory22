package gr.aueb.cf.ch6;

/**
 * Ταξινόμηση πίνακα.
 * Array Sort with Selection Sort
 * Time Complexity : 0(n^2).
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 14, 3, 25, 12};

        int minVal;
        int minPosition;
        int tmp;

        for (int i =0; i < arr.length -1; i++) {

            //Βρες το ελάχιστο κάνε swap.
                minPosition = i;
                minVal = arr[i];

                for (int j = i + 1; j < arr.length; j++) {
                   //Αυτό κάνει όλη την δουλειά.
                    if (arr[j] < minVal) {
                        minVal = arr[j];
                        minPosition = j;
                    }
                }

                //Swap
            tmp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;
        }

        // Εκτύπωσε
        for (int item: arr) {
            System.out.print(item + " ");






            }

        }
    }


