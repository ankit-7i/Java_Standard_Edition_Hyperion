package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism.loan_service_management;



public class CarLoan extends SecuredLoan {
    private String carModel;
    private String carRegistrationNumber;

    public CarLoan(String accountHolderName, String accountNumber,
                   int cibilScore, String adharNumber,
                   double loanAmount, int tenure,
                   String carModel, String carRegistrationNumber) {
        super(accountHolderName, accountNumber, cibilScore, adharNumber, loanAmount, tenure);
        this.interestRate = 9.0; // 9.0% interest rate for car loans
        this.carModel = carModel;
        this.carRegistrationNumber = carRegistrationNumber;
    }

    @Override
    public void displayLoanDetails() {
        super.displayLoanDetails();
        System.out.println("Loan Type: Car Loan");
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Registration: " + carRegistrationNumber);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
