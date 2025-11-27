package com.java.streamapi.mcq;
import java.util.*;
public class Test19 {


        static class Employee
        {
            private Integer id;
            private String name;
            public Integer getId() {
                return id;
            }
            public String getName() {
                return name;
            }
            public Employee(Integer id, String name) {
                super();
                this.id = id;
                this.name = name;
            }
            @Override
            public String toString() {
                return "Employee [id=" + id + ", name=" + name + "]";
            }
        }
        public static void main(String[] args) {
            List<Employee> list = List.of(new Employee(1, "John") ,
                    new Employee(5, "Ram") ,
                    new Employee(7, "Tear") ,
                    new Employee(4, "Jerry") ,
                    new Employee(22, "You"));
            list.stream().limit(3).sorted((o1,o2)->o1.getId() - o2.getId()).forEach(System.out::println);
        }
    }




