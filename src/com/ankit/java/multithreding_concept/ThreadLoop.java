package com.ankit.java.multithreding_concept;
/**
 * Demonstrates the behavior of multithreading and thread scheduling in Java.
 *
 * <p>This example shows how both the main thread and a child thread execute
 * concurrently. The CPU frequently switches between threads, resulting in
 * unpredictable output order.
 */
class Sample extends Thread {

    /**
     * The run() method contains the code that executes when the thread starts.
     * It prints the thread name and the current iteration number.
     */
    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " by " + name + " thread");
        }
    }
}

/**
 * The ThreadLoop class contains the main() method where both
 * the main thread and the child thread run simultaneously.
 */
public class ThreadLoop {

    /**
     * The main() method starts a child thread and runs its own loop concurrently.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.start();  // Starting the child thread

        String name = Thread.currentThread().getName();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " by " + name + " thread!!");
        }

        int x = 1;
        do {
            System.out.println("Hello Java");
            x++;
        } while (x <= 10);
    }
}

/**
 * NOTE:
 * The processor frequently switches between the main thread and the child (Thread-0),
 * so the output order is unpredictable.
 *
 * <p>Thread scheduling is handled by the Thread Scheduler, which decides
 * which thread gets CPU time. This makes the exact execution sequence non-deterministic.
 */

