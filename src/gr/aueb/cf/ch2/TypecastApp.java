package gr.aueb.cf.ch2;

public class TypecastApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 10;
        long num2 = 20L;
        long result = 0L;

        //Εντολή
        num1 = (int)num2;
        result = num1 + num2;

    }
}
