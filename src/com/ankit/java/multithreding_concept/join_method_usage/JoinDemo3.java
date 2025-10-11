package com.ankit.java.multithreding_concept.join_method_usage;

public class JoinDemo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 10; i++)
                System.out.println("Child thread i: " + i);
        });

        t.start();
        t.join(); // main waits for child to finish
        System.out.println("Main Thread ended");
    }
}

