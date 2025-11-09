package com.ankit.java.IOconcept.serialization_and_deserialization;


import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;  // backward compatibility

    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    // Factory method to take input from user and create Employee object
    public static Employee getEmployeeObject() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        Integer id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        Double salary = Double.parseDouble(sc.nextLine());

        return new Employee(id, name, salary);
    }
}
