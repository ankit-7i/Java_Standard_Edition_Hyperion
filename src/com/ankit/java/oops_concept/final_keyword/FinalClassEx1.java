package com.ankit.java.oops_concept.final_keyword;

/*
 * Example: Final Class
 * ---------------------
 * If a class is declared final:
 *  → Inheritance is not possible.
 *
 * Use-case:
 * - When the class is important, stable, and its functionality should not be changed.
 * - Example: String and Wrapper classes are final in Java.
 */


// Final class
final class Test {
    private int data = 100;

    public Test(int data) {
        this.data = data;
        System.out.println("Data value is: " + data);
    }
}

public class FinalClassEx1 {
    public static void main(String[] args) {
        Test t1 = new Test(200); // ✅ Allowed (object creation is fine)
    }
}

