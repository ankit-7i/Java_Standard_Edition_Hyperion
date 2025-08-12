package com.ankit.java.oops_concept.constructor;


public class Employee {
    private int employeeNumber;
    private String employeeName;
    private double employeeSalary;
    private double totalSalary;
    private double incrementAmount;

    public Employee(int employeeNumber, String employeeName, double employeeSalary) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public void calculateSalary() {
        if (employeeSalary < 50000) {
            incrementAmount = employeeSalary * 0.10;
        } else if (employeeSalary >= 50000 && employeeSalary < 80000) {
            incrementAmount = employeeSalary * 0.07;
        } else {
            incrementAmount = employeeSalary * 0.05;
        }
    }

    public void getSalaryDetails() {
        System.out.println("Increment Amount: " + incrementAmount);
        totalSalary = employeeSalary + incrementAmount;
        System.out.println("Updated Salary: " + totalSalary);
    }

    @Override
    public String toString() {
        return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
                + employeeSalary + ", incrementAmount=" + incrementAmount + "]";
    }
}

