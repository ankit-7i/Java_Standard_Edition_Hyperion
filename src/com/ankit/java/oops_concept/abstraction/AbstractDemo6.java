package com.ankit.java.oops_concept.abstraction;

/**
 * Program that describes overriding of all abstract methods.
 * - If a subclass does not override all abstract methods of its superclass,
 *   then that subclass also becomes abstract.
 *
 * Example:
 * - Alpha: abstract class with two abstract methods.
 * - Beta: extends Alpha, overrides only one method (show), remains abstract.
 * - Gamma: extends Beta, overrides remaining method (demo), becomes concrete.
 */


/**
 * Abstract class Alpha with two abstract methods.
 */
abstract class Alpha
{
    /** Abstract method to be overridden by subclasses */
    public abstract void show();

    /** Abstract method to be overridden by subclasses */
    public abstract void demo();
}

/**
 * Abstract class Beta extends Alpha.
 * It overrides the 'show' method but not 'demo'.
 * Hence, Beta remains abstract.
 */
abstract class Beta extends Alpha
{
    @Override
    public void show()
    {
        System.out.println("Show method is overridden in Beta class");
    }
}

/**
 * Concrete class Gamma extends Beta.
 * It overrides the remaining 'demo' method.
 * Now Gamma is concrete and can be instantiated.
 */
class Gamma extends Beta
{
    @Override
    public void demo()
    {
        System.out.println("Demo method overridden in Gamma class");
    }
}

/**
 * Driver class with main method to test functionality.
 */
public class AbstractDemo6
{
    public static void main(String[] args)
    {
        Gamma g = new Gamma();  // create object of Gamma
        g.demo();               // calls overridden demo() method
        g.show();               // calls overridden show() method
    }
}
