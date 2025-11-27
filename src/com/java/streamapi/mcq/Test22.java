package com.java.streamapi.mcq;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test22 {
    public static void main(String[] args)
    {
        List<List<String>> data = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"));

        List<String> result = data.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
