package com.ankit.java.exception_handling_In_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter First Number : ");
            int num1 =sc.nextInt();
            System.out.println("Enter Second Number :");
            int num2  = sc.nextInt();
            int res = num1 + num2 ;

            System.out.println("You Entered  a ="+num1+"and b ="+num2);
        }
        catch (InputMismatchException e) {

            System.out.println("getMessage():=> " + e.getMessage());


            System.out.println("toString():=> " + e.toString());


            System.out.println("println():=> InputMismatchException occurred. Please enter only integer numbers.");


            System.out.println("printStackTrace():=> ");
            e.printStackTrace();
        }
    }

}

