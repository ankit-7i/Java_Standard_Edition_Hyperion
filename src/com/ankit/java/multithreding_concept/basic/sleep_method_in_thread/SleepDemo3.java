package com.ankit.java.multithreding_concept.basic.sleep_method_in_thread;


/**
 * public final long threadId()
 * ------------------------------
 * This is a new method introduced in **JDK 19**.
 *
 * ✅ Purpose:
 * - It provides the **ID of the current thread**.
 *
 * ❌ Previously:
 * - We used `getId()` to get the thread ID, but `getId()` is **not final**.
 * - So, it is **deprecated from JDK 19** onward.
 *
 * ✅ Now:
 * - Use `threadId()`, which is a **final method** for retrieving the thread ID.
 *
 * 📝 Note:
 * - Both `getId()` and `threadId()` serve the same purpose (retrieving thread ID).
 */


// Custom thread class
class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread is running");

        long id = Thread.currentThread().threadId();
        System.out.println("Id of child thread is :" + id);
    }
}

public class SleepDemo3 {
    public static void main(String[] args) {
        System.out.println("Main thread is Started");

        Thread t = Thread.currentThread();
        System.out.println("Id of main thread is :" + t.getId());  // Deprecated in JDK 19

        MyThread1 mt = new MyThread1();
        mt.start();

        try {
            mt.sleep(4000);  // Main thread will sleep here for 4 seconds
            // Alternatively: Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is Ended");
    }
}

