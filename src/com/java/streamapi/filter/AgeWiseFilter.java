package com.java.streamapi.filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

record Person(Integer pid, String name, Integer age) {
}

public class AgeWiseFilter {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "Alice", 25));
        personList.add(new Person(2, "Bob", 30));
        personList.add(new Person(3, "Charlie", 22));

        personList.forEach(System.out::println);

        //Age Wise Ordering

        personList.sort(Comparator.comparingInt(Person::age));
        personList.forEach(System.out::println);

        personList.stream().sorted(Comparator.comparingInt(Person::age).reversed());
        System.out.println(personList);

    }
}