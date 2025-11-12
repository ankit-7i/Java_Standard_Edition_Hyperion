package com.ankit.java.IOconcept.serialization_and_deserialization.Customer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serialization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of customers to store: ");
        int count = scanner.nextInt();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ankit\\OneDrive\\Attachments\\Documents\\Desktop\\Serialization_and_Deserialization\\CustomerObject.txt.txt1"))) {
            for (int i = 0; i < count; i++) {
                System.out.println("\nEnter details for Customer " + (i + 1));
                Customer customer = Customer.getCustomerObject();
                oos.writeObject(customer);
            }
            System.out.println("\nCustomer objects stored successfully.");
        } catch (Exception e) {
            System.out.println("Error storing customer objects: " + e.getMessage());
        }
    }
}