package com.ankit.java.exception_handling_In_java;

import java.util.Scanner;

public class ArrayIndexExceptionDemo
{
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            a[0] = 10;
            a[1] = 20;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Index number :");

            int index = sc.nextInt();
            System.out.println(a[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }



    }

}

