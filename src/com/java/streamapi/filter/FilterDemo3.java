package com.java.streamapi.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Employee(Integer id, String name, Double salary) {}

public class FilterDemo3 {

    public static void main(String[] args) {

        ArrayList<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(new Employee(111, "Scott", 56000.0));
        listOfEmployees.add(new Employee(222, "Allen", 45000.0));
        listOfEmployees.add(new Employee(333, "Smith", 76000.0));
        listOfEmployees.add(new Employee(444, "Martin", 48000.0));
        listOfEmployees.add(new Employee(555, "Rosh", 53000.0));

        System.out.println("Name of employees whose salary > 50K:");

        List<Employee> filteredEmp =
                listOfEmployees.stream()
                        .filter(emp -> emp.salary() > 50000)
                        .collect(Collectors.toList());

        filteredEmp.forEach(emp -> System.out.println(emp.name()));
    }
}
