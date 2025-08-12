package com.ankit.java.oops_concept.encapsulation;

import java.util.Scanner;

public class ElcEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id : ");
        int employeeId = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name of Employee : ");
        String employeeName = sc.nextLine();
        System.out.print("Enter Employee Designation : ");
        String employeeDesignation = sc.nextLine();
        System.out.print("Enter employee salary : ");
        double salary = Double.parseDouble(sc.nextLine());
        System.out.print("Enter no of Project Employee Have done : ");
        int noOfProject = Integer.parseInt(sc.nextLine());

        Employee e1 = new Employee(employeeId,employeeName,employeeDesignation,salary,noOfProject);
        e1.determineEmployeeType();
        e1.setGrossSalary();
        System.out.println(e1);
        e1.getGrossSalary();
    }
}
