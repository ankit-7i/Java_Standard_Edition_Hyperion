package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism.loan_service_management;
import java.util.Scanner;

public class LoanManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Loan Management System");
        System.out.println("Please select loan type:");
        System.out.println("1) Secured Loan");
        System.out.println("2) Unsecured Loan");
        System.out.print("Enter your choice [1/2]: ");
        int loanType = Integer.parseInt(sc.nextLine());

        switch(loanType) {
            case 1 -> processSecuredLoan(sc);
            case 2 -> processUnsecuredLoan(sc);
            default -> System.out.println("Invalid choice!");
        }
    }

    private static void processSecuredLoan(Scanner sc) {
        System.out.println("Please select secured loan type:");
        System.out.println("1) Home Loan");
        System.out.println("2) Car Loan");
        System.out.print("Enter your choice [1/2]: ");
        int securedLoanType = Integer.parseInt(sc.nextLine());

        switch(securedLoanType) {
            case 1 -> processHomeLoan(sc);
            case 2 -> processCarLoan(sc);
            default -> System.out.println("Invalid choice!");
        }
    }

    private static void processUnsecuredLoan(Scanner sc) {
        System.out.println("Please select unsecured loan type:");
        System.out.println("1) Personal Loan");
        System.out.println("2) Education Loan");
        System.out.print("Enter your choice [1/2]: ");
        int unsecuredLoanType = Integer.parseInt(sc.nextLine());

        switch(unsecuredLoanType) {
            case 1 -> processPersonalLoan(sc);
            case 2 -> processEducationLoan(sc);
            default -> System.out.println("Invalid choice!");
        }
    }

    private static void processHomeLoan(Scanner sc) {
        System.out.println("Welcome to Home Loan Service");
        System.out.println("Please provide the following details:");

        System.out.print("Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Account Number: ");
        String accNumber = sc.nextLine();

        System.out.print("CIBIL Score: ");
        int cibil = Integer.parseInt(sc.nextLine());

        System.out.print("Aadhar Number: ");
        String aadhar = sc.nextLine();

        System.out.print("Loan Amount: ");
        double amount = Double.parseDouble(sc.nextLine());

        System.out.print("Tenure (in years): ");
        int tenure = Integer.parseInt(sc.nextLine());

        System.out.print("Property Address: ");
        String address = sc.nextLine();

        System.out.print("Property Value: ");
        double value = Double.parseDouble(sc.nextLine());

        HomeLoan homeLoan = new HomeLoan(name, accNumber, cibil, aadhar, amount, tenure, address, value);

        System.out.println("\nLoan Details:");
        homeLoan.displayLoanDetails();

        System.out.println("\nEMI Options:");
        homeLoan.displayEmiOptions();
    }

    private static void processCarLoan(Scanner sc) {
        System.out.println("Welcome to Car Loan Service");
        System.out.println("Please provide the following details:");

        System.out.print("Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Account Number: ");
        String accNumber = sc.nextLine();

        System.out.print("CIBIL Score: ");
        int cibil = Integer.parseInt(sc.nextLine());

        System.out.print("Aadhar Number: ");
        String aadhar = sc.nextLine();

        System.out.print("Loan Amount: ");
        double amount = Double.parseDouble(sc.nextLine());

        System.out.print("Tenure (in years): ");
        int tenure = Integer.parseInt(sc.nextLine());

        System.out.print("Car Model: ");
        String model = sc.nextLine();

        System.out.print("Car Registration Number: ");
        String regNo = sc.nextLine();

        CarLoan carLoan = new CarLoan(name, accNumber, cibil, aadhar, amount, tenure, model, regNo);

        System.out.println("\nLoan Details:");
        carLoan.displayLoanDetails();

        System.out.println("\nEMI Options:");
        carLoan.displayEmiOptions();
    }

    private static void processPersonalLoan(Scanner sc) {
        System.out.println("Welcome to Personal Loan Service");
        System.out.println("Please provide the following details:");

        System.out.print("Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Account Number: ");
        String accNumber = sc.nextLine();

        System.out.print("CIBIL Score: ");
        int cibil = Integer.parseInt(sc.nextLine());

        System.out.print("Aadhar Number: ");
        String aadhar = sc.nextLine();

        System.out.print("Loan Amount: ");
        double amount = Double.parseDouble(sc.nextLine());

        System.out.print("Tenure (in years): ");
        int tenure = Integer.parseInt(sc.nextLine());

        System.out.print("Loan Purpose: ");
        String purpose = sc.nextLine();

        PersonalLoan personalLoan = new PersonalLoan(name, accNumber, cibil, aadhar, amount, tenure, purpose);

        System.out.println("\nLoan Details:");
        personalLoan.displayLoanDetails();

        System.out.println("\nEMI Options:");
        personalLoan.displayEmiOptions();
    }

    private static void processEducationLoan(Scanner sc) {
        System.out.println("Welcome to Education Loan Service");
        System.out.println("Please provide the following details:");

        System.out.print("Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Account Number: ");
        String accNumber = sc.nextLine();

        System.out.print("CIBIL Score: ");
        int cibil = Integer.parseInt(sc.nextLine());

        System.out.print("Aadhar Number: ");
        String aadhar = sc.nextLine();

        System.out.print("Loan Amount: ");
        double amount = Double.parseDouble(sc.nextLine());

        System.out.print("Tenure (in years): ");
        int tenure = Integer.parseInt(sc.nextLine());

        System.out.print("Institution Name: ");
        String institution = sc.nextLine();

        System.out.print("Course: ");
        String course = sc.nextLine();

        EducationLoan educationLoan = new EducationLoan(name, accNumber, cibil, aadhar, amount, tenure, institution, course);

        System.out.println("\nLoan Details:");
        educationLoan.displayLoanDetails();

        System.out.println("\nEMI Options:");
        educationLoan.displayEmiOptions();
    }
}
