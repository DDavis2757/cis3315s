package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Dillon Davis
 */
public class C12N31BabyNames {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        Scanner reader = new Scanner(new File("babynameranking" + year + ".txt"));
        System.out.println("Enter gender M or F :");
        String gender = sc.next();
        System.out.println("Enter the exact name: ");
        String name = sc.next();

        for (int i = 0; i < 1000; i++) {
            String s = reader.nextLine();
            String[] split = s.split(" ");
            for (int j = 0; j < 5; j++) {
                if (gender.equals('M')) {
                    if (name.equals(split[1])) {
                        System.out.println(name + " is ranked #" + split[0] + " in year " + name);
                    }
                }
                else if (gender.equals('F')) {
                    if (name.equals(split[3])) {
                        System.out.println(name + " is ranked #" + split[0] + " in year " + name);
                    }

                }

            }
        }

    }
}
