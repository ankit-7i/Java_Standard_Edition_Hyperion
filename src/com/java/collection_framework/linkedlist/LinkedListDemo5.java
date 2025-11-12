package com.java.collection_framework.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo5 {
    public static void main(String[] args) {
        LinkedList<String> train = new LinkedList<>();

        train.add("Coach A");
        train.add("Coach B");
        train.add("Coach C");
        System.out.println("Initial Train: " + train);

        train.addFirst("Engine");
        System.out.println("After adding Engine at front: " + train);

        train.addLast("Guard Coach");
        System.out.println("After adding Guard Coach at end: " + train);

        train.add(2, "Pantry Coach");
        System.out.println("After adding Pantry Coach in middle: " + train);

        System.out.println("Reached to destination!");

        train.removeFirst();
        System.out.println("After removing first Coach: " + train);

        train.removeLast();
        System.out.println("After removing last Coach: " + train);

        train.remove(1);
        System.out.println("After removing Pantry Coach from middle: " + train);
    }
}
