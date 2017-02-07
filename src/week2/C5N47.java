package week2;

import java.util.Scanner;

/**
 *
 * @author Dillon Davis
 */
public class C5N47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isbn = sc.nextLine();
         if (isbn.length() == 12) {
            int sum = 0;
            int checksum = 0;
            for (int i = 1; i <= 12; i++) {
                if (i % 2 == 0) {
                    sum += 3 * Integer.parseInt(isbn.substring(i - 1, i));
                } else {
                    sum += Integer.parseInt(isbn.substring(i - 1, i));
                }
            }
            checksum = 10 - sum % 10;
            if (checksum == 10) {
                checksum = 0;
            }
            System.out.println("The ISBN number is " + isbn + checksum);
        } else {
            System.out.println(isbn + " is invalid input");
        }
    }

}
