package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\arvan\\OneDrive\\Υπολογιστής\\Coding Factory\\infile.txt");
        char ch;

        try (Scanner in = new Scanner(file)) {
            ch = (char) System.in.read();

        } catch (FileNotFoundException e1) {
            System.out.println("FileNotFoundException");
        } catch (IOException | RuntimeException e2) {
            System.out.println("Io exception");
        }catch (Exception e3) {
            System.out.println("Ooops something went wrong!");
        }
    }
}
