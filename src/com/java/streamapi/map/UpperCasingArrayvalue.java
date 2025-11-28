package com.java.streamapi.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCasingArrayvalue {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ankit","ashok","pinaki");
        stringList.stream().map(str->str.toUpperCase()).forEach(System.out::println);

    }
}
