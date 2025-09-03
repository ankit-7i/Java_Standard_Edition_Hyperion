package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism.loan_service_management;

public class EducationLoan extends UnsecuredLoan {
    private String institutionName;
    private String course;

    public EducationLoan(String accountHolderName, String accountNumber,
                         int cibilScore, String adharNumber,
                         double loanAmount, int tenure,
                         String institutionName, String course) {
        super(accountHolderName, accountNumber, cibilScore, adharNumber, loanAmount, tenure);
        this.interestRate = 10.0; // 10.0% interest rate for education loans
        this.institutionName = institutionName;
        this.course = course;
    }

    @Override
    public void displayLoanDetails() {
        super.displayLoanDetails();
        System.out.println("Loan Type: Education Loan");
        System.out.println("Institution: " + institutionName);
        System.out.println("Course: " + course);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}