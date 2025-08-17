package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.hierarchial_inheritance;

import java.util.Scanner;

// Base Class
class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

// Child Class 1
class Sedan extends Car {
    int seatingCapacity;

    Sedan(String brand, String model, int year, int seatingCapacity) {
        super(brand, model, year);
        this.seatingCapacity = seatingCapacity;
    }

    void sedanFeatures() {
        System.out.println(model + " is a Sedan with seating capacity: " + seatingCapacity);
    }
}

// Child Class 2
class SUV extends Car {
    boolean hasAllWheelDrive;

    SUV(String brand, String model, int year, boolean hasAllWheelDrive) {
        super(brand, model, year);
        this.hasAllWheelDrive = hasAllWheelDrive;
    }

    void suvFeatures() {
        System.out.println(model + " is an SUV. All Wheel Drive: " + hasAllWheelDrive);
    }
}

// Child Class 3
class SportsCar extends Car {
    int topSpeed;

    SportsCar(String brand, String model, int year, int topSpeed) {
        super(brand, model, year);
        this.topSpeed = topSpeed;
    }

    void sportsFeatures() {
        System.out.println(model + " is a Sports Car with top speed: " + topSpeed + " km/h");
    }
}

// Main class with Switch Case
public class CarHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a type of Car:");
        System.out.println("1. Sedan");
        System.out.println("2. SUV");
        System.out.println("3. Sports Car");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter Brand: ");
                String sedanBrand = sc.nextLine();
                System.out.print("Enter Model: ");
                String sedanModel = sc.nextLine();
                System.out.print("Enter Year: ");
                int sedanYear = sc.nextInt();
                System.out.print("Enter Seating Capacity: ");
                int capacity = sc.nextInt();

                Sedan sedan = new Sedan(sedanBrand, sedanModel, sedanYear, capacity);
                sedan.displayInfo();
                sedan.sedanFeatures();
                break;

            case 2:
                System.out.print("Enter Brand: ");
                String suvBrand = sc.nextLine();
                System.out.print("Enter Model: ");
                String suvModel = sc.nextLine();
                System.out.print("Enter Year: ");
                int suvYear = sc.nextInt();
                System.out.print("All Wheel Drive (true/false): ");
                boolean awd = sc.nextBoolean();

                SUV suv = new SUV(suvBrand, suvModel, suvYear, awd);
                suv.displayInfo();
                suv.suvFeatures();
                break;

            case 3:
                System.out.print("Enter Brand: ");
                String sportsBrand = sc.nextLine();
                System.out.print("Enter Model: ");
                String sportsModel = sc.nextLine();
                System.out.print("Enter Year: ");
                int sportsYear = sc.nextInt();
                System.out.print("Enter Top Speed (km/h): ");
                int topSpeed = sc.nextInt();

                SportsCar sportsCar = new SportsCar(sportsBrand, sportsModel, sportsYear, topSpeed);
                sportsCar.displayInfo();
                sportsCar.sportsFeatures();
                break;

            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }

        sc.close();
    }
}

