package com.ankit.java.introduction.intro;

import java.util.Scanner; // Required to take user input

public class EvenOddComparison {
    public static void main(String[] args) {
        // Create a Scanner object to read from the console
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int x = input.nextInt(); // Captures the integer from the user

        System.out.println("--- Results ---");

        // Intern Tom's Way (Modulo)
        if (x % 2 == 0) {
            System.out.println(x + " is Even (via Modulo %)");
        } else {
            System.out.println(x + " is Odd (via Modulo %)");
        }

        // Engineer Thomas's Way (Bitwise AND)
        // Parentheses are important here because == has higher priority than &
        if ((x & 1) == 0) {
            System.out.println(x + " is Even (via Bitwise AND &)");
        } else {
            System.out.println(x + " is Odd (via Bitwise AND &)");
        }

        input.close(); // Close the scanner to free up memory
    }
}