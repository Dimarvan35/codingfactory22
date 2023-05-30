package gr.aueb.cf.ch6;

/**
 * Κουναει Inderx ri + ofset, με μέθοδο
 * i + ofset = % length.
 */
public class CircularRotationApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] rotated = doCircularRightSwiftBy(arr, 2);
        Print(rotated);

    }


    /**
     * Rotates the elements of an array by an offset.
     *
     * @param arr    the given array
     * @param offset the distance to rotate.
     * @return the rotated array, or null.
     * given array is null.
     */
    public static int[] doCircularRightSwiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];

        }

        return rotated;
    }

    public static int[] doCircularLeftSwiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];

        }

        return rotated;
    }

    public static void Print(int[] arr) {
        if (arr == null) return;
        for (int item : arr)
            System.out.print(item + " ");

    }
}