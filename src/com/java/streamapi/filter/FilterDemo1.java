package com.java.streamapi.filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {
    public static void main(String[] args) {

        List<Integer> listOfNumber = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Without Stream API
        List<Integer> evenList = new ArrayList<>();
        for (Integer num : listOfNumber) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }

        System.out.println("Without Stream API");
        evenList.forEach(System.out::println);

        System.out.println("With Stream API");
        listOfNumber.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}

