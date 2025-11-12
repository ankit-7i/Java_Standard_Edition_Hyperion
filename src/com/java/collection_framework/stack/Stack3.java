package com.java.collection_framework.stack;

/**
 * Demonstrates the use of the peek() method in Stack.
 *
 * <p><b>Key Concepts:</b></p>
 * <ul>
 *   <li>push() → Insert elements</li>
 *   <li>peek() → Returns top element without removing it</li>
 *   <li>Stack follows LIFO (Last In First Out)</li>
 * </ul>
 */
import java.util.Stack;
public class Stack3 {

    public static void main(String args[]) {

        Stack<String> stk = new Stack<>();
        stk.push("Apple");
        stk.push("Grapes");
        stk.push("Mango");
        stk.push("Orange");

        System.out.println("Stack: " + stk);

        String fruit = stk.peek();  // returns "Orange"
        System.out.println("Element at top: " + fruit);

        System.out.println("Stack elements are : " + stk);
    }
}
