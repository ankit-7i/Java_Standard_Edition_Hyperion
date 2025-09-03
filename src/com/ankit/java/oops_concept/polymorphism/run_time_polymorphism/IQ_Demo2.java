package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism;

/*
 * Example: Overriding methods + using 'super' keyword
 *
 * Key Points:
 * 1. Subclass can override methods of superclass with same signature.
 * 2. The 'super' keyword allows subclass to call the immediate parent class method.
 * 3. Here:
 *    - Vehicle defines tankCapacity() → returns 80
 *    - Car overrides tankCapacity() → returns 42
 *    - Car also overrides printTankCapacity(), but calls super.tankCapacity()
 *      to access parent’s implementation instead of its own.
 */

class Vehicle1 {
    // Superclass method: returns default tank capacity
    public int tankCapacity() {
        return 80;
    }

    // Prints capacity using 'this' reference (dynamic dispatch if not overridden)
    public void printTankCapacity() {
        System.out.println(this.tankCapacity());
    }
}

class Car1 extends Vehicle {
    // Overridden method: returns different value
    @Override
    public int tankCapacity() {
        return 42;
    }

    // Overridden method that explicitly calls superclass method
    @Override
    public void printTankCapacity() {
        // 'super' ensures that parent class method is used, not overridden one
        System.out.println(super.tankCapacity());
    }
}

public class IQ_Demo2 {
    public static void main(String[] args) {
        Vehicle v = new Car();

        // Calls Car's overridden printTankCapacity()
        // Inside it, 'super.tankCapacity()' → Vehicle's version (80)
        v.printTankCapacity();  // Output: 80
    }
}

/*
 * OUTPUT:
 * 80
 *
 * Explanation:
 * - v is of type Vehicle but refers to Car object.
 * - Car overrides printTankCapacity() → so Car’s version runs.
 * - Inside Car’s printTankCapacity(), it calls super.tankCapacity(),
 *   which invokes Vehicle’s version (returns 80).
 * - Hence, output = 80, not 42.
 */

