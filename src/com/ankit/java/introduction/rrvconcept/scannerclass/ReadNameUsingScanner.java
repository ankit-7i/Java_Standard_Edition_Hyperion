package com.ankit.java.introduction.rrvconcept.scannerclass;

import java.util.Scanner;

public class ReadNameUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Your Name is "+name);
    }
}
