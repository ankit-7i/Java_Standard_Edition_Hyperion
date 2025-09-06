package com.ankit.java.oops_concept.co_variant_return_type;

// Parent class
class Alpha {
    // Method in Alpha with void return type
    public void m1() {
        System.out.println("Alpha class m1 method");
    }
}

// Child class extending Alpha
class Beta extends Alpha {
    //@Override
    // ❌ Error: return type 'double' is not compatible with 'void'
    //public double m1() {
    //    System.out.println("Beta class m1 method");
   //     return 0.0;  // incompatible because parent method returns void
  //  }
}

public class CoVariantDemo1 {
    public static void main(String[] args) {
        // Upcasting: Beta object is referenced by Alpha type
        Alpha a = new Beta();
        a.m1();   // call the overridden method
    }
}

/*
 * Note:
 * return type 'double' is not compatible with 'void'.
 * In Java, while overriding, the return type must be the same or
 * a covariant type (a subclass type if it’s an object).
 * Primitive types (like void vs double) cannot be covariant.
 */
