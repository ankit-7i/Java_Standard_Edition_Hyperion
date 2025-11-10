package com.java.collection_framework.collection.stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Demonstrates basic Stack operations:
 *
 * <p><b>Operations Used:</b></p>
 * <ul>
 *   <li><b>push()</b> → Inserts elements into the stack</li>
 *   <li><b>pop()</b> → Removes and returns elements from the top (LIFO)</li>
 *   <li><b>empty()</b> → Checks whether the stack is empty</li>
 * </ul>
 *
 * <p><b>Execution Flow:</b></p>
 * <ol>
 *   <li>Pushes elements: 12, 15, 22, 33, 49</li>
 *   <li>Prints the stack after insertion</li>
 *   <li>Fetches elements one by one using pop()</li>
 *   <li>Prints stack after deletion</li>
 *   <li>Checks whether the stack is empty</li>
 * </ol>
 *
 * <p><b>Note:</b> pop() throws EmptyStackException if stack is empty,
 * hence wrapped in try-catch block.</p>
 */
public class Stack1 {

    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();

        try {
            s.push(12); // 12
            s.push(15); // 12 15
            s.push(22); // 12 15 22
            s.push(33); // 12 15 22 33
            s.push(49); // 12 15 22 33 49

            System.out.println("After insertion elements are : " + s);

            System.out.println("Fetching the elements using pop method:");
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());

            System.out.println("After deletion elements are : " + s); // []

            System.out.println("Is the Stack empty ? : " + s.empty());
        }
        catch (EmptyStackException e) {
            e.printStackTrace();
        }
    }
}
