package com.java_logical_program_section.stream_api_logical_section;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElement {
    public static void main(String[] args) {
        List<Integer> numberlist = Arrays.asList(1,2,3,4,5,6,7,7,5);

        Set<Integer> uniqueOne = new HashSet<>();
        Set<Integer> duplicates = numberlist.stream()
                .filter(n->!uniqueOne.add(n))
                .collect(Collectors.toSet());
        System.out.println(duplicates);

    }
}
