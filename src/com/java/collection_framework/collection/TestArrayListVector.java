package com.java.collection_framework.collection;

import java.util.Vector;
import java.util.ArrayList;

public class TestArrayListVector {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Vector<Integer> v = new Vector<Integer>();
        for (int i = 1; i <= 1000000; i++) {
            v.add(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by Vector class is : " + (endTime - startTime) + " ms");

        System.out.println("..............................");

        startTime = System.currentTimeMillis();


        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i <= 1000000; i++) {
            al.add(i);
        }

        endTime = System.currentTimeMillis();
        System.out.println("Time taken by ArrayList class is : " + (endTime - startTime) + " ms");
    }
}
