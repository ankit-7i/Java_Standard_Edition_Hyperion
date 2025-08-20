package com.ankit.java.oops_concept.static_initializer;

/**
 * Demonstrates multiple static blocks execution in a class.
 *
 * - If there is more than one static block in a class,
 *   they will be executed in the order (Top to Bottom) when the class loads.
 */

class Foo {
    static int x;

    /** First static block */
    static {
        x = 100;
        System.out.println(x);
    }

    /** Second static block */
    static {
        x = 200;
        System.out.println(x);
    }

    /** Third static block */
    static {
        x = 300;
        System.out.println(x);
    }
}

/**
 * Main class to test multiple static block execution.
 */
public class Demo4 {
    public static void main(String[] args) {
        new Foo(); // Loads Foo class → executes all static blocks in order
    }
}
