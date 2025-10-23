package com.ankit.java.string_concept.regular_expression;

import java.util.Scanner;

public class Validation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile Nubmer :");
        String mobile = sc.next();
        boolean isvalid = mobile.matches("[6-9]+[0-9]{9}");
        System.out.println("Enter Email id : ");
        String email = sc.nextLine();
        boolean isMailValid = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");


        if(isvalid == true || isMailValid == true){
            System.out.println("Mobile Number is valid");
            System.out.println("Email is valid");
        }
        else {

            System.out.println("Email is not valid");
            System.out.println("Mobile number is not valid");

        }
        sc.close();
    }
}
