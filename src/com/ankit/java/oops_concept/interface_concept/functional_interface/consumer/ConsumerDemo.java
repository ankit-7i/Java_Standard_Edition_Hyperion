package com.ankit.java.oops_concept.interface_concept.functional_interface.consumer;

// Consumer<T> functional interface :
// ----------------------------------------------------
// * It is a predefined functional interface available in java.util.function sub package.
// * Annotated with @FunctionalInterface
// * It contains one abstract method : void accept(T x);
// * It is mainly used to accept OR consume a single value without returning anything (void)



import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        // Consumer<Integer> : consumes Integer value and prints it
        Consumer<Integer> c1 = num -> System.out.println("Integer value :" + num);
        c1.accept(12);  // passing integer 12

        // Consumer<String> : consumes String value and prints it
        Consumer<String> c2 = str -> System.out.println("String value :" + str);
        c2.accept("NIT");  // passing string "NIT"

        // Consumer<Float> : consumes Float value and prints it
        Consumer<Float> c3 = flt -> System.out.println("Float value :" + flt);
        c3.accept(12F);  // passing float 12.0

        // Consumer<Boolean> : consumes Boolean value and prints it
        Consumer<Boolean> c4 = boolType -> System.out.println("Boolean value :" + boolType);
        c4.accept(true);  // passing boolean true

        // Consumer<Customer> : consumes custom object (Customer record) and prints it
        Consumer<Customer> c5 = cust -> System.out.println("Customer is :" + cust);
        c5.accept(new Customer(101, "Alen"));  // passing new Customer object
    }
}

// Custom record (immutable data class) for Customer
record Customer(Integer id, String name) {}

