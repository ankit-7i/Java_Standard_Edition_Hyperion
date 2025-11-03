package com.ankit.java.array_concept.comparable_and_comparetor;

import java.util.Arrays;
import java.util.Scanner;

record Employee(Integer id, String name) implements Comparable<Employee> {
    @Override
    public int compareTo(Employee e2) {
        return this.name.compareTo(e2.name);
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.print("Enter the size: ");
            int size = Integer.parseInt(sc.nextLine());

            Employee[] employees = new Employee[size];

            for (int i = 0; i < size; i++) {
                System.out.println("Enter Employee Id: ");
                int id = Integer.parseInt(sc.nextLine());

                System.out.println("Enter Employee Name: ");
                String name = sc.nextLine();

                employees[i] = new Employee(id, name);
            }

            System.out.println("Original Data: " + Arrays.toString(employees));

            Arrays.sort(employees); // uses compareTo()

            System.out.println("After Sorting: " + Arrays.toString(employees));

        } catch (NegativeArraySizeException e) {
            System.err.println("Array size must be a positive integer!");
        }
    }
}
