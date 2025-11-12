package com.java.collection_framework.linkedlist;

import java.util.*;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> city = new LinkedList<>();
        city.add("Kolkata");
        city.add("Bangalore");
        city.add("Hyderabad");
        city.add("Pune");

        System.out.println("Before Modification: " + city);

        ListIterator<String> lt = city.listIterator();

        while (lt.hasNext()) {
            String cityName = lt.next();

            if (cityName.equals("Kolkata")) {
                lt.remove();
            } else if (cityName.equals("Hyderabad")) {
                lt.add("Ameerpet");
            } else if (cityName.equals("Pune")) {
                lt.set("Mumbai");
            }
        }

        System.out.println("After Modification: " + city);

        city.forEach(System.out::println);

        System.out.println("\nNote: No ConcurrentModificationException because ListIterator allows internal structure modification.");
    }
}
