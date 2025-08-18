package com.ankit.java.oops_concept.method_chaining;

/*
---------------------------------------------------
What is Method Chaining in Java?
---------------------------------------------------
* Method Chaining is a technique through which we can call
  multiple methods (n number of methods) in a single line.

* Each method call returns an object, and we use that return
  value to call the next method.

* Example:
    String str = "india";
    int len = str.concat(" is great").toUpperCase().length();

  Explanation:
    - str.concat(" is great") → returns a new String "india is great"
    - .toUpperCase()          → converts string to "INDIA IS GREAT"
    - .length()               → returns the length of the string (int)

* In method chaining:
    - Always, the return type of the previous method is used
      to call the next method.
    - The final return type depends upon the last method call.

---------------------------------------------------
Program Example 1
---------------------------------------------------
*/



public class MethodChaining1Demo {
    public static void main(String[] args) {
        String str = "india";

        // Chaining methods:
        // concat → toUpperCase → charAt
        char ch = str.concat(" is great")  // "india is great"
                .toUpperCase()        // "INDIA IS GREAT"
                .charAt(1);           // returns 'N'

        System.out.println(ch); // Output: N
    }
}



/*
---------------------------------------------------
Key Points:
---------------------------------------------------
1. Method chaining makes code concise and readable.
2. The return type of each method decides what we can call next.
3. Common with classes like String, StringBuilder, Streams, etc.
*/

