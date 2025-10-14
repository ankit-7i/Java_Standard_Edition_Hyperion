package com.ankit.java.multithreding_concept.sychronization_concept.block_level_synchronization;

/**
 * This program demonstrates block-level synchronization in Java.
 *
 * Each thread executes the printThreadName() method,
 * where a synchronized block ensures that only one thread
 * can execute the printing logic at a time on the same object.
 *
 * Note:
 * From the above two programs, it is clear that synchronization logic
 * will perfectly work with a single object.
 */

class PrintThread {
    public void printThreadName() {
        String name = Thread.currentThread().getName();
        System.out.println("Thread Name is: " + name);

        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " by " + name + " thread");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.err.println("Thread is Interrupted");
                }
            }
            System.out.println("Synchronized block ended!!");
        }
    }
}

public class BlockLevelSynchronization {
    public static void main(String[] args) {
        PrintThread pt = new PrintThread(); // lock is created

        Runnable r1 = () -> pt.printThreadName();

        Thread t1 = new Thread(r1, "Child1");
        Thread t2 = new Thread(r1, "Child2");

        t1.start();
        t2.start();
    }
}

