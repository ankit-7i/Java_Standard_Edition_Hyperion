package com.ankit.java.oops_concept.constructor.copyconstrutor;

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product(111, "Camera");
        System.out.println("First Object Data :" + p1);

        Product p2 = new Product(p1);
        System.out.println("Second Object Data :" + p2);
    }
}
