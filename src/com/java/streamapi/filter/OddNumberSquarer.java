package com.java.streamapi.filter;

import java.util.stream.Stream;

public class OddNumberSquarer {
    public static void main(String[] args) {

        Stream.iterate(1, n -> n + 1)   // infinite stream of natural numbers
                .filter(n -> n % 2 != 0)  // keep only odd numbers
                .map(n -> n * n)          // square them
                .limit(10)                // take first 10
                .forEach(System.out::println);


    }

}
