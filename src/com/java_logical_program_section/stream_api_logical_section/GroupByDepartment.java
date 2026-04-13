package com.java_logical_program_section.stream_api_logical_section;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String dept;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Ankit", "IT"),
                new Employee("Amit", "IT"),
                new Employee("Bob", "NonIT")
        );

        Map<String, List<Employee>> grouped =
                employeeList.stream()
                        .collect(Collectors.groupingBy(emp -> emp.dept));

        grouped.forEach((dept, employees) -> {
            System.out.println(dept + " : " + employees);
        });
    }
}