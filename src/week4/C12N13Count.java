/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Dillon Davis
 */
public class C12N13Count {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of your file: ");
        String name = input.next();
        Scanner reader = new Scanner(new File(name));

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        while (reader.hasNext()) {
            lineCount++;
            String s = reader.nextLine();

            String[] split = s.split(" ");
            
            for (String words : split) {
                wordCount++;
                for (int i = 0; i<words.length(); i++){
                    charCount++;
                }
            }
        }

        System.out.println(name
                + " has");
        System.out.println(charCount
                + " characters");
        System.out.println(lineCount
                + " lines");
        System.out.println(wordCount
                + " words");
    }
}
