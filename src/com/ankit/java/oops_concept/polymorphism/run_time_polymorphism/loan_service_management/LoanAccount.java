package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism.loan_service_management;

public class LoanAccount {
    protected String accountHolderName;
    protected String accountNumber;
    protected int cibilScore;
    protected String adharNumber;
    protected double loanAmount;
    protected int tenure;

    public LoanAccount(String accountHolderName, String accountNumber,int cibilScore, String adharNumber, double loanAmount, int tenure) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.cibilScore = cibilScore;
        this.adharNumber = adharNumber;
        this.loanAmount = loanAmount;
        this.tenure = tenure;
    }

    public double calculateEmi() {
        return 0; // To be overridden by subclasses
    }

    public void displayLoanDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("CIBIL Score: " + cibilScore);
        System.out.println("Aadhar Number: " + adharNumber);
        System.out.println("Loan Amount: ₹" + loanAmount);
        System.out.println("Tenure: " + tenure + " years");
    }

    public void displayEmiOptions() {
        double monthlyEmi = calculateEmi();
        System.out.println("Monthly EMI: ₹" + monthlyEmi);
        System.out.println("Quarterly EMI: ₹" + (monthlyEmi * 3));
        System.out.println("Yearly EMI: ₹" + (monthlyEmi * 12));
    }
}
