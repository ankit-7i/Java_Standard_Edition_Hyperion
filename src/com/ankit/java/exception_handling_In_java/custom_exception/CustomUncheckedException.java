package com.ankit.java.exception_handling_In_java.custom_exception;

import java.util.Scanner;

// Custom unchecked exception class
class GreaterMarksException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public GreaterMarksException() {
        super();
    }

    public GreaterMarksException(String errorMessage) {
        super(errorMessage);
    }
}

public class CustomUncheckedException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your marks: ");
            int marks = Integer.parseInt(sc.nextLine());
            validateMarks(marks);
        }
        catch (GreaterMarksException e) {
            e.printStackTrace();
        }

        System.out.println("Thank you for visiting my application");
        sc.close();
    }

    public static void validateMarks(int marks) {
        if (marks > 100) {
            throw new GreaterMarksException("Invalid Marks");
        } else {
            System.out.println("Your Marks are: " + marks);
        }
    }
}

