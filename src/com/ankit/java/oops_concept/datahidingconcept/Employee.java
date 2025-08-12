package com.ankit.java.oops_concept.datahidingconcept;

class Employee {
    private String firstName;
    private String lastName;
    private int employeeId;
    private double salary;
    private int noOfProject;
    private double grossSalary;

    public void setEmployeeData(String fname, String lname, int eid, double sal, int proj) {
        firstName = fname;
        lastName = lname;
        employeeId = eid;
        salary = sal;
        noOfProject = proj;
        if (noOfProject <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }

    }

    public void displaydata() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("No. of Projects: " + noOfProject);
        System.out.println("Updated Salary: " + grossSalary);
    }

    public void extraSalaryCalculation() {
        if (noOfProject >= 5 && noOfProject <= 10) {
            grossSalary = (salary + 5000);
        } else if (noOfProject >= 10 && noOfProject <= 20) {
            grossSalary = salary + 10000;
        } else if (noOfProject >= 20) {
            grossSalary = salary + 15000;
        } else {
            grossSalary = salary;
        }
    }

}