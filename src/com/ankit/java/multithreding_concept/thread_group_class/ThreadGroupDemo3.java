package com.ankit.java.multithreding_concept.thread_group_class;

public class ThreadGroupDemo3 {
    public static void main(String[] args) {

        // Get the currently running thread (main thread)
        Thread t = Thread.currentThread();

        // Display the thread details
        System.out.println(t.toString());
    }
}

/**
 * Note:
 * From the above program, it is clear that the main thread
 * is running under the "main" ThreadGroup.
 */
