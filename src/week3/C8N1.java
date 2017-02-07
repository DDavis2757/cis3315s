package week3;

import java.util.Scanner;

/**
 *
 * @author Dillon Davis
 */
public class C8N1 {

    public static double sumColumn(double[][] m, int columnindex) {
        double total = 0;
        for (int i = 0; i < m.length; i++) {
            total += m[i][columnindex];

        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3 by 4 matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.println("Sum of the elements at column" + i + " is " + sumColumn(matrix, i));
            }
        
    }
}
