package com.ankit.java.oops_concept.interface_concept.functional_interface.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {

        // Example: Find the length of the given city name
        // Function<InputType, ReturnType>
        // Here: Input is String (city name), Output is Integer (length of string)
        Function<String, Integer> fn2 = city -> city.length();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your city name : ");

        // Reading city name as input
        String cityName = sc.nextLine();

        // apply(T t) method executes the function and returns the length of the city name
        System.out.println("Length of " + cityName + " is : " + fn2.apply(cityName));

        sc.close();
    }
}
