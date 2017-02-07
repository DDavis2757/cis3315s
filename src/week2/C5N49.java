package week2;

import java.util.Scanner;

/**
 *
 * @author Dillon Davis
 */
public class C5N49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        int vowelcount=0;
        int constanantcount=0;
        for (int i = 0; i < input.length(); i++) {
            String vowel=input.substring(i,i+1);
            if (vowel.equals("a")|| vowel.equals("e") || vowel.equals("i") ||
                vowel.equals("o") || vowel.equals("u") || vowel.equals("A") || 
                vowel.equals("E") || vowel.equals("O") || vowel.equals("U") )
                vowelcount++;
            else if (vowel.equals(" ")){}
                
            else 
                constanantcount++;
               }
        System.out.println("There are " + constanantcount + " constanants");
        System.out.println("There are " + vowelcount + " vowels");
    }
}
