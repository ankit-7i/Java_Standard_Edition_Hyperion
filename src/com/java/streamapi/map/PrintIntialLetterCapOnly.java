package com.java.streamapi.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintIntialLetterCapOnly {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abcd","xyz","edis","prsr","krde");
        stringList.stream()
                        .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                                .forEach(System.out::println);



    }
}
