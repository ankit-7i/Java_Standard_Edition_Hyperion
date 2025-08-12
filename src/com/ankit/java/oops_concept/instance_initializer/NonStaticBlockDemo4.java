package com.ankit.java.oops_concept.instance_initializer;

/**
 * This program demonstrates the execution order of:
 * - Non-static blocks
 * - Constructors
 * - super() calls
 *
 * Key takeaway:
 * -> Non-static blocks are executed immediately after the call to super(),
 *    before the rest of the constructor body.
 */
class Foo {

    // Non-static block
    {
        System.out.println("Non static block");
    }

    // No-argument constructor
    public Foo() {
        super();  // Calls constructor of Object class
        System.out.println("No Argument Constructor");
    }

    // Parameterized constructor
    public Foo(String message) {
        super();  // Calls constructor of Object class
        System.out.println("Parameterized Constructor " + message);
    }
}

/**
 * Main class to test the Foo class and its constructors
 */
public class NonStaticBlockDemo4 {
    public static void main(String[] args) {

        // Creating an object using the no-arg constructor
        new Foo();

        // Creating an object using the parameterized constructor
        new Foo("Hello Everyone");
    }
}

