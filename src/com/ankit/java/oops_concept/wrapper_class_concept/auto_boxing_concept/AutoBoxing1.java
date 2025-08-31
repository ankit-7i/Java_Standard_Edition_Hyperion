package com.ankit.java.oops_concept.wrapper_class_concept.auto_boxing_concept;
/* Autoboxing

Autoboxing is the process of converting a primitive data type into its corresponding wrapper object.

Introduced in JDK 1.5.

Before JDK 1.5, developers had to manually convert primitive → wrapper using valueOf().

From JDK 1.5 onwards, the compiler does it automatically.

*/
public class AutoBoxing1 {
    public static void main(String[] args) {
        int a = 12;

        // Before JDK 1.5 (Manual conversion)
        Integer x = Integer.valueOf(a);  // upto version 1.4
        System.out.println(x);

        int y = 15;

        // From JDK 1.5 onwards (Compiler automatically converts)
        Integer i = y;
        System.out.println(i);
    }
}

