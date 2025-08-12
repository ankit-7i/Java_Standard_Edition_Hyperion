package com.ankit.java.oops_concept.limitation_Initialize_properties_through_reference.blc;
// initialize the non static field of an object through method parameter

public class Employee {
    int employeeId;
    String employeeName;
    String employeeDesg;
    double employeeSalary;

    public void setEmployeeData(int id,String name, String desg, double salary){
        employeeId = id;
        employeeName= name;
        employeeDesg =desg;
        employeeSalary=salary;
    }
    public void getEmployeeData(){
        System.out.println("Employee Id          :- "+employeeId);
        System.out.println("Employee Name        :- "+employeeName);
        System.out.println("Employee Designation :- "+employeeDesg);
        System.out.println("Employee Salary      :- "+employeeSalary);
    }

}
