package com.ankit.java.multithreding_concept.anonymous_inner_class_by_using_thread;

public class AnonymousInnerClassWithoutReference {
    public static void main(String[] args) {
        // Anonymous Inner Class (AIC) without reference
        new Thread() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println("Name of the Thread is: " + name);
            }
        }.start();
    }
}

