package com.ankit.java.multithreding_concept.basic.set_and_get_name_of_thread;

/**
 * Topic: How to set and get the name of the Thread
 *
 * ---------------------------------------------------------------
 * 👉 Whenever we create a thread, JVM assigns a default name:
 *     Thread-0, Thread-1, Thread-2, and so on.
 *
 * 👉 If a developer wants to assign a custom (user-defined) thread name,
 *     we can use the following methods of the Thread class:
 *
 *     - setName(String name) → used to set a user-defined thread name.
 *     - getName() → used to retrieve the thread name.
 *
 * Example below demonstrates both.
 * ---------------------------------------------------------------
 */


// Example 1: Demonstrating default thread names
class Dostuff extends Thread {

    @Override
    public void run() {
        // Getting the current thread's name using Thread.currentThread().getName()
        String name = Thread.currentThread().getName();
        System.out.println("Running Thread name is : " + name);
    }
}

public class ThreadName1 {

    public static void main(String[] args) {

        // Creating and starting threads without assigning names
        // So JVM will assign default names: Thread-0, Thread-1, etc.
        Dostuff df1 = new Dostuff();
        df1.start();

        Dostuff df2 = new Dostuff();
        df2.start();

        // Printing the current thread (main thread) name
        System.out.println("Current thread name is : " + Thread.currentThread().getName());
    }
}

/**
 * Output:
 *  Running Thread name is : Thread-0
 *  Running Thread name is : Thread-1
 *  Current thread name is : main
 *
 * We are not providing user-defined names,
 * so JVM assigns default names (Thread-0, Thread-1, ...).
 * --------------------------------------------------------------------
 */

