package com.java.collection_framework.stack;

/**
 * Demonstrates usage of Stack with different data types.
 *
 * <p><b>Key Concepts:</b></p>
 * <ul>
 *   <li>Stack is a generic class, so we can create Stack of Integer, String, Character, Double etc.</li>
 *   <li>add() behaves similar to push() because Stack extends Vector</li>
 *   <li>forEach() lambda is used to print elements</li>
 * </ul>
 */
import java.util.Stack;
public class Stack2 {

    public static void main(String args[]) {

        // Integer Stack
        Stack<Integer> st1 = new Stack<>();
        st1.add(10);
        st1.add(20);
        st1.forEach(x -> System.out.println(x));

        // String Stack
        Stack<String> st2 = new Stack<>();
        st2.add("Java");
        st2.add("is");
        st2.add("programming");
        st2.add("language");
        st2.forEach(x -> System.out.println(x));

        // Character Stack
        Stack<Character> st3 = new Stack<>();
        st3.add('A');
        st3.add('B');
        st3.forEach(x -> System.out.println(x));

        // Double Stack
        Stack<Double> st4 = new Stack<>();
        st4.add(10.5);
        st4.add(20.5);
        st4.forEach(x -> System.out.println(x));
    }
}
