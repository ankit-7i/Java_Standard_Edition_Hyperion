package com.java.collection_framework.linkedlist;

import java.util.*;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        final int ITERATION = 100000;

        long startTime = System.currentTimeMillis();

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < ITERATION; i++) {
            al.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by ArrayList class : " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < ITERATION; i++) {
            list.add(0, i);
        }

        endTime = System.currentTimeMillis();
        System.out.println("Time taken by LinkedList class : " + (endTime - startTime) + " ms");

        System.out.println("\nNote: LinkedList is best for frequent insertion and deletion.");
    }
}
