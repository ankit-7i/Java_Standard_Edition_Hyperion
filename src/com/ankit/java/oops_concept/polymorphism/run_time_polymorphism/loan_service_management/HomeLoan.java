package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism.loan_service_management;


public class HomeLoan extends SecuredLoan {
    private String propertyAddress;
    private double propertyValue;

    public HomeLoan(String accountHolderName, String accountNumber,
                    int cibilScore, String adharNumber,
                    double loanAmount, int tenure,
                    String propertyAddress, double propertyValue) {
        super(accountHolderName, accountNumber, cibilScore, adharNumber, loanAmount, tenure);
        this.interestRate = 8.5; // 8.5% interest rate for home loans
        this.propertyAddress = propertyAddress;
        this.propertyValue = propertyValue;
    }

    @Override
    public void displayLoanDetails() {
        super.displayLoanDetails();
        System.out.println("Loan Type: Home Loan");
        System.out.println("Property Address: " + propertyAddress);
        System.out.println("Property Value: ₹" + propertyValue);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
