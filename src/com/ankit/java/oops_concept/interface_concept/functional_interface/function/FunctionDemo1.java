package com.ankit.java.oops_concept.interface_concept.functional_interface.function;

// Function<T, R> :
// --------------------------------------------
// * It is a predefined functional interface available in java.util.function sub package.
// * Annotated with @FunctionalInterface
// * It contains one abstract method: R apply(T x);
// * Used to accept one argument of type T (input) and return a result of type R (output).

// Type Parameters:
// T -> the type of input to the function
// R -> the type of result of the function

// Note:
// The type of T (input) and the type of R (result) will be decided by the user.



import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {

        // Example: Find the cube of a given number
        // Function<InputType, ReturnType>
        Function<Integer, Integer> fn1 = num -> num * num * num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");

        int no = Integer.parseInt(sc.nextLine());

        // apply(T t) method is used to execute the function logic
        System.out.println("Cube of " + no + " is " + fn1.apply(no));

        sc.close();
    }
}

