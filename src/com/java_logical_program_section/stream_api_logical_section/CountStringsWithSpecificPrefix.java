package com.java_logical_program_section.stream_api_logical_section;

import java.util.Arrays;
import java.util.List;

public class CountStringsWithSpecificPrefix {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ankit", "bob", "clark", "donald", "enna", "alex");
        long count = names.stream()
                .filter(name -> name.startsWith("a"))
                .count();
        System.out.println(count);
    }
}
