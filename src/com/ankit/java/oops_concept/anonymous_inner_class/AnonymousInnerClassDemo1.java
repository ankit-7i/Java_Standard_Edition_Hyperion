package com.ankit.java.oops_concept.anonymous_inner_class;

/**
 * Anonymous Inner Class in Java:
 *
 * - If we define a class inside a method body without giving it a name,
 *   it is called an Anonymous (Nameless) Inner Class.
 *
 * - The main purpose of an anonymous inner class is to:
 *   1. Create a subclass of an existing class, OR
 *   2. Create a class that implements an interface.
 *
 * - Both class body declaration and object creation are done together
 *   using the 'new' keyword.
 *
 * - An anonymous inner class must terminate with a semicolon (;).
 *
 * - The compiler generates separate class files for each anonymous inner class
 *   (e.g., OuterClass$1.class, OuterClass$2.class, etc.).
 *
 * Example Program: Demonstrating anonymous inner classes.
 */

class Bird
{
    /** Default method in Bird class */
    public void roam() {
        System.out.println("Generic Bird is roaming");
    }
}

/**
 * Driver class demonstrating anonymous inner classes.
 */
public class AnonymousInnerClassDemo1
{
    public static void main(String[] args)
    {
        // Anonymous inner class that overrides roam() for a Parrot
        Bird parrot = new Bird() {
            @Override
            public void roam() {
                System.out.println("Parrot bird is roaming");
            }
        };

        // Anonymous inner class that overrides roam() for a Sparrow
        Bird sparrow = new Bird() {
            @Override
            public void roam() {
                System.out.println("Sparrow bird is roaming");
            }
        };

        // Extra method to show scope inside main class
        //public void m1() {
        //System.out.println("Extra method inside main class");
    //}

        // Calling overridden methods
        parrot.roam();   // Output: Parrot bird is roaming
        sparrow.roam();  // Output: Sparrow bird is roaming
    }
}

