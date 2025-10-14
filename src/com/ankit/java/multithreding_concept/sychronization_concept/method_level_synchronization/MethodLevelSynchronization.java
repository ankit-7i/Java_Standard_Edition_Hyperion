package com.ankit.java.multithreding_concept.sychronization_concept.method_level_synchronization;

class Table {
    public synchronized void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Thread is Interrupted");
            }
        }
        System.out.println("...............................");
    }
}

public class MethodLevelSynchronization {
    public static void main(String[] args) {
        Table obj = new Table(); // lock is created

        Thread t1 = new Thread() {
            @Override
            public void run() {
                obj.printTable(5);
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                obj.printTable(9);
            }
        };

        t1.start();
        t2.start();
    }
}
