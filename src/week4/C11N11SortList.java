package week4;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Scanner;

/**
 * Write a test program that prompts the user to enter 5 numbers, stores them in
 * an array list, and displays them in increasing order.
 *
 * @author Dillon Davis
 */
public class C11N11SortList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        sort(list);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }

}
