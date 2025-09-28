package com.ankit.java.exception_handling_In_java.exception_propagation;

public class ExceptionPropagationWithUnchecked
{
    public static void main(String[] args)
    {
        System.out.println("Main method started!!!");
        m1();
        System.out.println("Main method ended!!!");
    }

    public static void m1()
    {
        System.out.println("m1 method started!!!");
        try
        {
            m2();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Handled By m1 method");
        }
        System.out.println("m1 method ended!!!");
    }

    public static void m2()
    {
        System.out.println("m2 method started!!!");
        System.out.println(10/0);  // <-- ArithmeticException occurs here
        System.out.println("m2 method ended!!!");
    }
}

