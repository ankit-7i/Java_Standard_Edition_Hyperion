package com.ankit.java.exception_handling_In_java;

/**
 * Throwable class Method to print Exception:
 * ------------------------------------------
 * Throwable class has provided the following methods:
 *
 * 1) public String toString() :
 *    - Predefined non-static method of Throwable class.
 *    - By using this we can print exception object in String format i.e. Fully Qualified Name : error message.
 *
 * 2) public String getMessage() :
 *    - Predefined non-static method of Throwable class.
 *    - It is only used to print the error message.
 *
 * 3) public void printStackTrace() :
 *    - Predefined non-static method of Throwable class.
 *    - It is mainly used to print the complete exception details like:
 *      class location, method name, line number, fully qualified name, and error message
 *      of the particular exception.
 */


public class PrintStackTrace {
    public static void main(String[] args) {
        System.out.println("Main Method started");

        try {
            throw new NullPointerException("ref is null");
        } catch (Exception e) {
            System.out.println("Ref variable is pointing to null");
            System.out.println(".................");
            System.out.println(e.getMessage());
            System.out.println(".................");
            System.out.println(e.toString());
            System.out.println(".................");
            e.printStackTrace();
        }

        System.out.println("Main Method ended");
    }
}

