package com.java.streamapi.map;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

record  Employee2(Integer eid,String ename,double salary){

}
public class SalaryWiseSorting {
    public static void main(String[] args) {
        List<Employee2> EmployeeList = new ArrayList<>();
        EmployeeList.add(new Employee2(101,"Ankit",56000.00));
        EmployeeList.add(new Employee2(102,"Ashok",43000.00));
        EmployeeList.add(new Employee2(103,"Arpit",36000.00));
        EmployeeList.add(new Employee2(104,"Alok",21000.00));

        EmployeeList.stream().sorted(Comparator.comparing(Employee2::salary)).forEach(System.out::println);



    }
}
