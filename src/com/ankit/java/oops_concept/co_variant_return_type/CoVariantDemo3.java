package com.ankit.java.oops_concept.co_variant_return_type;
import java.util.Scanner;

// Super class
class Super {
    // Method returns Object type
    public Object m1() {
        System.out.println("M1 method of Super class");
        return new Object();
    }
}

// Sub class
class Sub extends Super {
    @Override
    // ❌ Error: Return type 'Scanner' is not covariant with 'Object'
    // Covariant return type requires that return type must be same
    // OR a subclass of the parent’s return type.
    // But here, Scanner is not a subclass of Object in this overriding context.
    public Scanner m1() {
        System.out.println("M1 method of Sub class");
        return null;
    }
}

public class CoVariantDemo3 {
    public static void main(String[] args) {
        Super s1 = new Sub();
        s1.m1();
    }
}

/*
 * Explanation:
 * ------------
 * - Super.m1() returns Object.
 * - Sub.m1() tries to return Scanner.
 *
 * Problem:
 * - While every class (including Scanner) extends Object,
 *   Java does not allow changing the return type arbitrarily.
 * - The return type must be covariant:
 *     Subclass return type ⊆ Superclass return type.
 *
 * Example of valid covariant return:
 *   Super.m1() -> Object
 *   Sub.m1()   -> String  (✅ valid, because String IS-A Object)
 *
 * But:
 *   Super.m1() -> Object
 *   Sub.m1()   -> Scanner (❌ invalid, because Scanner is not guaranteed to be used where Object is expected in overriding context).
 *
 * ⚠️ Important Rule:
 * - Covariant return type works only when the overriding method returns
 *   a subtype that maintains type compatibility in method overriding.
 */
