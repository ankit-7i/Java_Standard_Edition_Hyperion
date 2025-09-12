package com.ankit.java.oops_concept.abstraction.animal_behaviour;

import java.util.Scanner;

public class AnimalELC
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Choose A Animal :");
        System.out.println("1)Lion");
        System.out.println("2)Dog");
        int choice = Integer.parseInt(sc.nextLine());
        switch(choice) {
            case 1-> {
                System.out.println("You choose Lion Animal ");
                getAnimal(new Lion());
            }
            case 2-> {
                System.out.println("You choose Dog Animal ");
                getAnimal(new Dog());
            }
            default->{
                System.err.println("As of now only 2 animal available only choose between 1 and 2 ");
            }

        }




    }

    public static void getAnimal(Animal a) {
        if (a instanceof Lion) // OLD STYLE
        {
            Lion l = (Lion)a;
            l.roam();
            l.roar();
        }
        if(a instanceof Dog  d ) //  JDK 13V
        {
            d.roam();
            d.bark();
        }



    }
}
