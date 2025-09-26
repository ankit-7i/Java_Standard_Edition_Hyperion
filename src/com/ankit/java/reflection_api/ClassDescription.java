package com.ankit.java.reflection_api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassDescription demonstrates the use of Java Reflection API
 * to dynamically analyze the structure of a class.
 *
 * This program:
 * - Loads a class name at runtime using Class.forName().
 * - Retrieves and prints all declared fields of the class.
 * - Retrieves and prints all declared methods of the class.
 *
 * Reflection is useful when we want to inspect classes, methods,
 * or fields dynamically (without knowing them at compile time).
 */
public class ClassDescription {

    /**
     * Main method to execute the program.
     *
     * @param args Command-line arguments. args[0] should be the fully qualified
     *             class name (e.g., "java.util.Date" or a user-defined class).
     * @throws ClassNotFoundException if the specified class is not found in the classpath.
     */
    public static void main(String[] args) throws ClassNotFoundException {

        // Load class dynamically from argument
        Class<?> cls = Class.forName(args[0]);

        // Print basic class information
        System.out.println("Class Name is : " + cls.getName());
        System.out.println("Package Name is : " + cls.getPackage().getName());

        // Print all declared fields of the class
        System.out.println("\nAll the fields are :");
        Field[] fields = cls.getDeclaredFields(); // Returns an array of Field objects
        int count = 0;

        for (Field field : fields) {
            count++;
            System.out.println(field.getName()); // Print field name
        }
        System.out.println("Total number of fields are = " + count);

        // Print all declared methods of the class
        System.out.println("\nTotal Methods are :");
        Method[] methods = cls.getDeclaredMethods(); // Returns an array of Method objects
        count = 0;

        for (Method method : methods) {
            count++;
            System.out.println(method.getName()); // Print method name
        }
        System.out.println("Total number of Methods are = " + count);
    }
}

