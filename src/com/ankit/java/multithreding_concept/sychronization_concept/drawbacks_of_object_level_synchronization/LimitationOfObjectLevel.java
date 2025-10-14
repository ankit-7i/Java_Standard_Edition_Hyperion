package com.ankit.java.multithreding_concept.sychronization_concept.drawbacks_of_object_level_synchronization;

/**
 * This program demonstrates the limitation of object-level synchronization.
 *
 * When multiple objects are created, each has its own lock.
 * Therefore, synchronization logic will not work correctly
 * across multiple objects since each thread can acquire a
 * different lock and run simultaneously.
 *
 * Note:
 * From the above program, it is clear that synchronization logic
 * will not work with multiple objects.
 *
 * To solve the problem of object-level synchronization,
 * Java introduced another concept called "Static Synchronization".
 */
class Table {
    public synchronized void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Thread has Interrupted!!");
            }
        }
        System.out.println("...............................");
    }
}



public class LimitationOfObjectLevel {
    public static void main(String[] args) {
        Table obj1 = new Table(); // lock1
        Table obj2 = new Table(); // lock2

        Thread t1 = new Thread() {
            @Override
            public void run() {
                obj1.printTable(5); // lock1
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                obj1.printTable(7); // lock1
            }
        };

        Thread t3 = new Thread() {
            @Override
            public void run() {
                obj2.printTable(12); // lock2
            }
        };

        Thread t4 = new Thread() {
            @Override
            public void run() {
                obj2.printTable(15); // lock2
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
