package com.ankit.java.oops_concept.polymorphism.instance_of_operator;

class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

class BMW extends Vehicle {
}

class Audi extends Vehicle {
}

public class InstanceOfDemo4 {
    public static void main(String[] args) {
        acceptCarType(new Audi());
    }

    public static void acceptCarType(Vehicle v) {  // Loose Coupling
        if (v instanceof BMW) {
            System.out.println("BMW Car");
        } else {
            System.out.println("AUDI Car");
        }
    }
}

