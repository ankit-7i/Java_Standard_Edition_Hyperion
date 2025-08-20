package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.hierarchial_inheritance.vehicle_system;

import java.util.Scanner;

public class ElcVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Model Name: ");
        String model = sc.nextLine();

        int year = 0;
        while (year < 1886 || year > 2100) {
            System.out.print("Enter Year (1886 - 2100): ");
            if (sc.hasNextInt()) {
                year = sc.nextInt();
            } else {
                sc.next();
            }
        }
        sc.nextLine();

        System.out.print("Enter Type: ");
        String type = sc.nextLine();

        System.out.println("\nChoose Vehicle: 1) Car  2) Bike");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                int numberOfDoors = 0;
                while (numberOfDoors < 2 || numberOfDoors > 6) {
                    System.out.print("Enter No. of Doors (2-6): ");
                    if (sc.hasNextInt()) {
                        numberOfDoors = sc.nextInt();
                    } else {
                        sc.next();
                    }
                }
                Car c1 = new Car(brand, model, year, type, numberOfDoors);
                System.out.println("\nCar Details:");
                c1.displayDetails();
            }
            case 2 -> {
                Bike b1 = new Bike(brand, model, year, type);
                System.out.println("\nBike Details:");
                b1.displayDetails();
            }
        }

        sc.close();
    }
}

