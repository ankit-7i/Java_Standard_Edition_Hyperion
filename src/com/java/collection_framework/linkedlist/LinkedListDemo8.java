package com.java.collection_framework.linkedlist;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A"); // 0
        list.add("B"); // 1
        list.add("C"); // 2

        ListIterator<String> itr = list.listIterator();

        System.out.println("Initially -> previousIndex(): " + itr.previousIndex());

        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println("Current element: " + element);
            System.out.println("Next Index: " + itr.nextIndex());
            System.out.println("Previous Index: " + itr.previousIndex());
            System.out.println("-----------------------");
        }

        System.out.println("After traversing -> nextIndex(): " + itr.nextIndex());
        System.out.println("After traversing -> previousIndex(): " + itr.previousIndex());
    }
}
