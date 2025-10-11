package com.ankit.java.multithreding_concept.join_method_usage;

class Join extends Thread
{
    @Override
    public void run()
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Thread started");

        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i + " by " + name + " thread");

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }

        System.out.println(name + " thread completed!!!");
    }
}

public class JoinDemo1
{
    public static void main(String[] args)
    {
        System.out.println("Main Thread Started!!!");

        Join j1 = new Join();
        Join j2 = new Join();
        Join j3 = new Join();

        j1.setName("J1");
        j2.setName("J2");
        j3.setName("J3");

        j1.start();
        try
        {
            j1.join(); // main thread is waiting for j1 thread to complete
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Main thread wake up");

        j2.start();
        j3.start();

        System.out.println("Main Thread Ended!!!");
    }
}
