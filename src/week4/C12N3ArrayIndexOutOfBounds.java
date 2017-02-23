package week4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dillon Davis
 */
public class C12N3ArrayIndexOutOfBounds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i]=rand.nextInt();
        }
        System.out.println("Enter index of array to find number: ");
        try {
            System.out.println(array[sc.nextInt()]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("You entered an index out of bounds.");
        }
    }

}
