package com.java_logical_program_section.stream_api_logical_section;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenAListOfList {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7,8)
        );
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(flattenedList);
    }
}
