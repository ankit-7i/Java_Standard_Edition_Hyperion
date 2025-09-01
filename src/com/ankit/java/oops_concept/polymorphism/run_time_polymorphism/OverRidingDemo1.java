package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism;


// Example demonstrating Method Overriding
class Animal {
    public void eat() {
        System.out.println("Generic eating");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating"); // Overridden method
    }
}

class Horse extends Animal {
    @Override
    public void eat() {
        System.out.println("Horse is eating"); // Overridden method
    }
}

/**
 * Note:
 * Method overriding is mainly used to replace the implementation
 * of the superclass method by the subclass method body.
 */

public class OverRidingDemo1 {
    public static void main(String[] args) {

    }
}
