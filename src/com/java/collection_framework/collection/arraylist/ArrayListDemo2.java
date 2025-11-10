package com.java.collection_framework.collection.arraylist;

/**
 * ArrayListDemo2
 * -----------------------
 * Demonstrates usage of ArrayList with custom objects (Customer records).
 *
 * <p><b>Concepts Covered:</b></p>
 * <ul>
 *   <li>Storing user-defined objects in ArrayList</li>
 *   <li>Using record Customer for concise data structure</li>
 *   <li>Iterating and displaying list elements</li>
 *   <li>Removing elements using removeIf() and lambda</li>
 *   <li>Sorting based on custom criteria (salary ascending)</li>
 * </ul>
 *
 * <p><b>Important Methods Used:</b></p>
 * <ul>
 *   <li><b>add()</b> – Add elements</li>
 *   <li><b>removeIf()</b> – Conditional removal</li>
 *   <li><b>sort()</b> – Comparator based sorting</li>
 * </ul>
 *
 * <p><b>Sorting Logic:</b></p>
 * <code>
 * listOfCustomer.sort((c1, c2) -> Double.compare(c2.sal(), c1.sal()));
 * </code>
 *
 * <p>This arranges Customer objects in ascending order of salary.</p>
 */
import java.util.ArrayList;

record Customer(Integer id, String name, Double sal) {}

public class ArrayListDemo2 {

    public static void main(String args[]) {

        ArrayList<Customer> listOfCustomer = new ArrayList<>();

        listOfCustomer.add(new Customer(111, "Scott", 8000D));
        listOfCustomer.add(new Customer(222, "Smith", 12000D));
        listOfCustomer.add(new Customer(333, "Allen", 10000D));
        listOfCustomer.add(new Customer(444, "Martin", 15000D));
        listOfCustomer.add(new Customer(555, "John", 13000D));

        System.out.println("Original Data:");
        listOfCustomer.forEach(System.out::println);

        System.out.println("Removing the 444 id :");
        listOfCustomer.removeIf(cust -> cust.id() == 444);
        listOfCustomer.forEach(System.out::println);

        System.out.println("Sorting based on the salary (ascending)");
        listOfCustomer.sort((c1, c2) -> Double.compare(c1.sal(), c2.sal()));
        listOfCustomer.forEach(System.out::println);
    }
}
