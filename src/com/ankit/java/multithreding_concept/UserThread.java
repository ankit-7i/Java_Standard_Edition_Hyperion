package com.ankit.java.multithreding_concept;

/**
 Creating a thread by extending Thread class approach :
 ------------------------------------------------------
 In Java, we can create a new thread by extending the predefined Thread class
 and overriding its run() method. The run() method contains the code that represents
 the task to be performed by the newly created thread.

 Whenever we call start() method, a new thread will be created and its run() method
 will be executed by the JVM on that new thread.
 */

class Test extends Thread
{
    @Override
    public void run()
    {
        // We should write the task which we want to perform from our user thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("User thread is running... " + i);
            try {
                Thread.sleep(500); // simulate work
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class UserThread
{
    public static void main(String[] args)
    {
        System.out.println("Main thread started!!!");

        Test t1 = new Test();  // create new thread
        t1.start();            // start new thread (invokes run() in new thread)

        System.out.println("Main thread ended!!!");
    }
}

/**
 CPU Execution Flow :
 --------------------
 CPU
 |
 ------------------------
 |                      |
 main()                run()
 |                      |
 main thread           Thread-0 (user thread)


 Note :
 ------
 When the start() method is called, a new thread (Thread-0) is created and
 its run() method executes independently of the main thread.
 Hence, both main() and run() methods run concurrently.
 */

