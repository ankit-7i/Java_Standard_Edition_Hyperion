package com.java.streamapi.filter;


import java.util.ArrayList;
import java.util.List;

record Emp (Integer id,String name,double salary){

}
public class FilteringEmployeelistAcctoSalary {
    public static void main(String[] args) {
        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp(10001,"AAA",67000.00));
        empList.add(new Emp(10002,"BBB",29000.00));
        empList.add(new Emp(10003,"CCC",34000.00));
        empList.add(new Emp(10004,"DDD",23000.00));
        empList.add(new Emp(10005,"EEE",88000.00));

        empList.stream().filter(emp -> emp.salary()>30000).forEach(System.out::println);

    }
}
