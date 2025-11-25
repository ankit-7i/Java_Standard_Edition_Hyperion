package com.java.streamapi.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayUsingStream {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,76,67,89};

        List<Integer> sortedList = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());


        System.out.println("Output : " + sortedList);

    }
}
