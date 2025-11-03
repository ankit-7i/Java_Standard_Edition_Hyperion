package com.ankit.java.array_concept.comparable_and_comparetor;

import java.util.Arrays;

public class ComparableDemo1 {
    public static void main(String[] args) {
        String[] fruits = {"Orange", "Apple", "Mango"};

        // Custom sorting in descending order using lambda
        Arrays.sort(fruits, (s1, s2) -> s2.compareTo(s1));

        System.out.println(Arrays.toString(fruits));
    }
}

/*
 Note:
 The String class already implements Comparable<String> using compareTo() logic
 written by Java developers (lexicographical order).
 To provide a custom sorting logic (like reverse order), we use a Comparator.
*/
