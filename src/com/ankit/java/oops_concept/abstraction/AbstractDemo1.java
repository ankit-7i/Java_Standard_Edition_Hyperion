package com.ankit.java.oops_concept.abstraction;

/**
 * Abstract class and abstract methods :
 * -------------------------------------
 * A class that does not provide complete implementation (partial implementation) is defined as an abstract class.
 *
 * An abstract method is a common method which is used to provide easiness to the programmer because
 * the programmer faces complexity to remember the method name.
 *
 * An abstract method observation is very simple because every abstract method contains the abstract keyword,
 * does not contain any method body and at the end there must be a terminator i.e ; (semicolon).
 *
 * In Java, whenever action is common but implementations are different then we should use abstract method.
 * Generally we declare abstract method in the super class and its implementation must be provided in the sub classes.
 *
 * If a class contains at least one method as an abstract method then we should compulsorily declare that
 * class as an abstract class.
 *
 * Once a class is declared as an abstract class we can't create an object for that abstract class.
 *
 * * All the abstract methods declared in the super class must be overridden in the sub classes otherwise
 *   the sub class will become an abstract class hence object can't be created for the sub class as well.
 *
 * In an abstract class we can write all abstract methods or all concrete methods or a combination of both.
 *
 * It is used to achieve partial abstraction, that means by using abstract classes we can achieve
 * partial abstraction (0-100%).
 *
 * * An abstract class may or may not have abstract methods but an abstract method must have an abstract class.
 *
 * Note :- We can't declare an abstract method as final, private and static (illegal combination of modifiers).
 *
 * We can't declare an abstract class as final.
 */

// Abstract class Shape
abstract class Shape {
    /**
     * Abstract method to be implemented by subclasses.
     * private, static, and final are NOT allowed for abstract methods.
     */
    public abstract void draw();
}

// Subclass Square
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Main class to test
public class AbstractDemo1 {
    public static void main(String[] args) {
        Shape s = null;   // Reference of abstract class

        s = new Square();    // Object of Square
        s.draw();

        s = new Rectangle(); // Object of Rectangle
        s.draw();
    }
}
