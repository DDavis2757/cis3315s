package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * In Listing 11.10, MyStack is implemented using composition. Define a new
 * stack class that extends ArrayList. Draw the UML diagram for the classes and
 * then implement MyStack. Write a test program that prompts the user to enter
 * five strings and displays them in reverse order.
 *
 * @author Dillon Davis
 */
public class C11N10MyStack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();

        System.out.println("Enter 5 Strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.nextLine());
        }

        System.out.println(stack.getSize() + " strings are: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

class MyStack extends java.util.ArrayList<Object> {

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return size();
    }

    public Object peek() {
        return get(getSize() - 1);
    }

    public Object pop() {
        return remove(getSize() - 1);
    }

    public Object push(Object o) {
        add(o);
        return o;
    }

    public int search(Object o) {
        return indexOf(o);
    }

    public String toString() {
        return "stack: " + toString();
    }
}
