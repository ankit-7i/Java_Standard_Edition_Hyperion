package com.java_logical_program_section.stream_api_logical_section;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FIndDuplicate {
    public static void main(String[] args) {
        List<Integer> arr  = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1,2,3);

        Set<Integer> duplicate = new HashSet<>();

        arr.stream()
                .filter(n -> !duplicate.add(n))
                .forEach(System.out::println);

    }
}
