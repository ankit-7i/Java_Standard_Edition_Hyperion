package com.ankit.java.oops_concept.datahidingconcept;

public class BankCustomer {
    private double balance = 1000;
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Amount can;t be deposited");
        }
        else {
            balance = balance + amount;
            System.out.println("Balance after deposit is :"+balance);
        }
    }
    public  void withdraw(double amount){
        if(amount> balance){
            System.err.println("Insufficient Balance !!!");
        }
        else{
            balance = balance - amount;
            System.out.println("Balance after witdraw is :"+balance);
        }
    }
}
