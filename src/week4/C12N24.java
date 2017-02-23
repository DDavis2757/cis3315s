/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * (Create large dataset) Create a data file with 1,000 lines. Each line in the
 * file consists of a faculty member’s first name, last name, rank, and salary.
 * The faculty member’s first name and last name for the ith line are FirstNamei
 * and LastNamei. The rank is randomly generated as assistant, associate, and
 * full. The salary is randomly generated as a number with two digits after the
 * decimal point. The salary for an assistant professor should be in the range
 * from 50,000 to 80,000, for associate professor from 60,000 to 110,000, and
 * for full professor from 75,000 to 130,000. Save the file in Salary.txt. Here
 * are some sample data: FirstName1 LastName1 assistant 60055.95 FirstName2
 * LastName2 associate 81112.45 . . . FirstName1000 LastName1000 full 92255.21
 *
 * @author 55davisdm28
 */
public class C12N24 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");
        Random rand = new Random();
        if (file.exists()) {
            System.out.println("File already exits.");
            System.exit(1);
        } else {
            try {
                PrintWriter output = new PrintWriter(file);
                for (int i = 0; i < 1000; i++) {
                    output.print("FirstName" + i + " LastName" + i);
                    int seed = rand.nextInt(3);
                    if (seed == 0) {
                        output.print(" assistant ");
                        double randSal = rand.nextDouble() * (80000 - 50000) + 50000;
                        output.println(randSal);
                    } else if (seed == 1) {
                        output.print(" associate ");
                        double randSal = rand.nextDouble() * (110000 - 60000) + 60000;
                        output.println (randSal);
                    } else   {
                        output.print(" full ");
                        double randSal = rand.nextDouble() * (130000 - 75000) + 75000;
                        output.println (randSal);
                    }
                }
                output.close();

            } catch (IOException x) {
                System.out.println("Problem with file");
            }
        }
    }
}
