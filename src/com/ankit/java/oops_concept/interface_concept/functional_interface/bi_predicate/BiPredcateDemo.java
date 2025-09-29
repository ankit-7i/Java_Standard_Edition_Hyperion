package com.ankit.java.oops_concept.interface_concept.functional_interface.bi_predicate;

public class BiPredicateDemo
{
    public static void main(String[] args)
    {
        // BiPredicate to check if the sum of two integers is even
        BiPredicateDemo isSumEven = (a, b) -> (a + b) % 2 == 0;

        System.out.println(isSumEven.test(2, 3));
        System.out.println(isSumEven.test(5, 7));
    }
}