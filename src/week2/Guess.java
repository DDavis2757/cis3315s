/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dillon Davis
 * This line was done in github.
 */
public class Guess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(10)+1;

        System.out.println("Guess a number between 1 and 10");
       
        
        while (true) {
            System.out.println("Enter a number: ");
            int guess=sc.nextInt();
            if (guess == number) {
                break;
            } else if(guess >= number) {
                System.out.println("Sorry, you guessed high.");
            }
            else {
                System.out.println("Sorry, you guessed low.");
            }

        }
        System.out.println("You win!");
    }
}

