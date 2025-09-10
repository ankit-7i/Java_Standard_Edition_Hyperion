package com.ankit.java.oops_concept.interface_concept;

sealed interface Moveable permits Car {
    int SPEED = 120;   // public, static, final by default

    void move();       // public, abstract by default
}

non-sealed class Car implements Moveable {
    @Override
    public void move() {
        // SPEED = 150;  // ❌ Not possible, SPEED is final
        System.out.println("Car is moving with :" + SPEED + " speed");
    }
}

public class InterfaceDemo1 {
    public static void main(String[] args) {
        Moveable m = new Car();
        m.move();
        System.out.println("Speed of the Car is :" + Moveable.SPEED);
    }
}

