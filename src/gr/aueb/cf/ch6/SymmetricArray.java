package gr.aueb.cf.ch6;

/**
 * Βρίσκει εάν είναι συμμετρικός ένας πίνακας.
 */
public class SymmetricArray {
    public static void main(String[] args) {

        int [] arr = {1, 2, 2, 1};

        System.out.println("Array is symmetric:" + isArraySymmetric(arr));
        System.out.println("Array is symmetric:" + isArrSymmetric(arr));

    }

    public static boolean isArraySymmetric (int[] arr) {
        boolean isSymetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr [j]) {
            isSymetric = false;
            break;
            }
        }
        return isSymetric;
    }
    public static boolean isArrSymmetric (int [] arr) {
        boolean isSymmetric = true;
        int n = arr.length - 1;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i]) {
                isSymmetric = false;
                break;
            }
            return isSymmetric;

        }
        return isSymmetric;
    }
}
