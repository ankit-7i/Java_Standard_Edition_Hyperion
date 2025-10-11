package com.ankit.java.multithreding_concept.join_method_usage;

/**
 * Example demonstrating the use of join() method in a nested thread scenario.
 *
 * - Alpha thread starts the Beta thread.
 * - Alpha thread waits (joins) until Beta thread finishes.
 * - After Beta finishes, Alpha resumes execution.
 */

class Alpha extends Thread {

    @Override
    public void run() {
        // Get current thread reference
        Thread t = Thread.currentThread();
        String name = t.getName(); // "Alpha_Thread" is the current thread
        System.out.println(name + " started!!!");

        // Create and start Beta thread
        Beta b1 = new Beta();
        b1.setName("Beta_Thread");
        b1.start();

        try {
            // Alpha thread is waiting for Beta thread to complete
            b1.join();
            System.out.println("Alpha thread re-started");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Alpha thread resumes execution
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " by " + name);
        }
    }
}

/**
 * The main class that starts the Alpha thread.
 */
public class JoinDemo2 {

    public static void main(String[] args) {
        // Create Alpha thread
        Alpha a1 = new Alpha();
        a1.setName("Alpha_Thread");

        // Start Alpha thread
        a1.start();
    }
}

/**
 * Beta thread executes first and Alpha waits for it using join().
 */
class Beta extends Thread {

    @Override
    public void run() {
        // Get current thread reference
        Thread t = Thread.currentThread();
        String name = t.getName(); // "Beta_Thread"
        System.out.println(name + " started!!!");

        // Beta thread runs a loop with delay
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " by " + name);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Beta Thread Ended");
    }
}
