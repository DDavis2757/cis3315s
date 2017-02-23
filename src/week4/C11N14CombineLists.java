package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dillon Davis
 */
public class C11N14CombineLists {

    public static ArrayList<Integer> union(ArrayList<Integer> list1,
            ArrayList<Integer> list2) {
        ArrayList<Integer> union = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            union.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            union.add(list2.get(i));
        }

        return union;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter 5 integers for list one: ");
        for (int i = 0; i < 5; i++) {
            list1.add(sc.nextInt());
        }
        System.out.println("Enter 5 integers for list two: ");
        for (int i = 0; i < 5; i++) {
            list2.add(sc.nextInt());
        }
        
        System.out.println("The combined list is: " + union(list1,list2));

    }
}
