package com.ankit.java.oops_concept.interface_concept.functional_interface.predicates;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        // Verify whether my name starts with character 'A' or not

        Predicate<String> p2 = str -> str.startsWith("A");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name :");
        String name = sc.nextLine();

        System.out.println("Does the name " + name + " start with 'A' :" + p2.test(name));
        sc.close();
    }
}

