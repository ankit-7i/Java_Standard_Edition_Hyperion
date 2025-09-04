package com.ankit.java.oops_concept.polymorphism.instance_of_operator;

/**
 * Demonstration of instanceof operator with inheritance.
 * -------------------------------------------------------
 * - instanceof checks whether an object reference is an instance of a specific class
 *   or its subclass (IS-A relationship).
 * - Returns true if the reference variable is pointing to the same class object
 *   or any subclass object in the inheritance chain.
 * - This prevents ClassCastException by ensuring type-safety before casting.
 *
 * Example below shows:
 * Gamma extends Beta, and Beta extends Alpha.
 * So, Gamma IS-A Beta, Gamma IS-A Alpha, and Gamma IS-A Object.
 */

class Alpha {
    // Parent class
}

class Beta extends Alpha {
    // Beta is a child of Alpha
}

class Gamma extends Beta {
    // Gamma is a child of Beta (and indirectly a child of Alpha too)
}

public class InstanceOfDemo2 {
    public static void main(String[] args) {

        // Creating a Gamma object
        Gamma g = new Gamma();

        // Checking Gamma type
        if (g instanceof Gamma) {
            System.out.println("g is pointing to Gamma Object");
        }

        // Checking parent class Beta type
        if (g instanceof Beta) {
            System.out.println("g is pointing to Beta Object");
        }

        // Checking grandparent class Alpha type
        if (g instanceof Alpha) {
            System.out.println("g is pointing to Alpha Object");
        }

        // Checking Object class (superclass of all classes in Java)
        if (g instanceof Object) {
            System.out.println("g is pointing to Object class");
        }
    }
}

