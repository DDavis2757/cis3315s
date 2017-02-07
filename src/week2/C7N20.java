package week2;

import java.util.Scanner;

/**
 *
 * @author ddavi
 */
public class C7N20 {

    public static void sort(int[] list) {
        for (int lastIndex = list.length - 1; lastIndex > 0; lastIndex--) {
            int currentMax = list[lastIndex];
            int currentMaxIndex = lastIndex;
            for (int currentIndex = 0; currentIndex <= lastIndex; currentIndex++) {
                if (list[currentIndex] > currentMax) {
                    currentMax = list[currentIndex];
                    currentMaxIndex = currentIndex;
                }
            }
            if (currentMaxIndex != lastIndex) {
                list[currentMaxIndex] = list[lastIndex];
                list[lastIndex] = currentMax;
            }
        }
    }

    public static void display(int[] list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.println("Enter 10 numbers: ");
        for(int i=0; i<10; i++){
            nums[i]=sc.nextInt();
        }
        display(nums);
        sort(nums);
        display(nums);
    }
}
