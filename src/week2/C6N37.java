package week2;


import java.util.Scanner;



/**
 *
 * @author Dillon Davis
 */
public class C6N37 {
    public static String format(int num, int width) {
    String s = "" + num;
        if (s.length() < width) {
            int numZeros = width - s.length();
            for (int i = 0; i < numZeros; i++) {
                s = "0" + s;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number and the width to display: ");
        int num = sc.nextInt();
        int width = sc.nextInt();
        System.out.println(format(num, width));
    }
}
