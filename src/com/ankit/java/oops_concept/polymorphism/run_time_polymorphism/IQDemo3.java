package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism;

/*
 * Example: Method Overriding vs Method Overloading
 *
 * Key Points:
 * 1. Overriding:
 *    - Happens when a subclass provides its own implementation of a method
 *      already defined in the superclass with the same method signature.
 *    - Decided at runtime (dynamic method dispatch).
 *
 * 2. Overloading:
 *    - Happens when two or more methods in the same class have the same name
 *      but different parameter lists (different type or number of parameters).
 *    - Decided at compile time.
 */

class Bird {
    public void roam() {
        System.out.println("Generic Bird is roaming");
    }

    public void fly() {
        System.out.println("Generic Bird is Flying");
    }
}

class Parrot extends Bird {
    // Overriding roam() → same method signature as in Bird
    @Override
    public void roam() {
        System.out.println("Parrot Bird is roaming");
    }

    // Overloading fly(int) → new method with different parameter list
    public int fly(int height) {
        System.out.println("Parrot Bird is Flying with " + height + " feet height");
        return 0;
    }
}

public class IQDemo3 {
    public static void main(String[] args) {
        Parrot p = new Parrot();

        // Calls overridden roam() from Parrot
        p.roam();       // Output: Parrot Bird is roaming

        // Calls overloaded fly(int) from Parrot
        p.fly(15);      // Output: Parrot Bird is Flying with 15 feet height
    }
}

/*
 * OUTPUT:
 * Parrot Bird is roaming
 * Parrot Bird is Flying with 15 feet height
 *
 * Explanation:
 * - roam() is overridden → Parrot's version executes.
 * - fly(int) is overloaded → completely new method, independent of Bird's fly().
 */

