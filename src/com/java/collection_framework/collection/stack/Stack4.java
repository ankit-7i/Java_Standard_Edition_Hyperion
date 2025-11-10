package com.java.collection_framework.collection.stack;
import java.util.Stack;
/**
 * Demonstrates search(), empty() and indexOf() methods of Stack.
 *
 * <p><b>search(element):</b></p>
 * <ul>
 *   <li>Returns offset position (1-based)</li>
 *   <li>Top element has offset 1</li>
 *   <li>If not found returns -1</li>
 * </ul>
 *
 * <p><b>empty():</b></p>
 * <ul>
 *   <li>Returns true if stack is empty, else false</li>
 * </ul>
 *
 * <p><b>indexOf(element):</b></p>
 * <ul>
 *   <li>Returns index position (0-based)</li>
 * </ul>
 */
public class Stack4 {

    public static void main(String args[]) {

        Stack<String> stk = new Stack<>();
        stk.push("Apple");
        stk.push("Grapes");
        stk.push("Mango");

        // Stack = [Apple, Grapes, Mango]
        // Top = Mango

        System.out.println("Offset Position is : " + stk.search("Mango"));   // 1
        System.out.println("Offset Position is : " + stk.search("Banana"));  // -1

        System.out.println("Is stack empty ? " + stk.empty());              // false

        System.out.println("Index Position is : " + stk.indexOf("Mango"));  // 2
    }
}
