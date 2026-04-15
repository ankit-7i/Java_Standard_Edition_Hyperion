package com.java_logical_program_section.stream_api_logical_section;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingLIstDescendingOrderandAscendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,5,1,2,10);

        List<Integer> descSortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(descSortedNumbers);

    }
}
