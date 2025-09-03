package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism;

/*
 * Can we override private method?
 * --------------------------------
 * No, we cannot override private methods of a superclass because:
 *  - Private methods are not visible (not accessible) to subclasses.
 *  - Hence, they cannot be overridden.
 *
 * If we declare a method with the same name in the subclass, it is NOT overriding;
 * instead, it is just a new declaration (method hiding by re-declaration).
 *
 * Key points:
 * 1. Private methods are accessible only within the class where they are defined.
 * 2. Subclass can declare a method with the same name/signature,
 *    but that does NOT count as overriding — it's treated as a completely new method.
 * 3. @Override annotation cannot be used in this case, since no actual overriding happens.
 */

class Super {
    private void m1() {   // private → not inherited by Sub
        System.out.println("Super class private method");
    }
}

class Sub extends Super {
    // This is NOT overriding — it is a NEW method declaration
    public void m1() {
        System.out.println("Sub class public method");
    }
}

public class OverridingDemo7 {
    public static void main(String[] args) {
        // Super s1 = new Sub();
        // s1.m1();   // ❌ Compilation error → cannot access private method from Super

        // This will call Sub's version of m1(), because it is a separate method
        new Sub().m1();  // ✅ Output: Sub class public method
    }
}

/*
 * OUTPUT:
 * Sub class public method
 *
 * Explanation:
 * - The "Super" class method is private → invisible to Sub class.
 * - Sub class method is treated as a new method, not an overridden one.
 * - Hence, when we call m1() using Sub object, only Sub class method executes.
 */
