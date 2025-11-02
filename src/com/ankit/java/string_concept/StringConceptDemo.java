package com.ankit.java.string_concept;

/**
 * Demonstrates various String handling concepts in Java.
 * Covers:
 * 1. String literals and object comparison
 * 2. String interning using intern()
 * 3. equals() and hashCode()
 * 4. charAt() method
 * 5. concat() and '+' operator
 * 6. equalsIgnoreCase()
 */
public class StringConceptDemo {

    /**
     * Demonstrates String literals and memory comparison using '=='.
     */
    public static void stringLiteralDemo() {
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 == s2); // false → different memory locations

        System.out.println("----------");

        String s3 = "India";
        String s4 = "India";
        System.out.println(s3 == s4); // true → both refer to same SCP object

        System.out.println("----------");

        String s5 = new String("India");
        String s6 = new String("India");
        System.out.println(s5 == s6); // false → both created in heap
    }

    /**
     * Demonstrates String interning using intern() method.
     */
    public static void internDemo() {
        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1 == s2); // false
        s2 = s2.intern(); // places s2 in SCP if not already present
        System.out.println(s1 == s2); // true → both refer to same SCP object
    }

    /**
     * Demonstrates equals() and hashCode() methods in String class.
     */
    public static void equalsDemo() {
        String s1 = "Ravi";
        String s2 = new String("Ravi");

        System.out.println(s1 == s2); // false → memory comparison
        System.out.println(s1.equals(s2)); // true → content comparison
        System.out.println(s1.hashCode()); // same hash for same content
        System.out.println(s2.hashCode());
    }

    /**
     * Demonstrates charAt(int indexPosition) method.
     * Extracts a character based on index.
     */
    public static void charAtDemo() {
        String str = "Hyderabad";
        char ch = str.charAt(8);
        System.out.println(ch); // prints 'd'

        // Uncomment below line to see StringIndexOutOfBoundsException
        // ch = str.charAt(9);
    }

    /**
     * Demonstrates concat() method and '+' operator for string joining.
     */
    public static void concatDemo() {
        String s1 = "Data";
        String s2 = "base";
        String s3 = s1.concat(s2);
        System.out.println(s3); // Database

        String s4 = "Java";
        String s5 = s4.concat(" technology");
        System.out.println(s5); // Java technology

        String s6 = "Batch 47";
        String s7 = s6 + " Batch 49";
        System.out.println(s7); // Batch 47 Batch 49
    }

    /**
     * Demonstrates equalsIgnoreCase(String str) method.
     * Compares two Strings ignoring case sensitivity.
     */
    public static void equalsIgnoreCaseDemo(String username) {
        if (username.equalsIgnoreCase("Ravi")) {
            System.out.println("Welcome Ravi");
        } else {
            System.out.println("Sorry! wrong username / Password");
        }
    }

    /**
     * Main method to execute all demos.
     */
    public static void main(String[] args) {
        System.out.println("=== String Literal Demo ===");
        stringLiteralDemo();

        System.out.println("\n=== Intern Demo ===");
        internDemo();

        System.out.println("\n=== Equals Demo ===");
        equalsDemo();

        System.out.println("\n=== charAt Demo ===");
        charAtDemo();

        System.out.println("\n=== Concat Demo ===");
        concatDemo();

        System.out.println("\n=== equalsIgnoreCase Demo ===");
        // Pass argument if available, else default value
        String user = (args.length > 0) ? args[0] : "ravi";
        equalsIgnoreCaseDemo(user);
    }
}
