package com.ankit.java.oops_concept.abstraction.animal_behaviour;

public class Dog extends Animal {

    @Override
    public void roam() {

        System.out.println("Dog is roaming");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

}