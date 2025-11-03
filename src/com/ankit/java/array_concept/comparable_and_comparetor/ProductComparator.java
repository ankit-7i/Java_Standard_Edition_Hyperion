package com.ankit.java.array_concept.comparable_and_comparetor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

record Product(Integer id, String name, Double price) {}

public class ProductComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.print("Enter the size: ");
            int size = Integer.parseInt(sc.nextLine());

            Product[] products = new Product[size];

            for (int i = 0; i < size; i++) {
                System.out.println("Enter Product Id: ");
                int id = Integer.parseInt(sc.nextLine());

                System.out.println("Enter Product Name: ");
                String name = sc.nextLine();

                System.out.println("Enter Product Price: ");
                double price = Double.parseDouble(sc.nextLine());

                products[i] = new Product(id, name, price);
            }

            System.out.println("\nOriginal Data:");
            System.out.println(Arrays.toString(products));

            // Anonymous inner class approach — sorting by ID
            Comparator<Product> compById = new Comparator<>() {
                @Override
                public int compare(Product p1, Product p2) {
                    return Integer.compare(p1.id(), p2.id());
                }
            };
            Arrays.sort(products, compById);
            System.out.println("\nSorted based on the ID:");
            System.out.println(Arrays.toString(products));

            // Sorting based on name using Lambda
            Arrays.sort(products, (p1, p2) -> p1.name().compareTo(p2.name()));
            System.out.println("\nSorted based on the Name:");
            System.out.println(Arrays.toString(products));

            // Sorting based on price using Lambda
            Arrays.sort(products, (p1, p2) -> Double.compare(p1.price(), p2.price()));
            System.out.println("\nSorted based on the Price:");
            System.out.println(Arrays.toString(products));

        } catch (NegativeArraySizeException e) {
            System.err.println("Array size must be positive!");
        }
    }
}

