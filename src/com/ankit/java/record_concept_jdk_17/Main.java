package com.ankit.java.record_concept_jdk_17;

public class Main {
    public static void main(String[] args) {
        // Using the automatically generated constructor
        BankAccount account = new BankAccount("12345", "Alice", 100.0);

        // Using the auto-generated accessor methods (note: no 'get' prefix)
        System.out.println(account.accountNumber()); // "12345"
        System.out.println(account.accountHolderName()); // "Alice"
        System.out.println(account.balance()); // 100.0

        // Using the auto-generated toString()
        System.out.println(account); // BankAccount[accountNumber=12345, accountHolderName=Alice, balance=100.0]

        // Using our custom method
        System.out.println(account.getFormattedBalance()); // "$100.00"

        // Using auto-generated equals()
        BankAccount anotherAccount = new BankAccount("12345", "Alice", 100.0);
        System.out.println(account.equals(anotherAccount)); // true
    }
}
