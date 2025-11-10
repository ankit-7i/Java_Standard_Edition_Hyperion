package com.java.collection_framework.collection.arraylist;

/**
 * ArrayListDemo3
 * ------------------------
 * Demonstrates merging, printing, and retainAll() operation of ArrayList.
 *
 * <p><b>Concepts Covered:</b></p>
 * <ul>
 *   <li>Adding strings to ArrayList</li>
 *   <li>Merging two ArrayLists using addAll()</li>
 *   <li>Converting all strings to uppercase using lambda</li>
 *   <li>Using retainAll() to find common elements</li>
 * </ul>
 *
 * <p><b>Key Methods:</b></p>
 * <ul>
 *   <li><b>add()</b> – Insert element</li>
 *   <li><b>addAll()</b> – Merge lists</li>
 *   <li><b>forEach()</b> – Iteration with lambda</li>
 *   <li><b>retainAll()</b> – Retain common elements</li>
 * </ul>
 *
 * <p><b>Output Behavior:</b></p>
 * <ul>
 *   <li>First list printed in uppercase</li>
 *   <li>Second list retains only values common to another list</li>
 * </ul>
 */
import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String args[]) {

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Ravi");
        al1.add("Rahul");
        al1.add("Rohit");

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Pallavi");
        al2.add("Sweta");
        al2.add("Puja");

        al1.addAll(al2);

        al1.forEach(str -> System.out.println(str.toUpperCase()));

        System.out.println(".........................");

        ArrayList<String> al3 = new ArrayList<>();
        al3.add("Ravi");
        al3.add("Rahul");
        al3.add("Rohit");

        ArrayList<String> al4 = new ArrayList<>();
        al4.add("Pallavi");
        al4.add("Rahul");
        al4.add("Raj");

        al3.retainAll(al4);

        al3.forEach(x -> System.out.println(x));
    }
}
