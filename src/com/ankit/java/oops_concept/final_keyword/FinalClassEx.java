package com.ankit.java.oops_concept.final_keyword;
/**
 * ✅ Key Points
 *
 * final class → cannot be inherited.
 *
 * final method → cannot be overridden.
 *
 * final variable → value cannot be reassigned.
 *
 * Java provides String, Integer, and all Wrapper Classes as final by default.
 */

// Final class declaration
final class A {
    private int x = 100;

    public void setData(int x) {
        this.x = x;
        System.out.println("x value is: " + x);
    }
}

// Trying to extend a final class will cause a compilation error
// class B extends A { }   // ❌ Not allowed

class B {
    // This class is separate (not extending A)
}

// Example execution class
public class FinalClassEx {
    public static void main(String[] args) {
       B b1 = new B();
        // b1.setData(200); // ❌ Not possible since B does not extend A
    }
}

