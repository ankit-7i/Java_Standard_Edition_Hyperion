package com.ankit.java.oops_concept.abstraction;

/**
 * Program demonstrating abstraction in Java.
 * - Abstract class Vehicle defines a contract with abstract methods.
 * - Subclasses (Bus, Bike) provide concrete implementations.
 * - Shows how abstraction enforces method overriding in child classes.
 */

abstract class Vehicle
{
    /** Name of the vehicle (e.g., Bus, Bike) */
    protected String name;

    /** Model year of the vehicle */
    protected int model;

    /**
     * Constructor to initialize Vehicle
     * @param name  name of the vehicle
     * @param model model year of the vehicle
     */
    public Vehicle(String name, int model) {
        super();
        this.name = name;
        this.model = model;
    }

    /** Abstract method to define vehicle-specific running behavior */
    public abstract void run();

    /**
     * Method to print vehicle details.
     * Can be overridden by subclasses.
     */
    public String printDetails() {
        return null;  // default implementation (subclasses override this)
    }
}

/**
 * Bus class extends Vehicle and provides implementation for abstract methods.
 */
class Bus extends Vehicle
{
    /** Constructor for Bus */
    public Bus(String name, int model) {
        super(name, model);
    }

    /** Implementation of run method for Bus */
    @Override
    public void run() {
        System.out.println(name + " bus is running");
    }

    /** Override to print details of Bus */
    @Override
    public String printDetails() {
        return "[Bus name is = " + name + ". It's model is = " + model + "]";
    }
}

/**
 * Bike class extends Vehicle and provides implementation for abstract methods.
 */
class Bike extends Vehicle
{
    /** Constructor for Bike */
    public Bike(String name, int model) {
        super(name, model);
    }

    /** Implementation of run method for Bike */
    @Override
    public void run() {
        System.out.println("Bike is running");
    }

    /** Override to print details of Bike */
    @Override
    public String printDetails() {
        return "[Bike name is = " + name + ". It's model is = " + model + "]";
    }
}

/**
 * Driver class with main method to test abstraction.
 */
public class AbstractDemo7
{
    public static void main(String[] args)
    {
        Vehicle v = null;   // reference of abstract class

        // Create Bus object
        v = new Bus("Volvo", 2025);
        v.run();   // calls Bus's run()
        System.out.println(v.printDetails());

        // Create Bike object
        v = new Bike("Honda", 2025);
        v.run();   // calls Bike's run()
        System.out.println(v.printDetails());
    }
}

