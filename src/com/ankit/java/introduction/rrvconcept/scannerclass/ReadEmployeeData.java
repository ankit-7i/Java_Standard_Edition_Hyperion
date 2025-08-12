package com.ankit.java.introduction.rrvconcept.scannerclass;

import java.util.Scanner;

public class ReadEmployeeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Emp Id");
        int id = Integer.parseInt(args[0]);// Buffer problem

        System.out.println("Enter Employee Name");
        String name = sc.nextLine();

        System.out.println("Employee id is "+id);
        System.out.println("Employee name is "+name);
        sc.close();
    }
}
