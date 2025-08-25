package com.ankit.java.oops_concept.class_relation_in_java.has_a_relation_association.aggregation.order_aggregation_example;
import java.util.Scanner;
public class Elc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======= Welcome to Zomato =======\n");

        // Order Details
        System.out.print("Enter Order ID: ");
        String orderId = sc.nextLine();

        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Price per Item: ₹");
        double price = Double.parseDouble(sc.nextLine());

        Order order = new Order(orderId, itemName, quantity, price);

        // Customer Details
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        long mobileNo = Long.parseLong(sc.nextLine());

        System.out.print("Enter Payment Mode (UPI/Cash/Card): ");
        String paymentMode = sc.nextLine();

        Customer customer = new Customer(name, email, address, mobileNo, paymentMode, order);

        // Print Fancy Receipt
        System.out.println("\n\n" + customer);

        sc.close();
    }
}
