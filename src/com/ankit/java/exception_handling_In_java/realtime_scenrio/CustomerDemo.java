package com.ankit.java.exception_handling_In_java.realtime_scenrio;


import java.util.Scanner;

public class CustomerDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Welcome to my application!!!!!");
            System.out.print("Please enter the value for a :");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("Please enter the value for b :");
            int b = Integer.parseInt(sc.nextLine());

            int result = a / b;
            System.out.println("Result is :" + result);
        }
        catch(Exception e)
        {
            System.err.println("Don't put zero here");
        }
        System.out.println("Thank you for Visiting");
        sc.close();
    }
}

