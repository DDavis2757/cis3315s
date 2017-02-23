package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dillon Davis
 */
public class C11N4MaxArrayList {

    public static Integer max(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers ending with 0 to find the max integer : ");
        ArrayList<Integer> list = new ArrayList<>();
        Boolean bool = true;
        while (bool = true) {
            list.add(sc.nextInt());
            System.out.println("Do you want to continue? 'Y' or 'N' ");
            String answer = sc.next();

            if (answer.equals("N")) {
                System.out.println("The max integer is: " + max(list));
                bool = false;
            }

        }
    }
}
