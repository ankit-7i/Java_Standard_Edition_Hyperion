package com.java.collection_framework.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

record Product(Integer id, String name) {}

public class LinkedListDemo6 {
    public static void main(String[] args) {
        LinkedList<Product> listOfProduct = new LinkedList<>();

        listOfProduct.add(new Product(2, "ApplePhone"));
        listOfProduct.add(new Product(1, "MiPhone"));
        listOfProduct.add(new Product(3, "VivoPhone"));

        // Sorting based on Product ID
        listOfProduct.sort((p1, p2) -> p1.id().compareTo(p2.id()));

        Iterator<Product> iterator = listOfProduct.iterator();
        iterator.forEachRemaining(System.out::println);

        System.out.println("\nFetch the object based on index:");
        Product product = listOfProduct.get(1);
        System.out.println(product);
    }
}

