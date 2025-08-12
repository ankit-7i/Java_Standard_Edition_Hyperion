package com.ankit.java.oops_concept.instance_initializer;

/**
 * Demonstrates that using a `return` statement inside a
 * non-static block is illegal in Java.
 *
 * Reason: Non-static blocks must execute completely when an object is created.
 * Using `return` will lead to a compile-time error.
 */

public class NonStaticBlockDemo8 {

    // This non-static block causes a compile-time error due to return
    {
        System.out.println("NSB in ELC class");
        // return;  // ❌ Error: 'return' outside method
    }

    public static void main(String[] args) {
        // Method body
    }
}

