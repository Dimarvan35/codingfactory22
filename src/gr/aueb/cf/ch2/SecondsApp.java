//package gr.aueb.cf.ch2;
//
//import java.util.Scanner;
//
///**
// * Διβάζει ώρες, λεπτά και δεύτερα και
// * μετατρέπει σε δευτερόλεπτα
// */
//public class SecondsApp {
//    public static void main(String[] args) {
//
//       // Δήλωση και αρχικοποίηση μεταβλητών
//        Scanner in = new Scanner(System.in);
//        int inputHours = 0;
//        int inputMinutes = 0;
//        int inputSeconds = 0;
//        int totalSeconds = 0;
//        final int SECONDS_PER_HOUR = 3600;
//        final int SECONDS_PER_MINUTE = 60;
//
//        // Εντολές
//
//        System.out.println("Please insert hours, minutes and seconds");
//        inputHours = in.nextInt ();
//        inputMinutes = in.nextInt();
//        inputSeconds = in.nextInt();
//        totalSeconds = inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUTE + inputSeconds;
//
//        //Eκτύπωση
//
//        System.out.printf("%d hours, %d minutes, %d seconds = %d total seconds",
//                inputHours, inputMinutes, inputSeconds, totalSeconds);
//
//
//    }
//    }
//}
