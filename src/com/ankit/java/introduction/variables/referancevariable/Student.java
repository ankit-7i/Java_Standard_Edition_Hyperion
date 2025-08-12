package com.ankit.java.introduction.variables.referancevariable;

import java.util.Scanner;

public class Student {
    Student s1 = new Student(); // Non static referance variable
    static Scanner sc = new Scanner(System.in); // static reerance variable
    public void accept (Student s2)// s2 is a parameter referance variable
    {
        System.out.println("Refernace Variable");
        Student s3 = new Student(); //s3 is a local referance variable
    }
}
