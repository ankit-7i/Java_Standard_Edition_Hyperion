package com.ankit.java.multithreding_concept;

/**
 * Program Name: MainThread.java
 *
 * Description:
 * ---------------
 * This program demonstrates that the 'main' method in Java runs under a predefined thread
 * called the "main thread". Whenever the JVM starts execution, it automatically creates
 * this main thread under the "main" thread group. The purpose of the main thread is to
 * execute the entire main() method.
 *
 * The Thread class in Java provides a static factory method:
 *     public static Thread currentThread()
 * which returns a reference to the currently executing Thread object.
 *
 * Using this reference, we can call the non-static method:
 *     public final String getName()
 * to obtain the name of the currently executing thread.
 *
 * Program Explanation:
 * ---------------------
 * In this program, we use Thread.currentThread() to get the reference of the current
 * executing thread (which is the main thread) and then use getName() to display its name.
 *
 * Note:
 * ------
 * From this program, it is clear that 'main' is a Thread, and it is responsible for
 * executing the entire main method.
 */

public class MainThread {
    public static void main(String[] args) {
        // Getting the reference of the current executing thread
        Thread thread = Thread.currentThread(); // static factory method
        System.out.println("Current Thread Name is: " + thread.getName());

        // OR using method chaining
        String name = Thread.currentThread().getName();
        System.out.println("Name of the current thread is: " + name);
    }
}
