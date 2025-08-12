package com.ankit.java.oops_concept.instance_initializer;

/**
 * The main purpose of a non-static block in Java is to
 * initialize non-static fields or execute instance-level logic
 * every time an object is created.
 *
 * It's also known as an Instance Initializer.
 * Useful for:
 * - Setting up default values
 * - Common initialization logic
 * - Logging object creation
 */


class Simple {
    int data;

    // Non-static block
    {
        data = 500;  // Initialize instance variable
        System.out.println("Object creation is in progress");
    }
}

public class NonStaticBlockDemo5 {
    public static void main(String[] args) {
        // Create first object
        Simple s1 = new Simple();
        System.out.println(s1.data);  // Output: 500

        // Create second object
        Simple s2 = new Simple();
        System.out.println(s2.data);  // Output: 500
    }
}

