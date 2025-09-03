package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism;

/*
 * Example: Method Overriding + Dynamic Method Dispatch
 *
 * Key Points:
 * 1. Overriding occurs when a subclass provides its own implementation of a method
 *    that is already defined in the superclass with the same signature.
 *
 * 2. Dynamic Method Dispatch (Runtime Polymorphism):
 *    - When a superclass reference variable refers to a subclass object,
 *      the call to an overridden method is resolved at runtime.
 *    - The JVM decides which method (superclass or subclass) to call
 *      based on the actual object type, not the reference type.
 */

class Vehicle {
    // Method to return default tank capacity
    public int tankCapacity() {
        return 80;
    }


    // Method that prints tank capacity using 'this' reference
    public void printTankCapacity() {
        // 'this' ensures that the actual object's method is called (dynamic dispatch)
        System.out.println(this.tankCapacity());
    }
}

class Car extends Vehicle {
    // Overriding the tankCapacity() method
    @Override
    public int tankCapacity() {
        return 42;
    }
}

public class IQ_Demo1 {
    public static void main(String[] args) {
        // Superclass reference → Subclass object
        Vehicle vehicle = new Car();

        // Calls Vehicle.printTankCapacity()
        // Inside it, 'this.tankCapacity()' dynamically binds to Car's overridden method
        vehicle.printTankCapacity();  // Output: 42
    }
}

/*
 * OUTPUT:
 * 42
 *
 * Explanation:
 * - vehicle is of type Vehicle but refers to a Car object.
 * - printTankCapacity() is not overridden, so Vehicle's version executes.
 * - Inside printTankCapacity(), 'this.tankCapacity()' calls Car's overridden method.
 * - Hence, output is 42, not 80.
 */

