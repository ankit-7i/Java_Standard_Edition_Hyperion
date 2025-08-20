package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.hierarchial_inheritance.vehicle_system;

public class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, String model, int year, String type, int numberOfDoors) {
        super(brand, model, year, type);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

