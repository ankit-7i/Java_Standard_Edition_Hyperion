package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.hierarchial_inheritance.vehicle_system;



public class Vehicle {
    String brand;
    String model;
    int year;
    String type;

    public Vehicle(String brand, String model, int year, String type) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.type = type;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Type: " + type);
    }
}
