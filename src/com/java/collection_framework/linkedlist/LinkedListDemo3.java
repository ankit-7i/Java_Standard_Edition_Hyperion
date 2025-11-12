package com.java.collection_framework.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo3 {
    public static void main(String[] argv) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Ravi");
        list.add("Rahul");
        list.addLast("Anand");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        System.out.println("---------------------------");

        List<String> listOfNames = Arrays.asList("Ravi", "Rahul", "Ankit", "Rahul");
        LinkedList<String> names = new LinkedList<>(listOfNames);
        names.forEach(System.out::println);
    }
}
