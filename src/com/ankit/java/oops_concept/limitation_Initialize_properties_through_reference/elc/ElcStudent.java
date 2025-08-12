package com.ankit.java.oops_concept.limitation_Initialize_properties_through_reference.elc;

import com.ankit.java.oops_concept.limitation_Initialize_properties_through_reference.blc.Student;

import java.util.Scanner;

public class ElcStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Stuent id :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Student marks between 1 to 100");
        int marks = Integer.parseInt(sc.nextLine());
        Student s1 = new Student();
        s1.setStudentData(id,name,marks);
        s1.gradeCalculation();
        s1.getStudentData();
        sc.close();
    }
}
