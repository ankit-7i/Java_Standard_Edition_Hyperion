package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism;

/*
 * Example: Access Modifier Rules in Method Overriding
 *
 * Rule:
 * - While overriding, a subclass cannot reduce the visibility of the method.
 *   (i.e., you cannot make it more restrictive).
 *
 * Order of visibility (least to most restrictive):
 * public → protected → default (package-private) → private
 *
 * ✅ You can increase visibility (e.g., from protected → public).
 * ❌ You cannot decrease visibility (e.g., from public → protected/private).
 */

class Bird1 {
    // Superclass method with public access
    public void roam() {
        System.out.println("Generic Bird is roaming");
    }
}

class Parrot1 extends Bird1 {
    // ❌ Compilation Error:
    // Cannot override with 'protected' because it reduces visibility of 'public' method.
    @Override
    protected void roam() {   // Error: cannot reduce the visibility of the inherited method
        System.out.println("Parrot Bird is roaming");
    }
}

public class AccessModifierRule {
    public static void main(String[] args) {
        Bird a = new Parrot();
        a.roam();   // Would call Parrot's version if compilation succeeded
    }
}

/*
 * OUTPUT (if code compiled, which it won't):
 * Parrot Bird is roaming
 *
 * But in reality:
 * Compilation error: "attempting to assign weaker access privileges; was public"
 */

