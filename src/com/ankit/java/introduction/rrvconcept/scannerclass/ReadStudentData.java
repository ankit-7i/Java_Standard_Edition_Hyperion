package com.ankit.java.introduction.rrvconcept.scannerclass;

import java.util.Scanner;

public class ReadStudentData {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Student ID");
        int id = sc.nextInt();
        System.out.println("Enter Student Name");
        String name = sc.nextLine();//Buffer Problem

        System.out.println("Student"+id);
        System.out.println("Student Name is :"+name);
        sc.close();
    }
}
