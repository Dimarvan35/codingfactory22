package gr.aueb.cf.ch5;

/**
 * Αμοιβαία ανταλλαγή δύο τιμών που
 * δίνει ο χρήστης.
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);

        System.out.println("a =" + a + " b =" +b );

    }

    /**
     * Swaps a,b, swap = a---b, και b---a
     * @param a the first value
     * @param b the second value
     */
    public static void swap (int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;

    }
}
