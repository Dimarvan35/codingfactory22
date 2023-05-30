package gr.aueb.cf.ch6;

/**
 * Αναζητά το ελάχιστο και το μέγιστο
 * στοιχείο ενός πίνακα.
 */
public class ArrayMinMaxApp {
    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15};
        int[] arr2 = {30, 12, 80, 7, 15};


        int minPosition = 0;
        int minValue = arr[minPosition];

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > maxValue) {
                maxPosition = i;
                maxValue = arr2[i];
            }
        }

            System.out.printf("Min Value: %d, Min Position %d", minValue, minPosition + 1);
            System.out.println();
            System.out.printf("Max Value: %d, Max Position %d", maxValue, maxPosition + 1);



    }
}
