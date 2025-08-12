package com.ankit.java.oops_concept.deep_copy;

public class ElcProduct {

        public static void main(String[] args) {
            Product p1 = new Product(23000);
            System.out.println(p1); // 23000

            Product p2 = new Product();
            System.out.println(p2); // 0.0

            System.out.println("Copy the content of first object to 2nd object");
            p2.setPrice(p1.getPrice());
            System.out.println(p1); // 23000
            System.out.println(p2); // 23000

            System.out.println("Modify object 1 price");
            p1.setPrice(25000);

            System.out.println("Final price of both the objects..");
            System.out.println(p1); // 25000
            System.out.println(p2); // 23000
        }
}


