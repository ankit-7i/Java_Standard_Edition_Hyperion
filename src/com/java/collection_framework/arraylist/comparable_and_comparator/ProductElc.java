package com.java.collection_framework.arraylist.comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductElc {
    public static void main(String[] args) {



        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product(101, "Laptop", 75000.0));
        productList.add(new Product(102, "Smartphone", 30000.0));
        productList.add(new Product(103, "Tablet", 20000.0));
        productList.add(new Product(104, "Monitor", 15000.0));

        System.out.println("Before Sorting:");
        for (Product p : productList) {
            System.out.println(p);
        }

        Collections.sort(productList);

        System.out.println("\nAfter Sorting by Product Name:");
        for (Product p : productList) {
            System.out.println(p);
        }



    }
}
