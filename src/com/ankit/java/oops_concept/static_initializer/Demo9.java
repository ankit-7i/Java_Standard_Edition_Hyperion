package com.ankit.java.oops_concept.static_initializer;

/*
 * Note:
 * - A static block can call static methods and assign values to static variables.
 * - Static block executes when the class is loaded, before the main method.
 * - Order of execution:
 *    1. Static block runs.
 *    2. Static method is called inside static block.
 *    3. Static variable gets updated.
 *    4. Then main method executes.
 *
 * Key Observations:
 * - Calling m1() inside static block executes the static method.
 * - Static method can return a value which is assigned to the static variable.
 */

class Sample {
    // Static block
    static {
        System.out.println("Static Block");

        // Assigning static variable using static method
        x = m1();

        System.out.println("x from static block: " + Sample.x);
    }

    // Static method
    public static int m1() {
        System.out.println("Static Method");
        return 100;
    }

    // Static variable (default 0, updated later)
    static int x;
}

public class Demo9 {
    public static void main(String[] args) {
        System.out.println("x from main method: " + Sample.x);
    }
}
