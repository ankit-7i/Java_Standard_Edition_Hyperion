package com.ankit.java.oops_concept.factory_method;

import java.util.Scanner;

// Program on static factory method on method reusability:
public class Product {



        private int id;
        private String name;
        private double price;

        private Product(int id, String name, double price) {
            super();
            this.id = id;
            this.name = name;
            this.price = price;
        }

        // static factory method
        public static Product getProductObject() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Product Id :");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Product Name :");
            String name = sc.nextLine();

            System.out.print("Enter Product Price :");
            double price = Double.parseDouble(sc.nextLine());

            return new Product(id, name, price);
        }

        @Override
        public String toString() {
            return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
        }
    }

