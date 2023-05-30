package gr.aueb.cf.ch2;


import java.time.DayOfWeek;
import java.util.Scanner;

/**
 * Μετατρέπει δευτερόλεπτα σε μέρες
 * ώρες, λεπτά και δευτερόλεπτα.
 */
public class SecondsDemo {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών.
        Scanner in = new Scanner (System.in);
        int inputSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        final int DAY_SECS = 24 * 3600;
        final int HOUR_SECS = 3600;
        final int MINUTE_SECS = 60;
        int remainingSeconds = 0;

        //Εντολές
        System.out.println("Please insert the total amounts of seconds");


        //inputSeconds = inputSeconds / DAY_SECS %, remainingSeconds / HOUR_SECS %, remainingSeconds / MINUTE_SECS %, remainingSeconds;

        inputSeconds = in.nextInt();

        remainingSeconds =  inputSeconds;

        days = remainingSeconds / DAY_SECS;
        // remainingSeconds % = DAY_SECS.
        remainingSeconds = remainingSeconds % DAY_SECS;

        hours = remainingSeconds / HOUR_SECS;
        remainingSeconds = remainingSeconds  % HOUR_SECS;

        minutes = remainingSeconds / MINUTE_SECS;
        remainingSeconds = remainingSeconds % MINUTE_SECS;







    //Εκτύπωση

        //System.out.printf("inputdays %d, inputhours %d, inputminutes %d, inputtotalseconds %d", days, hours, minutes, seconds);

        System.out.printf("%,d input seconds = %d days, %d days, %d hours, % minutes, %d seconds", inputSeconds, days, hours, minutes, remainingSeconds
        );


    }


    }

