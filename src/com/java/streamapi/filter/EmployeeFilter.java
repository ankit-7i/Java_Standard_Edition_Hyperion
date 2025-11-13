package com.java.streamapi.filter;


import java.util.ArrayList;
import java.util.List;

record Employee2(Integer id,String name ,Double salary) {}


public class EmployeeFilter {
     List<Employee2> emplist = new ArrayList<>();
    {
        emplist.add(new Employee2(101, "Ankit", 23000D));
        emplist.add(new Employee2(102, "Ashok", 56000D));
        emplist.add(new Employee2(103, "Amit", 54000D));
        emplist.add(new Employee2(104, "Amitesh", 49000D));
        emplist.add(new Employee2(105, "Akhil", 50000D));
        emplist.add(new Employee2(106, "ABC", 27000D));
    }

    public void filterEmployees() {
        emplist.stream()
                .filter(emp -> emp.salary() > 50000)
                .map(emp -> emp.name().toUpperCase())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        EmployeeFilter ef = new EmployeeFilter();
        ef.filterEmployees();
    }


}
