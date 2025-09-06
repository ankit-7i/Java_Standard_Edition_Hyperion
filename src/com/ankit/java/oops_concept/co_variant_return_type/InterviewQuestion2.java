package com.ankit.java.oops_concept.co_variant_return_type;

class Base {
    int x = 100;   // Variable in Base class
}

class Derived extends Base {
    int x = 200;   // ❗ This hides the variable 'x' from Base (Variable Hiding)

    public static void access() {
        // Create Derived object
        Derived derived = new Derived();
        System.out.println(derived.x); // prints 200 (Derived class variable)

        // Upcasting: Derived object is referred by Base type
        Base base = derived;
        System.out.println(base.x);    // prints 100 (Base class variable)
    }
}

public class InterviewQuestion2 {
    public static void main(String[] args) {
        // Call access method
        Derived.access();
    }
}

/*
 * Explanation of Variable Hiding:
 * -------------------------------
 * - In Java, if a subclass declares a variable with the same name as
 *   one in its superclass, the superclass variable is hidden.
 *
 * - Access depends on the **reference type**, NOT the object type.
 *
 * Example:
 *   Derived derived = new Derived();
 *   System.out.println(derived.x);  // Uses Derived.x = 200
 *
 *   Base base = derived;  // Upcasting
 *   System.out.println(base.x);     // Uses Base.x = 100
 *
 * - Unlike method overriding (which is resolved at runtime via dynamic dispatch),
 *   variable hiding is resolved at compile time based on reference type.
 */

