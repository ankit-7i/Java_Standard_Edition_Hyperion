package com.ankit.java.oops_concept.static_initializer;

/*
 * Note:
 * Inside a static method, we can directly access static variables without using the class name.
 * Because the compiler already knows that static members belong to the class area.
 *
 * Key Point:
 * - In static blocks, read access requires ClassName (to avoid Illegal forward reference).
 * - But in static methods, ClassName is not required to access static variables.
 *
 * Example:
 * public static void accept() {
 *     x = 900;                // Write is valid
 *     System.out.println(x);  // Read is valid (ClassName not required)
 * }
 */

class Test13 {
    public static void accept() {
        x = 900;                      // Write operation (valid)
        System.out.println(x);        // Read operation (ClassName not required)
    }

    static int x; // 4 bytes default value = 0
}

public class Demo7 {
    public static void main(String[] args) {
        Test13.accept(); // Calls static method
    }
}

