package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα και το γινόμενο
 * των δέκα  πρώτων ακεραίων.
 */
public class SumAndMul10App {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i = 1;

        while (i <=10) {
            sum = sum + i;
            mul = mul * i;
            i++;
        }
        System.out.println("sum :" +sum);
        System.out.println("mul: " + mul);
    }
}
