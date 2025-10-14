package com.ankit.java.multithreding_concept.sychronization_concept.static_sychronization;

/**
 * ***** Static Synchronization *****
 *
 * If we declare any method with static and synchronized keyword,
 * then it is called static synchronization.
 *
 * Example:
 *   public static synchronized void printTable(int num)
 *
 * → In order to call this method, Object is not required;
 *   we can directly call it with the help of the class name.
 *
 * → The thread that wants to enter inside the synchronized area
 *   will acquire the lock from the corresponding class.
 *
 * → Unlike objects, we cannot create multiple class-level locks in the same package.
 *
 * To work with block-level synchronization, we can use the following statement:
 *   synchronized(Table.class) {
 *       // code block
 *   }
 */



/**
 * The Table class demonstrates static synchronization in Java.
 * Static synchronized methods lock on the class itself
 * (not on any specific object).
 */
 class Table {

    /**
     * Prints the multiplication table of the given number.
     * This method is declared as static and synchronized,
     * so it will acquire a class-level lock on Table.class.
     *
     * @param num the number whose multiplication table will be printed
     */
    public static synchronized void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Thread has been interrupted!!");
            }
        }
        System.out.println(".......................");
    }
}

/**
 * The StaticSynchronization class contains the main method
 * that creates multiple threads to demonstrate how
 * static synchronization ensures one thread executes
 * the synchronized method at a time (class-level lock).
 */


public class StaticSynchronization {

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                Table.printTable(5);
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                Table.printTable(10);
            }
        };

        Thread t3 = new Thread() {
            @Override
            public void run() {
                Table.printTable(15);
            }
        };

        t1.start();
        t2.start();
        t3.start();
    }
}

