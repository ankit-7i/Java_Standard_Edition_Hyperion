package com.ankit.java.exception_handling_In_java.realtime_scenrio;

import java.util.Scanner;

public class DivisionExample {
    public static int  performDivison(int a , int b) {
        return a/b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();

        try {


            performDivison(a, b);
            System.out.println("Result of divison "+performDivison(a, b));

        }
        catch ( ArithmeticException e ) {

            System.out.println("ArithmeticException caught: Division by zero: dividend="+ a +", divisor="+ b);
        }

    }

}

