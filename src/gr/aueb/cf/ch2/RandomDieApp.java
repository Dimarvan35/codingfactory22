package gr.aueb.cf.ch2;

public class RandomDieApp {

    public static void main(String[] args) {
      /* Γιατι int στο δεύτερο part? Γιατί
       * η random βγάζει δεκαδικό, και το Int ειναι
       * ακέραιο, ο΄ποτε επειδή το δεξί μέρος
       * εκχωρείται στο αριστερό ο float 32 bit
       * αλλαζει σε Int, και δεν τίθεται θέμα μεγέθους εδώ.
       */
       int die = (int) (Math.random() * 6) + 1;
        System.out.println(die);
    }
}
