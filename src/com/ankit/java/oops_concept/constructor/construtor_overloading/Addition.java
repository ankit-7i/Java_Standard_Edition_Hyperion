package com.ankit.java.oops_concept.constructor.construtor_overloading;

public class Addition {
    public Addition(int x, int y) {
        this("Data", "base");
        System.out.println("Sum of two Integers is: " + (x + y));
    }

    public Addition(double x, double y) {
        System.out.println("Sum of two Doubles is: " + (x + y));
    }

    public Addition(String x, String y) {
        System.out.println("Sum of two Strings is: " + (x + y));
    }
}
