package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism;

/*
 * Example: Private + Final method in superclass and same method name in subclass
 *
 * Key Points:
 * 1. private methods are not inherited → subclass does not see them at all.
 * 2. final methods cannot be overridden → but here it does not matter,
 *    since the method is already private (not visible to subclass).
 * 3. When subclass declares a method with the same name/signature,
 *    it is a NEW method (method hiding by re-declaration), not overriding.
 *
 * ✅ Hence, the program compiles successfully.
 */

class A {
    // private + final → accessible only inside class A
    private final void access() {
        System.out.println("Super class Method");
    }
}

class B extends A {
    // This is NOT overriding (superclass method is private)
    // This is a completely new method
    public void access() {
        System.out.println("Sub class Method");
    }
}

public class OverridingDemo8 {
    public static void main(String[] args) {
        B obj = new B();

        // Calls subclass version → because superclass method is invisible
        obj.access(); // Output: Sub class Method
    }
}

/*
 * OUTPUT:
 * Sub class Method
 *
 * Explanation:
 * - Class A has a private final method → not inherited by B.
 * - Class B creates its own public method with the same name → new method, not overriding.
 * - Hence, there is no conflict, program compiles, and B’s method runs.
 */
