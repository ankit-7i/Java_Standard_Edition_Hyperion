package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism;


// Demonstration of Method Overriding and Upcasting in Java
class Animal2 {
    /**
     * sleep() method of Animal class
     * This is the parent method which will be overridden in the child class.
     */
    public void sleep() {
        System.out.println("Generic Animal is sleeping here");
    }
}

class Dog2 extends Animal2 {
    /**
     * sleep() method of Dog class
     * Overrides the sleep() method of Animal class.
     * When an object of Dog is created, this method will be executed instead
     * of the parent class method.
     */
    public void sleep() {
        System.out.println("Dog Animal is sleeping here");
    }
}

public class OverridingDemo3 {
    /**
     * Main method
     * Demonstrates Upcasting:
     * - Animal reference points to Dog object (Animal a1 = new Dog();).
     * - Even though the reference is of type Animal, at runtime the Dog's
     *   overridden sleep() method will be called (dynamic method dispatch).
     */
    public static void main(String[] args) {
        Animal2 a1 = new Dog2(); // Upcasting: Parent reference → Child object
        a1.sleep();  // Calls Dog's sleep() method due to overriding
    }
}

