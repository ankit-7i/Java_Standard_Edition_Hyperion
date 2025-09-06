package com.ankit.java.oops_concept.co_variant_return_type;

// Base class A
class A { }

// Class B extends A (so B is a subclass of A)
class B extends A { }

// Parent class Vehicle
class Vehicle {
    // Method run() returns object of type A
    public A run() {
        System.out.println("Vehicle is running");
        return new A(); // returns superclass object
    }
}

// Child class Car extends Vehicle
class Car extends Vehicle {
    @Override
    // Overridden method run() now returns B (subclass of A)
    // ✅ This is allowed because B IS-A A (covariant return type)
    public B run() {
        System.out.println("Car is running");
        return new B(); // returns subclass object
    }
}

// Demo class
public class CoVariantDemo2 {
    public static void main(String[] args) {
        // Upcasting: Vehicle reference, Car object
        Vehicle v = new Car();

        // Calls overridden method in Car
        v.run();  // prints "Car is running"
    }
}

/*
 * Explanation of Co-Variant Return Type:
 * --------------------------------------
 * - From Java 1.5 onwards, a subclass can override a method
 *   and change its return type to a subclass of the original return type.
 *
 * - In this example:
 *   Vehicle.run() returns A
 *   Car.run() returns B (where B extends A)
 *
 * - This is valid because B is a subclass of A.
 *   (subclass return type is compatible with superclass return type).
 *
 * ⚠️ Note:
 * - Co-variant return type works only with reference types (objects).
 * - It does NOT work with primitive types (int, double, void, etc.).
 */

