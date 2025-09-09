package com.ankit.java.oops_concept.anonymous_inner_class;

/**
 * Example: Anonymous Inner Class with a Normal Class
 *
 * - A normal class (Super) has a method display().
 * - Instead of creating a separate subclass to override display(),
 *   we use an Anonymous Inner Class.
 *
 * - This allows us to override methods on the fly
 *   at the time of object creation.
 */

class Super
{
    /** Method of Super class */
    public void display() {
        System.out.println("Super class display method");
    }
}

/**
 * Driver class demonstrating Anonymous Inner Class overriding a normal class method.
 */
public class AnonymousInnerClassDemo3
{
    public static void main(String[] args)
    {
        // Anonymous inner class created from Super
        Super sub = new Super() {
            @Override
            public void display() {
                System.out.println("Sub class display method");
            }
        };

        // Calls overridden method in anonymous inner class
        sub.display();  // Output: Sub class display method
    }
}

