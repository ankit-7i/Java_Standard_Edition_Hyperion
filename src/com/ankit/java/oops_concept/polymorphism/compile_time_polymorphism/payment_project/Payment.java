package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism.payment_project;

public class Payment {
    // Validation
    // Amount Validation
    private boolean validateAmount(double amount){
        if(amount<0){
            System.err.println("Enter a Valid Amount");
            System.exit(0);
            return false;

        }
        else {
            return true;
        }
    }
    // Card - length Validation
    private boolean validateCardNumber(String cardNumber){
        if(cardNumber.length()==16){
            return  true;
        }
        else {
            System.err.println("Enter a valid Card Number");
            System.exit(0);
            return false;
        }
    }

    // Masking Card details
    private String maskCardNumber(String cardNumber){
        String encryptionPattern = "*".repeat(cardNumber.length()-4);
        String encryptedFormat = cardNumber
                .substring(cardNumber.length()-4,
                        cardNumber.length());
        String encryptedCardNumber = encryptionPattern+encryptedFormat;
        return encryptedCardNumber;
    }
    // for cash
    public void makePayment(double amount){
        if(this.validateAmount(amount)){
            System.out.println("Processing payment via Cash...");
            System.out.println("Amount Paid RS : "+amount);
            System.out.println("Payment Successful!");
        }
        else {
            System.err.println("Payment Failed . Try Again");
        }

    }


    //for debit card
    public void makePayment(String debitCardNumber,double amount)
    {
        if(this.validateAmount(amount) && this.validateCardNumber(debitCardNumber))
        {
            System.out.println("Processing payment via debit Card...");
            System.out.println("Card number :"+this.maskCardNumber(debitCardNumber));
            System.out.println("Amount Paid RS :"+amount);
            System.out.println("Payment Successful!\n");
        }
        else {
            System.out.println("Payment Failed \n" +
                    "Try Again Later");
        }

    }
    // for credit card
    public void makePayment(String cardHolderName,String creditCardNumber,double amount)
    {
        if(this.validateAmount(amount) && this.validateCardNumber(creditCardNumber))
        {
            System.out.println("Processing payment via credit Card...");
            System.out.println(" Card Holder: "+cardHolderName);
            System.out.println("Card number :"+this.maskCardNumber(creditCardNumber));
            System.out.println("Amount Paid RS :"+amount);
            System.out.println("Payment Successful!\n");
        }
        else {
            System.out.println("Payment Failed \n" +
                    "Try Again Later");
        }
    }
}
