package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism;

// Demonstration of Method Overriding and Dynamic Method Dispatch
class Shape {
    /**
     * draw() method of Shape class
     * This is the parent class method, which will be overridden by child classes.
     */
    public void draw() {
        System.out.println("Generic Draw..");
    }
}

class Square extends Shape {
    /**
     * draw() method of Square class
     * Overrides the draw() method of Shape class.
     */
    public void draw() {
        System.out.println("Drawing Square...");
    }
}

class Circle extends Shape {
    /**
     * draw() method of Circle class
     * Overrides the draw() method of Shape class.
     */
    public void draw() {
        System.out.println("Drawing Circle...");
    }
}

public class OverridingDemo5 {
    /**
     * Main method
     * Demonstrates Dynamic Method Dispatch:
     * - A parent class reference variable (Shape s) can point to different child objects.
     * - At runtime, the JVM determines which overridden method to call
     *   based on the actual object (Square or Circle).
     */
    public static void main(String[] args) {
        Shape s = null;  // Parent class reference

        s = new Square();  // Upcasting → Shape reference points to Square object
        s.draw();          // Calls Square's draw() method (Dynamic Method Dispatch)

        s = new Circle();  // Upcasting → Shape reference points to Circle object
        s.draw();          // Calls Circle's draw() method (Dynamic Method Dispatch)
    }
}

/**
 * NOTE: Dynamic Method Dispatch
 * - It is the mechanism by which a call to an overridden method
 *   is resolved at runtime instead of compile time.
 * - The method that gets executed depends on the actual object type,
 *   not the reference type.
 * - Example:
 *   Shape s = new Square();  → Executes Square's draw()
 *   Shape s = new Circle();  → Executes Circle's draw()
 */

