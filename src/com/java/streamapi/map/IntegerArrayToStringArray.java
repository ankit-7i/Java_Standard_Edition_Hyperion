package com.java.streamapi.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerArrayToStringArray {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50};

        //Converted Strings: [Number: 10, Number: 20, Number: 30, Number: 40, Number: 50]
        List<String> ConvertIntToString = Arrays.stream(numbers)
                                                        .map(num -> "Number : "+num)
                                                                        .collect(Collectors.toList());
        System.out.println("Converted To String "+ConvertIntToString);
    }
}
