package com.ankit.java.oops_concept.abstraction;


// Abstract class
abstract class Animal {
    public abstract void checkup();  // abstract method
}

// Subclass Lion
class Lion extends Animal {
    @Override
    public void checkup() {
        System.out.println("Lion Checkup");
    }
}

// Subclass Elephant
class Elephant extends Animal {
    @Override
    public void checkup() {
        System.out.println("Elephant Checkup");
    }
}

// Main class
public class AbstractDemo5 {
    public static void main(String[] args) {

        // Array of Animal references holding Lion objects
        Animal lions[] = { new Lion(), new Lion(), new Lion() };
        regularAnimalCheck(lions);   // calls Lion's checkup()

        System.out.println(".......................");

        // Array of Animal references holding Elephant objects
        Animal elephants[] = new Animal[2];
        elephants[0] = new Elephant();
        elephants[1] = new Elephant();

        regularAnimalCheck(elephants);  // calls Elephant's checkup()

        System.out.println(".......................");
    }

    // Common method that works for any Animal subclass
    public static void regularAnimalCheck(Animal animals[]) {
        for (Animal animal : animals) {
            animal.checkup();   // polymorphic call
        }
    }
}
