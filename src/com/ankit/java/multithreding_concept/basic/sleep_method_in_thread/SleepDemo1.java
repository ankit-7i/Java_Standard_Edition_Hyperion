package com.ankit.java.multithreding_concept.basic.sleep_method_in_thread;


/**
 * public static void sleep(long millisecond) throws InterruptedException
 * ---------------------------------------------------------------------
 * It is a predefined static method of the Thread class.
 *
 * The main purpose of sleep() is to put the thread into a temporarily
 * waiting state. The waiting period depends on the argument passed
 * by the user in milliseconds.
 *
 * Example:
 *     Thread.sleep(1000); // The thread will wait here for 1 second.
 *
 * It throws a checked exception: InterruptedException.
 * This is because there might be a chance that the sleeping thread
 * is interrupted by another thread. Therefore, we must handle it
 * either using try-catch or by declaring the method with 'throws'.
 */


// Thread class that uses sleep
class Sleep extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        for (int i = 1; i <= 10; i++) {
            System.out.println("i value is :" + i + " by " + name + " thread");

            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                System.err.println("Thread is Interrupted");
            }
        }
    }
}

// Main class
public class SleepDemo1 {
    public static void main(String[] args) {
        Sleep s1 = new Sleep();
        s1.setName("Child1");
        s1.start();
    }
}

