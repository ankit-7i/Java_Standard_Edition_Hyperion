package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism.loan_service_management;


public class PersonalLoan extends UnsecuredLoan {
    private String purpose;

    public PersonalLoan(String accountHolderName, String accountNumber,
                        int cibilScore, String adharNumber,
                        double loanAmount, int tenure, String purpose) {
        super(accountHolderName, accountNumber, cibilScore, adharNumber, loanAmount, tenure);
        this.interestRate = 12.5; // 12.5% interest rate for personal loans
        this.purpose = purpose;
    }

    @Override
    public void displayLoanDetails() {
        super.displayLoanDetails();
        System.out.println("Loan Type: Personal Loan");
        System.out.println("Purpose: " + purpose);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
