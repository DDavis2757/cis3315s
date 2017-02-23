package week4;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Write a program that counts the number of words in President Abraham
 * Lincoln’s Gettysburg address from
 * http://cs.armstrong.edu/liang/data/Lincoln.txt.
 *
 * @author ddavi
 */
public class C12N19CountWords {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            Scanner input = new Scanner(url.openStream());
            int wordCount = 0;
            while (input.hasNext()) {
                String s = input.nextLine();
                String[] split = s.split(" ");
                for (String words : split) {
                    wordCount++;
                }
            }

            System.out.println(wordCount);
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (IOException ex) {
            System.out.println("IO error: No such file");
        }
    }
}
