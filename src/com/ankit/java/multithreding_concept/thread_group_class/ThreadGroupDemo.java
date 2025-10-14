package com.ankit.java.multithreding_concept.thread_group_class;

/**
 * ***** ThreadGroup Class *****
 *
 * ThreadGroup is a predefined class available in the java.lang package.
 * It is mainly used to execute multiple threads under a particular group.
 *
 * Using ThreadGroup, we can organize multiple threads into a single group
 * to perform related or different operations together.
 *
 * -----------------------------
 * ✅ Constructor:
 * -----------------------------
 * ThreadGroup tg = new ThreadGroup(String groupName);
 *
 * Using this constructor, we can assign a name to the group under which
 * all the threads will execute.
 *
 * -----------------------------
 * ✅ Useful Methods:
 * -----------------------------
 * public String getName()
 *      → Returns the name of the group.
 *
 * public int activeCount()
 *      → Returns how many threads are alive and running under that group.
 *
 * -----------------------------
 * ✅ Thread Constructor with ThreadGroup:
 * -----------------------------
 * Thread t1 = new Thread(ThreadGroup tg, Runnable target, String name);
 *
 * By using ThreadGroup class, multiple threads can be executed
 * under a single logical group.
 */


/**
 * The Test class implements Runnable and represents
 * the task to be executed by threads within a ThreadGroup.
 */
class Test implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // Ignored
        }

        // Get the name of the currently running thread
        String name = Thread.currentThread().getName();

        // Display which thread (student) belongs to the Java Placement batch
        System.out.println(name + " is a Java Placement batch student!!!");
    }
}

/**
 * The ThreadGroupDemo class demonstrates how to use ThreadGroup in Java.
 */
public class ThreadGroupDemo {

    /**
     * The main() method creates a ThreadGroup and runs multiple threads under it.
     *
     * @param args command line arguments
     * @throws InterruptedException if any thread is interrupted
     */
    public static void main(String[] args) throws InterruptedException {

        // Create a new thread group
        ThreadGroup tg = new ThreadGroup("Java_Placement");

        // Create multiple threads under the same thread group
        Thread t1 = new Thread(tg, new Test(), "Scott");
        Thread t2 = new Thread(tg, new Test(), "Smith");
        Thread t3 = new Thread(tg, new Test(), "Allen");
        Thread t4 = new Thread(tg, new Test(), "John");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Display group name and active thread count
        System.out.println("\nGroup Name: " + tg.getName());
        System.out.println("Total number of active threads are: " + tg.activeCount());
    }
}
