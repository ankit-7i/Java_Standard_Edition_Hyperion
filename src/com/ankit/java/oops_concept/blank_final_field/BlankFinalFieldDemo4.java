package com.ankit.java.oops_concept.blank_final_field;

// Example: A blank final field default value is provided by 'new' keyword,
// but the same value will not be copied by the default constructor.



class Test {
    final int A; // Blank final field

    {
        printValue(); // Prints default value before initialization (0)
        A = 100;      // Explicit initialization (only once allowed)
    }

    public void printValue() {
        System.out.println("Default value :" + this.A);
        // Here, 'A' will be 0 because initialization (A = 100) hasn't happened yet
    }
}

public class BlankFinalFieldDemo4 {
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println("User value :" + t1.A); // Output: User value : 100
    }
}
