package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyResourceApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        try {
            num = in.nextInt();
            System.out.println(num);
            //in.close();
        }catch (InputMismatchException e) {
            e.printStackTrace();
            //in.close();
        } finally {
            try {
                if (in != null) in.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
