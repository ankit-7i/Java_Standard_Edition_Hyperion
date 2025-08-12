package com.ankit.java.oops_concept.constructor.copyconstrutor;


public class PassingObjectReferance {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Scott");

        Manager m = new Manager(e1);
        System.out.println(m);
    }
}

