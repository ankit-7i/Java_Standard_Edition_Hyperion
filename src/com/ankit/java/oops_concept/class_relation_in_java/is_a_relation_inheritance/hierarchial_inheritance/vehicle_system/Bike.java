package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.hierarchial_inheritance.vehicle_system;



public class Bike extends Vehicle {
    public Bike(String brand, String model, int year, String type) {
        super(brand, model, year, type);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}

