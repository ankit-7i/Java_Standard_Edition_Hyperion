package com.ankit.java.oops_concept.static_initializer;

/*
 * Note:
 * If we don’t declare a static field before the static block body execution (post declaration),
 * then we can perform only write operations (Initialization is possible due to prepare phase).
 * But read operation is not possible directly, otherwise we will get an error: Illegal forward reference.
 *
 * It is possible with class name because now the compiler knows that the variable is coming
 * from class area OR method area.
 *
 * Example:
 * static {
 *     x = 100;                     // Valid (write)
 *     System.out.println(x);       // Invalid (Illegal forward reference)
 *     System.out.println(ClassName.x); // Valid (read with class name)
 * }
 * static int x;
 */

class Test11 {
    static {
        x = 100;                    // Write operation is valid
        System.out.println(Test11.x); // Read operation is valid using class name
    }

    static int x; // 4 bytes default value = 0
}

public class Demo6 {
    public static void main(String[] args) {
        new Test(); // Creating object (though not required for static block execution)
    }
}
