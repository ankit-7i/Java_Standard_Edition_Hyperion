package com.ankit.java.multithreding_concept.basic.set_and_get_name_of_thread;


// Example 2: Demonstrating user-defined thread names

/**
 * In this example, we assign our own custom names to threads
 * using the setName() method and fetch them using getName().
 */
class Demo extends Thread {

    @Override
    public void run() {
        System.out.println("Running Thread name is : " + Thread.currentThread().getName());
    }
}

class ThreadName2 {

    public static void main(String[] args) {

        // Creating threads
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        // Setting user-defined thread names
        d1.setName("Alpha");
        d2.setName("Beta");

        // Starting threads
        d1.start();
        d2.start();

        // Printing current thread name (main)
        System.out.println("Current thread name is : " + Thread.currentThread().getName());
    }
}

/**
 * Output:
 *  Running Thread name is : Alpha
 *  Running Thread name is : Beta
 *  Current thread name is : main
 *
 * ✅ Here we assigned user-defined names using setName().
 * ✅ getName() returns the thread’s current name.
 */
