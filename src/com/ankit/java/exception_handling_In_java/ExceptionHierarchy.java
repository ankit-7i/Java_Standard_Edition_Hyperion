package com.ankit.java.exception_handling_In_java;

public class ExceptionHierarchy {
    public static void main(String[] args) {
        Exception e1 = new ArithmeticException();
        System.out.println(e1.toString());
        Exception e2 = new ArithmeticException("Divided By Zero");
        System.out.println(e2.toString());

    }
}
