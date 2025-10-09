package com.ankit.java.multithreding_concept.basic;

/**
 * public synchronized void start():
 * ------------------------------------------
 * It is a predefined non-static method of the Thread class.
 * It is mainly used to perform the following two tasks:
 *
 * a) It will make a request to the Operating System to assign a new thread
 *    for concurrent execution.
 *
 * b) It will implicitly call the run() method on the current object.
 *
 * In a multithreading concept, start() is the only method responsible
 * to create a new thread and begin its execution.
 */

/**
 * UserThread class extends Thread and overrides the run() method.
 * When this thread is started, the run() method executes in a separate thread.
 */
class UserThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Child thread is running!!!");
    }
}

/**
 * CustomThread class demonstrates the working of the start() method.
 * It creates a child thread and runs it concurrently with the main thread.
 */
public class CustomThread {

    public static void main(String[] args) {

        System.out.println("Main thread started!!!");

        // Creating a new thread object
        UserThread1 ut = new UserThread1();

        // Starting the child thread
        ut.start();

        System.out.println("Main thread ended!!!");
    }
}

/**
 * In the above program:
 * ---------------------------
 * We have two threads:
 *   1. Main thread → responsible to execute main() method.
 *   2. Child thread → responsible to execute run() method.
 *
 * The start() method is responsible for assigning a new thread for
 * concurrent execution and automatically invokes the run() method.
 */

