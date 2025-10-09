package com.ankit.java.multithreding_concept.basic.sleep_method_in_thread;


/**
 * Demonstrates how multiple threads behave using Thread.sleep().
 * Each thread prints a value from 1 to 5, pausing for 1 second between prints.
 *
 * Key Concepts:
 * - Thread.sleep(milliseconds) pauses the current thread temporarily.
 * - Each thread runs concurrently but may appear interleaved based on the CPU scheduler.
 * - Thread names (M1, M2) are assigned for identification in the output.
 *
 * Output Example (may vary due to thread scheduling):
 *     i value is :1  // M1
 *     i value is :1  // M2
 *     i value is :2  // M1
 *     i value is :2  // M2
 *     ...
 *
 * Notes:
 * - Thread.sleep(1000) causes a 1-second pause after each iteration.
 * - InterruptedException is handled with a try-catch block.
 *
 */




class MyTest extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i value is :" + i);  // M1 M2 output

            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SleepDemo2 {
    public static void main(String[] args) {
        MyTest m1 = new MyTest();
        MyTest m2 = new MyTest();

        m1.setName("M1");
        m2.setName("M2");

        m1.start();
        m2.start();
    }
}

