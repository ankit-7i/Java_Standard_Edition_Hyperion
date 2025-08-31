package com.ankit.java.oops_concept.wrapper_class_concept.auto_boxing_concept;
/*
* 📘 Notes on Integer.valueOf() and Caching in Wrapper Classes

Integer.valueOf(int) and Integer.valueOf(String) methods are used to create Integer objects.

Example:

Integer a = Integer.valueOf(15);
Integer b = Integer.valueOf("25");
Integer c = Integer.valueOf("111", 36); // Here base (radix) can be up to 36


Integer caching mechanism:

Integer class maintains a cache of values from -128 to +127.

When you assign values within this range, Java reuses the same object instead of creating a new one.

So == (reference equality) returns true for values within -128 to +127, but false beyond that range.

Best practice:

Always use .equals(Object obj) for comparison of wrapper objects.

Do not rely on == because it checks reference equality, not value equality.

⚠️ Note: new Integer(int val) is deprecated (marked for removal). Use Integer.valueOf(int) instead.
 * */
// Integer.valueOf(String str)
// Integer.valueOf(String str, int radix/base)

public class AutoBoxing3 {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(15);
        Integer b = Integer.valueOf("25");
        Integer c = Integer.valueOf("111", 36); // Here Base can be up to 36

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

