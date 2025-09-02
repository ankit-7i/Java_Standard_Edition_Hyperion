package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism;

// Demonstration of Multi-level Method Overriding and Upcasting in Java
class Animal3 {
    /**
     * sleep() method of Animal class
     * This is the parent method. It will be overridden by subclasses.
     */
    public void sleep() {
        System.out.println("Generic Animal is sleeping here");
    }
}

class Dog3 extends Animal3 {
    /**
     * sleep() method of Dog class
     * Overrides the sleep() method of Animal class.
     */
    public void sleep() {
        System.out.println("Dog Animal is sleeping here");
    }
}

class Puppy extends Dog3 {
    /**
     * sleep() method of Puppy class
     * Overrides the sleep() method of Dog class.
     * If this method is present, JVM will execute this one at runtime.
     */
    public void sleep() {
        System.out.println("Puppy Animal is sleeping here");
    }
}

public class OverridingDemo4 {
    /**
     * Main method
     * Demonstrates multi-level inheritance + overriding + upcasting.
     * - Animal reference points to Puppy object (Animal a1 = new Puppy();).
     * - Even though the reference is of type Animal, the JVM decides at runtime
     *   which overridden method to execute (dynamic method dispatch).
     * - Since Puppy overrides sleep(), it will be executed.
     */
    public static void main(String[] args) {
        Animal3 a1 = new Puppy(); // Upcasting: Parent reference → Child object
        a1.sleep();  // Calls Puppy’s sleep() method
    }
}

/**
 * NOTE:
 * - The sleep() method is overridden in Puppy class, so JVM executes Puppy’s version.
 * - If Puppy did not override sleep(), then Dog’s version would execute.
 * - If Dog also did not override, then Animal’s version would execute.
 * - This shows how method overriding works in a multi-level inheritance hierarchy.
 */
