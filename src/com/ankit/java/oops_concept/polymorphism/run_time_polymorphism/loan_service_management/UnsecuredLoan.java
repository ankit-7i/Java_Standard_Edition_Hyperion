package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism.loan_service_management;


public class UnsecuredLoan extends LoanAccount {
    protected double interestRate;

    public UnsecuredLoan(String accountHolderName, String accountNumber,
                         int cibilScore, String adharNumber,
                         double loanAmount, int tenure) {
        super(accountHolderName, accountNumber, cibilScore, adharNumber, loanAmount, tenure);
    }

    @Override
    public double calculateEmi() {
        // Standard EMI formula: [P x R x (1+R)^N]/[(1+R)^N-1]
        double monthlyRate = interestRate / 12 / 100;
        int months = tenure * 12;
        return (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1);
    }
}
