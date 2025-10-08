package com.ankit.java.exception_handling_In_java.custom_exception;

import java.util.Scanner;

// CarUser Class
public class CarUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose a scenario to test:");
            System.out.println("1. Car Stopped");
            System.out.println("2. Car Puncture");
            System.out.println("3. Car Heat");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter action (stop/go): ");
                    String stopAction = scanner.nextLine();
                    try {
                        CarTest.stop(stopAction);
                    } catch (CarStoppedException e) {
                        System.out.println("Caught: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter action (puncture/move): ");
                    String punctureAction = scanner.nextLine();
                    try {
                        CarTest.puncture(punctureAction);
                    } catch (CarPunctureException e) {
                        System.out.println("Caught: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter temperature: ");
                    int temperature = scanner.nextInt();
                    try {
                        CarTest.carHeat(temperature);
                    } catch (CarHeatException e) {
                        System.out.println("Caught: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

