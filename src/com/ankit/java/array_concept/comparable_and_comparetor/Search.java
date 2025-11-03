package com.ankit.java.array_concept.comparable_and_comparetor;

import java.util.Arrays;
import java.util.Scanner;

record Employee1(Integer id, String name) {}

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = Integer.parseInt(sc.nextLine());

        Employee[] employees = new Employee[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Employee Id: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            employees[i] = new Employee(id, name);
        }

        System.out.println("\nOriginal Data: " + Arrays.toString(employees));

        System.out.print("\nEnter the ID to search: ");
        int searchId = Integer.parseInt(sc.nextLine());

        boolean isFound = false;

        for (Employee emp : employees) {
            if (emp.id().equals(searchId)) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("✅ ID is available!");
        } else {
            System.err.println("❌ ID is not available!");
        }

        sc.close();
    }
}
