package com.ankit.java.oops_concept.wrapper_class_concept.auto_boxing_concept;
/*
Use Integer.valueOf() instead of new Integer().

Java caches values between -128 to +127 for wrapper objects (Integer, Short, Byte, Character, Long).

Always use .equals() for comparing wrapper class objects.
 */
public class AutoBoxing4 {
    public static void main(String[] args) {
        Integer i = 127;
        Integer j = 127;
        System.out.println(i == j); // true (cached values, same object)

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); // false (outside cache range)

        Integer p = 255;
        Integer q = 255;
        System.out.println(p.equals(q)); // true (value comparison)
    }
}

