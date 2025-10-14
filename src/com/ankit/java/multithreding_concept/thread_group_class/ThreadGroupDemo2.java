package com.ankit.java.multithreding_concept.thread_group_class;

/**
 * ***** ThreadGroup Advanced Example *****
 *
 * This program demonstrates how multiple ThreadGroups can be created
 * and used to manage different sets of threads.
 *
 * Concept:
 *  - Each ThreadGroup represents a logical group of threads.
 *  - We can create separate groups (e.g., Tatkal, Premium Tatkal)
 *    to differentiate thread responsibilities.
 *  - Each thread belongs to exactly one group.
 *
 * Also shown:
 *  - How to get the main thread and print its group information.
 */



/**
 * The Tatkal class represents a thread task that simulates booking
 * a ticket under the "Tatkal" scheme.
 */
class Tatkal implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " has booked the ticket under Tatkal Scheme");
    }
}

/**
 * The PremiumTatkal class represents a thread task that simulates booking
 * a ticket under the "Premium Tatkal" scheme.
 */
class PremiumTatkal implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " has booked the ticket under Premium Tatkal Scheme");
    }
}

/**
 * The ThreadGroupDemo2 class demonstrates creating and running threads
 * in multiple thread groups.
 */
public class ThreadGroupDemo2 {

    public static void main(String[] args) {

        // Creating two separate thread groups
        ThreadGroup tatkal = new ThreadGroup("Tatkal");
        ThreadGroup premiumTatkal = new ThreadGroup("Premium Tatkal");

        // Creating threads under Tatkal group
        Thread t1 = new Thread(tatkal, new Tatkal(), "Scott");
        t1.start();

        // Creating threads under Premium Tatkal group
        Thread t2 = new Thread(premiumTatkal, new PremiumTatkal(), "Allen");
        t2.start();

        Thread t3 = new Thread(premiumTatkal, new PremiumTatkal(), "Ravi");
        t3.start();
    }
}




