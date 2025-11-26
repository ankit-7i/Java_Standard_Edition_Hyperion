package com.java.streamapi.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumber {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};

        List<Integer> UniqueNumber = Arrays.stream(numbers)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(UniqueNumber);
    }
}
