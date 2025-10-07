package com.ankit.java.exception_handling_In_java.custom_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// Custom checked exception class
class InvalidAgeException extends Exception // Checked Exception
{
    // For backward compatibility
    private static final long serialVersionUID = 1L;

    public InvalidAgeException()
    {
    }

    public InvalidAgeException(String errorMessage)
    {
        super(errorMessage);
    }
}

public class CustomCheckedException
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try(sc)
        {
            System.out.println("Enter your Age :");
            int age = Integer.parseInt(sc.nextLine());
            validateAge(age);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e);
        }
        catch(InputMismatchException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.err.println("General Exception");
        }
    }

    // Method that throws custom checked exception
    public static void validateAge(int age) throws InvalidAgeException
    {
        if(age < 18)
        {
            throw new InvalidAgeException("Age is Invalid");
        }
        else
        {
            System.out.println("Your Age is :"+age+" so, You can vote");
        }
    }
}
