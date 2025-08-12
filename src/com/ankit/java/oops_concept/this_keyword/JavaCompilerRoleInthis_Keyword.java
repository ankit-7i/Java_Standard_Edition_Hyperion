package com.ankit.java.oops_concept.this_keyword;
class Employee {
    private int salary;
    public Employee()// Final Employee this added by java Compiler
    {

    }
    public void setSalary(int salary){
        this.salary=salary;
    }
}
public class JavaCompilerRoleInthis_Keyword {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setSalary(30000);
    }
}
