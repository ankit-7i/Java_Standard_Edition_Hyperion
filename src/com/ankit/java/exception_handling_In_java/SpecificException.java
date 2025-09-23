package com.ankit.java.exception_handling_In_java;

/**
 * Working with Specific Exception:
 * --------------------------------
 * While working with exceptions, in the corresponding catch block
 * we can take Exception (super class) which can handle any type of Exception.
 *
 * On the other hand, we can also take specific types of exceptions
 * (like ArithmeticException, InputMismatchException, NullPointerException, etc.)
 * which will handle only one type, i.e., a specific type of exception.
 */


public class SpecificException {
    public static void main(String[] args) {
        System.out.println("Main Method started");

        try {
            String str = null;
            System.out.println(str.toUpperCase());
        }
        catch (NullPointerException e) {
            System.out.println("Ref variable is pointing to null");
            System.out.println(".................");
            System.out.println(e.getMessage());
            System.out.println(".................");
            System.out.println(e.toString());
            System.out.println(".................");
            e.printStackTrace();
        }

        System.out.println("Main Method ended");
    }
}

