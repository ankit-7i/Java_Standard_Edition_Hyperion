package com.ankit.java.oops_concept.this_keyword;

import java.util.Scanner;

public class ElcCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name : ");
        String customerName = sc.nextLine();
        System.out.print("Enter Customer Bank Account Number : ");
        long accountNumber= Long.parseLong(sc.nextLine());
        System.out.print("Enter Current Balance : ");
        double currentBalance = Double.parseDouble(sc.nextLine());
        Customer cs1 = new Customer();
        cs1.setCustomerDetails(customerName, accountNumber, currentBalance);

        cs1.displayDetails();
        cs1.withdraw(2000);
        cs1.deposit(3000);
        cs1.currentBalance();
        sc.close();
    }

}
