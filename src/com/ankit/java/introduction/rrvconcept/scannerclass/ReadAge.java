package com.ankit.java.introduction.rrvconcept.scannerclass;

import java.util.Scanner;

public class ReadAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age");
        int age  =  sc.nextInt();
        System.out.println("Your age is :"+age);
        sc.close();
    }
}
