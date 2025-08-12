package com.ankit.java.oops_concept.constructor.copyconstrutor;

//Program

public class Employee {
    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }
}

