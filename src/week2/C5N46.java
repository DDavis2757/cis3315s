
package week2;

import java.util.Scanner;

/**
 * Reverse a string.
 * @author Dillon Davis
 */
public class C5N46 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to be reversed: ");
        String str= sc.next();
        String sum ="";
        String reverse = null;
        for (int i = str.length(); i > 0; i--){
            reverse=str.substring(i-1,i);
            sum = sum + reverse;
    }
        System.out.println(sum); 
        
    }
    
}
