package com.ankit.java.oops_concept.static_initializer;

/**
 * Demonstrates the purpose of a static block in Java.
 *
 * - A static block is mainly used to initialize static data members of a class.
 * - It is also known as a static initializer.
 * - Executes only once when the class is loaded into the JVM.
 */

class Demo {

    /** Static variable x */
    static int x;

    /**
     * Static block (static initializer).
     * Initializes the static variable 'x'.
     */
    static {
        System.out.println("Default value of x: " + x); // prints 0 (default)
        x = 900; // initialize static variable
    }
}

/**
 * Main class demonstrating static initializer usage.
 */
public class Demo3 {

    /**
     * Main method - Program execution starts here.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Accessing static variable of Demo after initialization
        System.out.println("User Value of x: " + Demo.x);
    }
}

