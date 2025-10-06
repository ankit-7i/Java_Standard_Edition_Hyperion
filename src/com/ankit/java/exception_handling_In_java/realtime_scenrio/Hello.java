package com.ankit.java.exception_handling_In_java.realtime_scenrio;

public class Hello {

    /**
     * Assignment : 1
     * ===============
     * Handling ArrayStoreException in Java
     *
     * Objective:
     * Write a Java program that demonstrates how to handle ArrayStoreException.
     * The program should include a method that attempts to store objects of incompatible types into an array of String[].
     * Implement exception handling in the main method to catch and handle this exception.
     *
     * Instructions:
     * -------------
     *
     * -> Create a class named ArrayStoreExample:
     *
     * -> Implement a static method storeObjects that:
     *
     *    Method name : storeObjects
     *    Access modifiers : public
     *    Non-Access modifier : static
     *    Return type : void
     *
     *    Initializes an Object array of type String[] with a size of 5.
     *    Attempts to store objects of different types (String, Integer, etc.) into the array using array indexing.
     *    Throws an ArrayStoreException if an attempt is made to store an object that is not compatible with String.
     *
     * -> Implement the main method:
     *
     *    Inside the main method, call the storeObjects method with different objects, including objects of incompatible types.
     *    Use a try-catch block to catch and handle any ArrayStoreException thrown by storeObjects method.
     *    Print an appropriate error message when an incompatible object type is attempted to be stored in the array.
     *
     *
     * TEST CASE 1 :
     * -------------
     * Store objects of different types in the array
     *       strings[0] = "Hello";   // Storing a String
     *       strings[1] = "World";   // Storing another String
     *       strings[2] = "Java";    // Storing another String
     * Output as :
     * Objects stored successfully.
     *
     * TEST CASE 2 :
     * -------------
     *
     * Store objects of different types in the array
     *       strings[0] = "Hello";   // Storing a String
     *       strings[1] = "World";   // Storing another String
     *       strings[2] = 123;       // Trying to store an Integer in a String array
     *
     * Output as :
     * ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in an array of java.lang.String
     *
     * ########################################################################################
     *
     * Assignment : 02
     * ================
     * Handling Multiple Exceptions in Method Overriding
     *
     * Objective:
     * Write a Java program that demonstrates method overriding where the superclass method throws a checked exception (ClassNotFoundException),
     * and the subclass overrides this method to handle various cases and throw appropriate exceptions (IllegalArgumentException).
     *
     * Instructions:
     * -------------
     * -> Create a superclass BLC named ParentClass:
     *
     * -> Implement a method loadingClass :
     *    Method name : loadingClass
     *    Access modifier : public
     *    Return type : void
     *    Parameter : String
     *
     *    Load the class by using Class.forName(-) method.
     *    Throws a checked exception, ClassNotFoundException, if the class is not found.
     *
     * -> Create a subclass BLC named ChildClass:
     *
     * -> Override the loadingClass method:
     *    Method name : loadingClass
     *    Access modifier : public
     *    Return type : void
     *    Parameter : String
     *
     * -> In this overridden method parameter (String), pass the class name through command
     *    Line Argument(FQN), throw an IllegalArgumentException, If the class name is empty or
     *    null otherwise call the super class loadingClass method to load the given class from
     *    command Line Argument.
     *
     * -> Create a ELC class Tester and implement the main method:
     *
     *    Inside the main method, create an instance of ChildClass and call the overridden loadingClass method.
     *
     *    Take the input from command line. Make sure if user is passing multiple class names
     *    through command line argument then we can load multiple classes.
     *
     *    Use a try-catch block to catch and handle the exceptions.
     *
     * Test Case 1 :
     * --------------
     * java.lang.String
     * Class java.lang.String loaded successfully.
     *
     *
     * Test Case 2 :
     * --------------
     * java.lang.String
     * java.lang.Integer
     * Class java.lang.String loaded successfully.
     * Class java.lang.Integer loaded successfully.
     *
     *
     * Test Case 3 :
     * --------------
     * null
     * Error: Class not found - null
     *
     * ########################################################################################
     * Assignment : 03
     * =================
     * Command Line Division with Exception Handling
     *
     * Objective:
     * Write a Java program that processes command line arguments, handles exceptions for invalid inputs and division by zero,
     * and demonstrates the use of nested try-catch blocks with a finally block for cleanup.
     *
     * Instructions:
     * -------------
     *
     * -> Create a ELC class named CommandLineDivision.
     *
     * -> Implement the main method that:
     *    Checks if exactly two command line arguments are provided.
     *    Parses these arguments into integers (dividend and divisor).
     *    Uses nested try-catch blocks:
     *    Outer block catches IllegalArgumentException for insufficient arguments or invalid input types (NumberFormatException).
     *    Inner block attempts the division and catches ArithmeticException for division by zero.
     *    Prints the result of the division if successful.
     *    Includes a finally block to print "Division operation completed."
     *
     * -> Test the program with different scenarios:
     *    a) Provide valid integers for division.
     *    b) Test division by zero scenario.
     *    c) Test with invalid input types (non-integer values).
     *
     *
     * TEST CASE 1 :
     * -------------
     * CommandLine Inputs : java CommandLineDivisionQuestion 10 2
     * Expected Output:
     * Division result: 5.0
     * Division operation completed.
     *
     *
     * TEST CASE 2 :
     * -------------
     * CommandLine Inputs : java CommandLineDivisionQuestion 8 0
     * Expected Output:
     * Arithmetic error: / by zero
     * Division operation completed.
     *
     *
     * TEST CASE 3 :
     * -------------
     * CommandLine Inputs : java CommandLineDivisionQuestion 12 abc
     * Expected Output:
     * NumberFormatException: For input string: "abc"
     * Division operation completed.
     *
     * ########################################################################################
     *
     * Assignment : 04
     * ================
     * Financial Transaction Validation
     *
     * Objective:
     * Write a Java program that validates and processes financial transaction data entered by a user.
     * Use a multi-catch block to handle exceptions related to input validation and processing.
     *
     * Instructions:
     * -------------
     * -> Create a BLC class named FinancialTransaction.
     *
     * -> Implement a processTransaction method that:
     *    Method name : processTransaction
     *    Access Modifiers : public
     *    Return type : void
     *    Parameters : double, long
     *
     *    Accepts user input for transaction details such as transaction amount and account number.
     *    Validate the transaction amount and account number.
     *    Throw an IllegalArgumentException if the transaction amount is negative or zero. otherwise print appropriate messages for successful transaction
     *
     * -> Uses a multi-catch block to handle exceptions:
     *    NumberFormatException for invalid numeric inputs.
     *    IllegalArgumentException for invalid transaction amount (negative or zero).
     *    RuntimeException for other unexpected errors during processing.
     *
     * -> Implement the main method in an ELC class.
     *
     *    Create an instance of FinancialTransaction.
     *    Prompt the user to input transaction details.
     *    Call the processTransaction method with user inputs and test different scenarios.
     *
     *
     *
     * TEST CASE 1 :
     * --------------
     * Transaction amount: 500
     * Account number: 1234567890
     * Expected Output:
     * Processing transaction...
     * Transaction successful: Amount Rs.500.0 transferred to account 1234567890
     *
     *
     * TEST CASE 2 :
     * --------------
     * Transaction amount: -100
     * Account number: 9876543210
     * Expected Output:
     * Error processing transaction: Transaction amount must be positive.
     *
     *
     * TEST CASE 3 :
     * --------------
     * Transaction amount: abc
     * Account number: 4567890123
     * Expected Output:
     * Invalid input: Please enter a valid number for transaction amount.
     */
}
