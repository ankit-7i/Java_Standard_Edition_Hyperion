package com.ankit.java.multithreding_concept.anonymous_inner_class_by_using_thread;

public class AnonymousInnerClassWithReference {
    public static void main(String[] args) {
        // Anonymous Inner Class
        Thread t1 = new Thread() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println("Running thread name is: " + name);
            }
        };
        t1.start();
    }
}
