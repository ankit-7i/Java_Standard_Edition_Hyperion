package com.ankit.java.oops_concept.static_initializer;

/*
 * Why a static method does not act on Non-static field directly without object creation?
 * -------------------------------------------------------------------------------------
 * - A static method does not act on instance variables directly because:
 *
 *   1. All static members (static field, static block, static method, static nested inner class)
 *      are loaded/executed when the .class file is loaded into JVM memory (class loading phase).
 *
 *   2. Instance variables (non-static fields) belong to an object and are created only
 *      when the object is instantiated (object creation phase, i.e., runtime data area).
 *
 *   3. At the time of executing a static method (class loading phase),
 *      objects do not exist yet → hence instance variables are not available.
 *
 * Therefore:
 * - From a static context (static block, static method, static nested class),
 *   you cannot directly access non-static variables without creating an object.
 *
 * ----------------------------------------------------------------
 * Example 1: Invalid Case (direct access of non-static field from static method)
 */
/*
public class Welcome {
    int x = 100; // Non-static (instance variable)

    public static void main(String[] args) {
        System.out.println("x value is: " + x); // ❌ Error: cannot make static reference to non-static field
    }
}
*/

/*
 * Example 2: Correct Way (using object creation to access non-static field)
 */

class Test114 {
    int x;  // Instance variable

    // Constructor to initialize instance variable
    public Test114(int x) {
        this.x = x;
    }

    // Static method accessing non-static field via object
    public static void access() {
        Test114 t = new Test114(10); // Create object → instance variable available
        System.out.println("x value is: " + t.x);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Test114 t1 = new Test114(10);  // Object creation
        Test114.access();           // Static method indirectly accessing instance variable
    }
}

