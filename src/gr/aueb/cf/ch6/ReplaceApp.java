package gr.aueb.cf.ch6;

/**
 * Updates a value in an array.
 */
public class ReplaceApp {
    public static void main(String[] args) {
      int[] arr = {1, 2 , 6, 9, 15};

      replace(arr, 6, 56);

      for (int item :arr) {
          System.out.printf(item +  " ");
      }




    }

    /**
     * updates oldVal with newVal id oldVal exists.
     * @param arr the given array
     * @param oldVal the value to be updated.
     * @param newVal the new value
     */
    public static void replace (int[] arr, int oldVal, int newVal) {
        int positionTouUpdate = -1;

        if (arr == null)  return;
        positionTouUpdate = getIndex(arr, oldVal);
        if (positionTouUpdate == -1) return;
        arr[positionTouUpdate] = newVal;


    }

    public static int getIndex(int[] arr, int value) {

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
