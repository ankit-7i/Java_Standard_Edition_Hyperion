package com.ankit.java.oops_concept.pass_by_value;

public class ElcEmployee {

        public static void main(String[] args) {
            Employee e1 = new Employee();
            System.out.println("Current Salary is: " + e1.getSalary());  // 65000

            updateSalary(e1);

            System.out.println("Salary after update: " + e1.getSalary());  // Still 65000
        }

        public static void updateSalary(Employee emp) {
            emp = new Employee();        // New object created
            emp.setSalary(90000);       // Affects only the new object, not the original e1
        }
    }


