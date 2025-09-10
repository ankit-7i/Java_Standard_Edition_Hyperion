package com.ankit.java.oops_concept.abstraction.product_management;

import java.util.Scanner;

public class ProductStore
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Product Type:");
        System.out.println("1. Digital Product");
        System.out.println("2. Physical Product");

        int choice = Integer.parseInt(scanner.nextLine());



        switch (choice)
        {
            case 1->
            {

                System.out.print("Enter Digital Product Name :");
                String dName = scanner.nextLine();

                System.out.print("Enter Product Price :");
                double dPrice = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter Product Category :");
                String dCategory = scanner.nextLine();

                System.out.print("Enter Product License Key :");
                String dLicenseKey = scanner.nextLine();

                System.out.print("Enter the discount % on final bill :");
                double dDiscount = Double.parseDouble(scanner.nextLine());

                DigitalProduct digitalProduct = new DigitalProduct(dName, dPrice, dCategory, dLicenseKey);

                System.out.println("Digital Product :");

                System.out.println(digitalProduct);

                digitalProduct.applyDiscount(dDiscount);

                System.out.println("Tax RS : " + digitalProduct.calculateTax());

            }
            case 2->
            {
                System.out.print("Enter Physical Product Name :");
                String pName = scanner.nextLine();

                System.out.print("Enter Product Price :");
                double pPrice = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter Product Category :");
                String pCategory = scanner.nextLine();

                System.out.print("Enter Product weight :");
                double pWeight = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter the discount % on final bill :");
                double pDiscount = Double.parseDouble(scanner.nextLine());

                PhysicalProduct physicalProduct = new PhysicalProduct(pName, pPrice, pCategory, pWeight);

                System.out.println("Physical Product:");

                System.out.println(physicalProduct);

                physicalProduct.applyDiscount(pDiscount);

                System.out.println("Tax RS : " + physicalProduct.calculateTax());

                System.out.println("Shipping Cost RS : " + physicalProduct.calculateShippingCost());
            }
            default->{
                System.out.println("Invalid choice.");
            }

        }
        scanner.close();
    }
}


