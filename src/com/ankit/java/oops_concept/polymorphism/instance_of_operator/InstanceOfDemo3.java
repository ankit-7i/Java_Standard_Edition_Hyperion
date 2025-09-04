package com.ankit.java.oops_concept.polymorphism.instance_of_operator;

/**
 * Demonstration of instanceof operator without IS-A relation.
 * ------------------------------------------------------------
 * - instanceof requires that the reference type and the class/interface type
 *   must have some relationship (inheritance or implementation).
 * - If there is NO relation, the code will give a COMPILATION ERROR.
 *
 * Example:
 * Bird and Fish are two independent classes.
 * Checking (fish instanceof Bird) is invalid because Fish is not related to Bird.
 */

class Bird {
    // Independent class (no relation with Fish)
}

class Fish {
    // Independent class (no relation with Bird)
}

public class InstanceOfDemo3 {
    public static void main(String[] args) {

        // Creating a Fish object
        Fish fish = new Fish();

        // ❌ Compilation error: Bird and Fish are unrelated classes
        //if (fish instanceof Bird) {
          //  System.out.println("fish is pointing to Bird object");
        //}
    }
}

