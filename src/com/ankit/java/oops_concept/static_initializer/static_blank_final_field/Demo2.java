package com.ankit.java.oops_concept.static_initializer.static_blank_final_field;

/**
 * Demonstrates that a static blank final field can also be initialized
 * inside a static block and used in methods.
 */


class Sample1 {

    /** Static blank final field */
    public static final int A;

    /** Static block to initialize static blank final field */
    static {
        print();   // prints default value (0)
        A = 900;   // initialization
    }

    /** Method to print value of A */
    public static void print() {
        System.out.println("Default Value : " + A);
    }
}

/**
 * Main class to test default value vs assigned value of static blank final field.
 */
public class Demo2 {
    public static void main(String[] args) {
       // System.out.println("User Value : " + Sample.A);
    }
}

