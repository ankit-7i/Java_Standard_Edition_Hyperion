package com.java.collection_framework.arraylist.comparable_and_comparator;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.Scanner;

public class CustomerElc {

    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many Customer details you want to store");
        int size = Integer.parseInt(sc.nextLine());
        for(int i = 0; i<size;i++) {
            System.out.println("Enter Customer number :");
            Integer cnum = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Customer Name :");
            String cname = sc.nextLine();
            System.out.println("Enter Customer bill Amount");
            Double cbill = Double.parseDouble(sc.nextLine());
            customerList.add ( new Customer(cnum,cname,cbill));

        }


        System.out.println("1}->Sort Customer on the basis of Name");
        System.out.println("2}->Sort Customer on the basis of Id ");
        System.out.println("3}->Sort Customer on the basis of bill amount");

        System.out.print("Choose your option the way you want to sort your Customer data ");

        int choice = Integer.parseInt(sc.nextLine());


        switch(choice){

            case 1 -> {
                customerList.sort(Comparator.comparing(Customer::getCustomerName));
                System.out.println("\nSorted based on the Name:");
                System.out.println(customerList.toString());

            }
            case 2 ->{
                customerList.sort(Comparator.comparing(Customer::getCustomerNumber));
                System.out.println("\nSorted based on the id ");
                System.out.println(customerList.toString());

            }
            case 3 -> {
                    customerList.sort(Comparator.comparing(Customer::getCustomerBill));
                    System.out.println("\nSorted based on the bill amount");
                System.out.println(customerList.toString());

            }
            default -> {
                System.out.println("Invalid input !! Please Check again... ");
            }

        }
    }
}


/*

 */