package com.ankit.java.oops_concept.interface_concept.functional_interface.function;

import java.util.function.Function;

public class FunctionDemo3 {
    public static void main(String[] args) {

        // Example: Verify whether a given name starts with 'R' or not
        // Function<InputType, ReturnType>
        // Input: String (name), Output: Boolean (true/false)
        Function<String, Boolean> fn3 = str -> str.startsWith("R");

        // apply(T t) executes the function logic
        System.out.println("Your name starts with 'R' : " + fn3.apply("Ravi"));   // true
        System.out.println("Your name starts with 'R' : " + fn3.apply("Amit"));   // false
    }
}

