package com.ankit.java.oops_concept.constructor;

import java.util.Scanner;

public class ElcEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("\nEnter details for Employee " + i);
            System.out.print("Enter Employee Number: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();

            Employee emp = new Employee(number, name, salary);
            emp.calculateSalary();
            emp.getSalaryDetails();
            System.out.println(emp);
        }

        scanner.close();
    }
}

