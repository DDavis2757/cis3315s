/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author ddavi
 */
public class C11N12ArrayListSum {
    public static double sum(ArrayList<Double> list){
        double sum=0;
        for (int i=0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        
        System.out.println("Enter 5 numbers: ");
        for(int i=0; i < 5; i++){
            list.add(sc.nextDouble());
        }
        System.out.println(sum(list));
    }
}
