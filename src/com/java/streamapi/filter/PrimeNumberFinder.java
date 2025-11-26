package com.java.streamapi.filter;

import java.util.Arrays;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Arrays.stream(numbers)
                .filter(PrimeNumberFinder::isPrime)
                .forEach(System.out::println);
    }
    private static boolean isPrime(Integer num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
