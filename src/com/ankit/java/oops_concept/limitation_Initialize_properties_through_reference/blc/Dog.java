package com.ankit.java.oops_concept.limitation_Initialize_properties_through_reference.blc;

import java.util.Scanner;

// non static field through method without parameter
public class Dog {
    String name;
    int age;
    String color;
    // Initializing the Object(Dog) properties
    public void setDogData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dog Name :");
        name = sc.nextLine();
        System.out.print("Enter Dog Age :");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Dog color :");
        color = sc.nextLine();
        sc.close();
    }
    public void getDogInformation(){
        System.out.println("Dog Name is : "+name);
        System.out.println("Dog Age is :"+age);
        System.out.println("Dog color is :"+color);
    }

}
