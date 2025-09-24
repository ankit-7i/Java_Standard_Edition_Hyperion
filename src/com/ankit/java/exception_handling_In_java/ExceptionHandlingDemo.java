package com.ankit.java.exception_handling_In_java;

import java.util.Scanner;

public class ExceptionHandlingDemo
{

    public static void handleException (String s)
    {
        try
        {
            if(s.equals("null")) s= null;
            System.out.println("Length of the input string:"+s.length());
            int a = Integer.parseInt(s);
            System.out.println("Converted to integer:"+a);
        }

        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException: Input is not a valid integer.");
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException: Input is null.");
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input ");
        String msg = sc.next();
        handleException(msg);
    }

}
