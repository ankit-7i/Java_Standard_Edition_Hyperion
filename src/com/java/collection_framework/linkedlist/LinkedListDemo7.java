package com.java.collection_framework.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo7 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        list.add("Item 6");
        list.add("Item 7");
        list.add("Item 9");

        list.add(0, "Item 0");
        list.add(1, "Item 1");
        list.add(8, "Item 8");
        list.add(9, "Item 10");

        System.out.println("Initial List: " + list);

        list.remove("Item 5");
        System.out.println("After removing 'Item 5': " + list);

        list.removeLast();
        list.removeFirst();
        System.out.println("After removing first & last: " + list);

        // Replace using set()
        list.set(0, "Ajay");
        list.set(1, "Vijay");
        list.set(2, "Anand");
        list.set(3, "Aman");
        list.set(4, "Ganesh");
        list.set(5, "Ramesh");

        System.out.println("\nAfter replacing elements:");
        list.forEach(System.out::println);
    }
}
