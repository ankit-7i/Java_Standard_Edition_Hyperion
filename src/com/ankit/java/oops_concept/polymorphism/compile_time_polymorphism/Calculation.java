package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism;

public class Calculation
{

    public void add(int num1 ,int num2)
    {
        System.out.println("Sum of two integer is : "+(num1+num2));

    }
    public void add(double num1,double num2)
    {
        System.out.println("Sum of two double is  : "+(num1+num2));
    }
    public void multiply (int num1,int num2)
    {
        System.out.println("Multiplication of two integer is: "+(num1* num2));
    }
    public void multiply (double num1,double num2)
    {
        System.out.println("ultiplication of two double is : "+(num1* num2));
    }


}
