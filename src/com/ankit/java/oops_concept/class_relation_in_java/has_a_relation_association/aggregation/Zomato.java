package com.ankit.java.oops_concept.class_relation_in_java.has_a_relation_association.aggregation;

import java.util.Scanner;

public class Zomato {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter OrderId : ");
        String orderId = sc.nextLine();

        System.out.print("Enter item Name  :");
        String itemName = sc.nextLine();

        System.out.print("Enter price of the item : " );
        double price = Double.parseDouble(sc.nextLine());

        Order o1 = new Order(orderId, itemName, price);

        System.out.print("Enter Customer Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Customer Email :");
        String email = sc.nextLine();

        System.out.print("Enter Customer Address : ");
        String address = sc.nextLine();

        System.out.print("Enter Customer Mobile no : ");
        long mobileNo = Long.parseLong(sc.nextLine());

        Customer c1  = new Customer(name, email , address, mobileNo, o1);

        System.out.println(c1);



    }

}

