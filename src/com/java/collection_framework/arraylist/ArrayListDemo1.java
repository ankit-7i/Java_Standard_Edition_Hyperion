package com.java.collection_framework.arraylist;

/**
 * ArrayListDemo1
 * ---------------------
 * Demonstrates basic usage of ArrayList with primitive wrapper type Integer.
 *
 * <p><b>Concepts Covered:</b></p>
 * <ul>
 *   <li>Creating ArrayList with user-defined initial capacity</li>
 *   <li>Adding elements using add() method</li>
 *   <li>Iterating using enhanced for-loop</li>
 *   <li>Performing arithmetic operations on stored values</li>
 * </ul>
 *
 * <p><b>Key Points:</b></p>
 * <ul>
 *   <li>ArrayList stores elements based on index positions</li>
 *   <li>Autoboxing converts primitive int to Integer object automatically</li>
 *   <li>Sum of all elements is calculated during iteration</li>
 * </ul>
 */
import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String args[]) {

        ArrayList<Integer> numbers = new ArrayList<>(20);

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        int sum = 0;

        for (Integer number : numbers) {
            sum = sum + number;
        }

        System.out.println("Sum of all elements are : " + sum);
    }
}
