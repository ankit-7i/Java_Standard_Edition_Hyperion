package com.ankit.java.exception_handling_In_java.exception_propagation;

/**
 * This program demonstrates Exception Propagation with Checked Exceptions.
 *
 * Checked exceptions (like ClassNotFoundException) must be either handled
 * using try-catch blocks or declared using the 'throws' keyword.
 *
 * In this program:
 * - m2() tries to load a database driver class that may not exist.
 * - If the class is not found, ClassNotFoundException is thrown.
 * - The exception propagates from m2() → m1() → main().
 * - Finally, it is handled in the main() method.
 *
 * Key Point:
 * - It is strongly recommended that while working with checked exceptions,
 *   methods use the 'throws' keyword to delegate exception handling to
 *   the caller method.
 * - At some level, the caller must handle the exception using try-catch,
 *   otherwise the program will terminate abnormally.
 */

public class ExceptionPropagationWithChecked
{
    public static void main(String[] args)
    {
        System.out.println("Main method started!!!");
        try
        {
            m1();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Handled by main method");
        }
        System.out.println("Main method ended!!!");
    }

    public static void m1() throws ClassNotFoundException
    {
        System.out.println("m1 method started!!!");
        m2();
        System.out.println("m1 method ended!!!");
    }

    public static void m2() throws ClassNotFoundException
    {
        System.out.println("m2 method started!!!");

        // Attempting to load Oracle JDBC Driver
        Class.forName("oracle.jdbc.driver.OracleDriver1");

        System.out.println("m2 method ended!!!");
    }
}
