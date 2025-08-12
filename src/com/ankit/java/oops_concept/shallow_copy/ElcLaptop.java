package com.ankit.java.oops_concept.shallow_copy;

public class ElcLaptop {
    public static void main(String[] args) {
            Laptop lap = new Laptop(90000);
            System.out.println("Before Modification price is: " + lap.getPrice());

            accept(lap);
            System.out.println("After Modification price is: " + lap.getPrice());
        }

        public static void accept(Laptop laptop) {
            laptop.setPrice(95000);
        }
}
/*This program demonstrates the concept of shallow copy or pass-by-reference behavior in Java. When an object is passed to a method, the reference to the object is passed, so modifications inside the method affect the original object.*/


