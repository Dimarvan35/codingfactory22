package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {
    public static void main(String[] args) {
        int num;

        //Η try with resources βλέπε απο κάτω, και η try in try(in);
        try ( Scanner in = new Scanner(System.in);)  {
            num = in.nextInt();
            System.out.println(num);
            //in.close();
        }catch (InputMismatchException e) {
           // e.printStackTrace();
            //in.close();
            System.out.println("Oops error....");
        }

    }
}
