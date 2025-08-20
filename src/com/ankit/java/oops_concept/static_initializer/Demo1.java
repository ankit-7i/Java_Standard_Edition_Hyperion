package com.ankit.java.oops_concept.static_initializer;

/**
 * Demonstrates the use of Static Blocks and Non-Static Blocks in Java.
 *
 * - Static blocks are executed only once when the class is loaded into JVM.
 * - Non-static blocks (instance blocks) are executed every time
 *   an object of the class is created.
 */


class Test {

    /**
     * Non-static block (Instance block)
     * Executes every time a new object of Test is created.
     */
    {
        System.out.println("Non static block");
    }

    /**
     * Static block
     * Executes only once when the class is loaded into JVM memory.
     */
    static {
        System.out.println("Static block");
    }
}

/**
 * Main class to demonstrate execution order of static and non-static blocks.
 */
public class Demo1 {
    /**
     * Main method - Program execution starts here.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // First object creation
        new Test();
        System.out.println("-------");

        // Second object creation
        new Test();
        System.out.println("-------");

        // Third object creation
        new Test();
    }
}
