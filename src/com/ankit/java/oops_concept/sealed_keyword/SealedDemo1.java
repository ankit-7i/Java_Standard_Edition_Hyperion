package com.ankit.java.oops_concept.sealed_keyword;

// Sealed class allows you to restrict which classes can extend it
sealed class Bird permits Parrot, Sparrow {
    public void fly() {
        System.out.println("Generic Bird is flying..");
    }
}

// 'non-sealed' means this class can be extended freely
non-sealed class Parrot extends Bird {
    @Override
    public void fly() {
        System.out.println("Parrot Bird is flying..");
    }
}

// 'final' means this class cannot be extended further
final class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow Bird is flying..");
    }
}

public class SealedDemo1 {
    public static void main(String[] args) {
        Bird b = null;

        // Upcasting: Bird reference points to Parrot object
        b = new Parrot();
        b.fly();   // prints "Parrot Bird is flying.."

        // Upcasting: Bird reference points to Sparrow object
        b = new Sparrow();
        b.fly();   // prints "Sparrow Bird is flying.."
    }
}

/*
 * Explanation of Sealed Classes:
 * -------------------------------
 * - 'sealed' restricts inheritance to only specific classes (declared in 'permits').
 * - 'non-sealed' removes restriction and allows further extension.
 * - 'final' prevents further extension.
 *
 * In this example:
 *   - Bird is sealed, only Parrot and Sparrow can extend it.
 *   - Parrot is non-sealed -> it can be extended by other classes.
 *   - Sparrow is final -> no class can extend Sparrow.
 *
 * ✅ Output:
 * Parrot Bird is flying..
 * Sparrow Bird is flying..
 *
 * Purpose of Sealed Classes:
 * --------------------------
 * - Provide more control over inheritance.
 * - Improve readability and maintainability by explicitly stating
 *   which classes are allowed in the hierarchy.
 */

