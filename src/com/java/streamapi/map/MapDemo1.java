package com.java.streamapi.map;



import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Original Number: " + listOfNumbers);

        listOfNumbers.stream()
                .map(num -> num + 18)
                .forEach(System.out::println);

        List<Integer> immutableList = List.of(1,2,3,4,6,2,4,6,8);

        System.out.println("Cube of all unique even numbers:");
        immutableList.stream()
                .distinct()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num * num)
                .forEach(System.out::println);
    }
}
