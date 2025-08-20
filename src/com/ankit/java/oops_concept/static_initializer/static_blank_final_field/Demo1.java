package com.ankit.java.oops_concept.static_initializer.static_blank_final_field;

/**
 * Demonstrates static blank final field initialization.
 *
 * - A static blank final field must be initialized inside a static block.
 */

class Sample {

    /** Static blank final field */
    public static final int MAX_VALUE;

    /** Static block to initialize static blank final field */
    static {
        MAX_VALUE = 900;
    }
}

/**
 * Main class to test static blank final field initialization.
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Sample.MAX_VALUE);
    }
}

