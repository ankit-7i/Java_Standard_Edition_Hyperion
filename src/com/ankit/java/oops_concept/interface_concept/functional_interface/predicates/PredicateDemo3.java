package com.ankit.java.oops_concept.interface_concept.functional_interface.predicates;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo3 {
    public static void main(String[] args) {
        // Verify whether my name is Ravi or not

        Predicate<String> p3 = str -> str.equals("Ravi");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name :");
        String name = sc.nextLine();

        System.out.println("Are you Ravi :" + p3.test(name));
        sc.close();
    }
}

