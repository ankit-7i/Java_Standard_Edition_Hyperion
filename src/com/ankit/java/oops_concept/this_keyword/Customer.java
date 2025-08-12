package com.ankit.java.oops_concept.this_keyword;

public class Customer {
    private String customerName;
    private long accountNumber;
    private double currentBalance;
    private static String bankName="State Bank of India";
    private static String bankAddress="Kendrapara";
    private static String bankIFSCCode="SBIN135088";


    public void setCustomerDetails(String customerName,long accountNumber,double currentBalance ) {
        this.customerName=customerName;
        this.accountNumber=accountNumber;
        this.currentBalance=currentBalance;

    }
    public  void withdraw(double amount){
        if(amount> currentBalance){
            System.err.println("User You have Insufficient Balance !!!");
        }
        else{
            currentBalance = currentBalance - amount;
            System.out.println("Balance after witdraw is :"+currentBalance);

        }
    }

    public void deposit(double amount){
        if(amount<=0){
            System.err.println("Amount can't be deposited");
        }
        else {
            currentBalance = currentBalance + amount;
            System.out.println("Balance after deposit is :"+currentBalance);
        }
    }
    public void currentBalance() {



        System.out.println("Customer Your Current balance is :"+currentBalance);
        System.out.println();
        System.out.println("Dear User Thanks For Your Valuable Time...");


    }
    public void displayDetails() {
        System.out.println(" *** Welcome To SBI *** ");
        System.out.println();
        System.out.println("Account Holder Name :- "+customerName);
        System.out.println("Customer Account Number :- "+accountNumber);
        System.out.println("IFSC Code :- "+bankIFSCCode);
        System.out.println("Bank Name :- "+bankName);
        System.out.println("Bank Address :- "+bankAddress);
    }



}
