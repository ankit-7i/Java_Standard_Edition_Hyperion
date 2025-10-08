package com.ankit.java.multithreding_concept;

/**
 * public final boolean isAlive():
 * ------------------------------------
 * As we know when we call start() method, then a new thread will be created in a separate Stack Memory.
 *
 * Thread class has provided a predefined non-static method called isAlive(), return type is boolean.
 * This method is used to verify whether a thread has started or not OR the thread is alive or not. (ThreadGroup)
 *
 * If we use isAlive() method before the start() method then it will return false
 * because Thread has not started yet. On the other hand, if we use isAlive() method after start() method
 * then it will return true.
 *
 * In Java, we cannot re-start a thread. If we try to re-start then it will generate a runtime exception:
 * java.lang.IllegalThreadStateException
 */


/**
 * This class extends Thread and overrides the run() method.
 * When the thread starts, this method will execute in a separate call stack.
 */
class Testt extends Thread {

    @Override
    public void run() {
        System.out.println("Child thread is running...");
        System.out.println("It is running with separate stack memory");
    }
}

/**
 * This class demonstrates the usage of isAlive() method of Thread class.
 */
public class IsAliveDemo {

    public static void main(String[] args) {

        Testt t1 = new Testt();

        // Before calling start(), thread has not yet started
        System.out.println("Child thread not started yet so, : " + t1.isAlive());

        // Starting the thread
        t1.start();

        // After calling start(), thread has started
        System.out.println("Child thread started so, : " + t1.isAlive());

        // Trying to restart the same thread (will cause exception)
        t1.start(); // java.lang.IllegalThreadStateException
    }
}
