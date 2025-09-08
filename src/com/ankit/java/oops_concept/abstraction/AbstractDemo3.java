package com.ankit.java.oops_concept.abstraction;

// Abstract class
abstract class Car
{
    protected int speed = 120;   // data member

    // Constructor
    public Car()
    {
        System.out.println("Car class constructor");
    }

    // Concrete method
    public void getCarDetails()
    {
        System.out.println("It has four wheels and one engine!!!");
    }

    // Abstract method
    public abstract void run();
}

// Subclass (Concrete class)
class Honda extends Car
{
    @Override
    public void run()
    {
        System.out.println("Honda Car is Running!!!");
    }
}

// Main class
public class AbstractDemo3
{
    public static void main(String[] args)
    {
        Car car = new Honda();   // Polymorphic reference

        System.out.println("Speed of the Car is :" + car.speed);
        car.getCarDetails();  // calls parent’s concrete method
        car.run();            // calls child’s overridden method
    }
}

