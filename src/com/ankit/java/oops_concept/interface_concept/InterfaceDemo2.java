package com.ankit.java.oops_concept.interface_concept;

// Bank.java
interface Bank {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}

// Customer.java
 class Customer implements Bank {
    private double balance;

    public Customer(double balance) {
        super();
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Amount cannot be deposited");
            System.exit(0);
        }
        this.balance = this.balance + amount;
        System.out.println("After deposit: " + amount + ", updated balance is = " + this.balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.err.println("Insufficient Balance!!!");
            System.exit(0);
        }
        this.balance = this.balance - amount;
        System.out.println("After withdraw: " + amount + ", updated balance is = " + this.balance);
    }
}

// InterfaceDemo2.java

public class InterfaceDemo2 {
    public static void main(String[] args) {
        Bank ravi = new Customer(10000);
        System.out.println(ravi.getBalance());
        ravi.deposit(5000);
        ravi.withdraw(2000);

        System.out.println("-------------");

        Bank scott = new Customer(20000);
        System.out.println(scott.getBalance());
        scott.deposit(6000);
        scott.withdraw(5000);
    }
}

