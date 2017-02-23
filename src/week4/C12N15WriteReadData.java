package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Write a program to create a file named Exercise12_15.txt if it does not
 * exist. Write 100 integers created randomly into the file using text I/O.
 * Integers are separated by spaces in the file. Read the data back from the
 * file and display the data in increasing order.
 *
 * @author Dillon Davis
 */
public class C12N15WriteReadData {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        } else {
            PrintWriter output = new PrintWriter(file);
            Random rand = new Random();
            for (int i = 0; i < 100; i++) {
                output.println(rand.nextInt());
                
            }
            output.close();
            Scanner sc = new Scanner(file);

            int[] randomNum = new int[100];

            for (int i = 0; i < 100; i++) {
                if (sc.hasNext());
                randomNum[i] = parseInt(sc.nextLine());
            }

            Arrays.sort(randomNum);

            for (int i = 0; i < 100; i++) {
                System.out.println(randomNum[i]);
            }
        }
    }
}
