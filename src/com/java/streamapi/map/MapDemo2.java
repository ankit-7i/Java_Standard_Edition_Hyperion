package com.java.streamapi.map;

import java.util.ArrayList;
import java.util.List;

record Employee(Integer id, String name, Double salary) {}

public class MapDemo2 {
    public static void main(String[] args) {

        ArrayList<Employee> listOfEmp = new ArrayList<>();
        listOfEmp.add(new Employee(1, "Scott", 8000.0));
        listOfEmp.add(new Employee(2, "Smith", 12000.0));
        listOfEmp.add(new Employee(3, "Allen", 15000.0));
        listOfEmp.add(new Employee(4, "Martin", 18000.0));
        listOfEmp.add(new Employee(5, "John", 20000.0));

        System.out.println("Original Employee Data:");
        listOfEmp.forEach(System.out::println);

        System.out.println("\nAfter adding $500 salary:");
        listOfEmp.stream()
                .map(emp -> emp.salary() + 500)
                .forEach(System.out::println);
    }
}
