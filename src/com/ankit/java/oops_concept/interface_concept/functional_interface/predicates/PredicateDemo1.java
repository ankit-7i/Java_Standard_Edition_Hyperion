package com.ankit.java.oops_concept.interface_concept.functional_interface.predicates;

import java.util.Scanner;
import java.util.function.Predicate;


/**
 * 🔹 What is Predicate<T>?
 * @FunctionalInterface
 * public interface Predicate<T> {
 *     boolean test(T t);
 * }
 *
 *
 * Purpose: It is used to evaluate a boolean condition on a single argument.
 *
 * Common use case: Filtering data or validating conditions.
 *
 */
public class PredicateDemo1 {
    public static void main(String[] args) {
        // Verify whether a person is eligible for Voting or not

        Predicate<Integer> p1 = age -> age >= 18;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int myAge = Integer.parseInt(sc.nextLine());

        System.out.println("Are you eligible for voting: " + p1.test(myAge));
        sc.close();
    }
}

