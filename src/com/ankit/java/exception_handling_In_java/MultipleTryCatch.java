package com.ankit.java.exception_handling_In_java;

/**
 * Working with multiple try-catch:
 * --------------------------------
 * According to our application requirement, we can provide multiple try-catch
 * blocks in our application to work with multiple exceptions.
 *
 * Note:
 * In the above program, the drawback is that the client will get all the error
 * messages at once, which is not a recommended way.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatch {
    public static void main(String[] args) {
        System.out.println("Main method started!!!");

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your Salary : ");
            double sal = sc.nextDouble();
            System.out.println("Your Salary is :" + sal);
        }
        catch (InputMismatchException e) {
            System.err.println("Input is not in a valid format");
        }

        try {
            int size = -9;
            int[] arr = new int[size];
        }
        catch (NegativeArraySizeException e) {
            System.err.println("Array size must be a positive integer!!!");
        }

        System.out.println("Main method ended!!!");
    }
}

