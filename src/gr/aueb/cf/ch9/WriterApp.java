package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Prints with PrintWriter,
 * and with PrintStream.
 */
public class WriterApp {
    public static void main(String[] args) {
        try (PrintWriter os = new PrintWriter("C:/tmp/test1.txt");
             PrintStream pw = new PrintStream ("C:/tmp/test2.txt")) {

                os.println("Hello Coding Factory");
                pw.println("Hello World");
                pw.flush();

        }catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }

}
