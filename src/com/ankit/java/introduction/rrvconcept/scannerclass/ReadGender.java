package com.ankit.java.introduction.rrvconcept.scannerclass;

import java.util.Scanner;

public class ReadGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Gender [Male/Female] ");
        char gender =  sc.next().charAt(0);
        System.out.println("Your Gender is : "+gender);

    }
}

