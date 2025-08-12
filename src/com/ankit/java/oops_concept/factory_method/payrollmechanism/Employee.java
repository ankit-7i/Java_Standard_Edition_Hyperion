package com.ankit.java.oops_concept.factory_method.payrollmechanism;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;
    private double hraper;
    private double daper;

    public Employee(int employeeId ,String employeeName,double employeeSalary,double hraper,double daper) {
        super();
        this.employeeId = employeeId;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
        this.hraper= hraper;
        this.daper=daper;
    }

    public static Employee getemployeeObject() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id :");
        int employeeid = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Employee Name :");
        String employeeName = sc.nextLine();

        System.out.print("Enter employee Salary :");
        double employeeSalary = Double.parseDouble(sc.nextLine());

        System.out.print("Enter employee HRA Amount :");
        double hraper = Double.parseDouble(sc.nextLine());

        System.out.print("Enter employee DA Amount :");
        double daper = Double.parseDouble(sc.nextLine());

        return new Employee(employeeid, employeeName, employeeSalary,hraper,daper);
    }
    public double calculateGrossSalary(){
        return employeeSalary+hraper+daper;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", hraper=" + hraper +
                ", daper=" + daper +
                '}';
    }
}
