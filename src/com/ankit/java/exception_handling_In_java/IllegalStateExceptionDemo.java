package com.ankit.java.exception_handling_In_java;

public class IllegalStateExceptionDemo
{
    static void throwIllegalException()
    {
        try
        {
            throw new IllegalStateException("MyException");

        }
        catch (IllegalStateException objA)
        {
            System.out.println("Caught: " + objA);
        }
    }




    public static void main(String[] args)
    {

        System.out.println("Calling throwIllegalException from main method: ");
        throwIllegalException() ;

    }

}
