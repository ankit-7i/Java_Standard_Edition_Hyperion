package com.ankit.java.oops_concept.Initialize_properties_through_reference.blcclassprog;

public class Student
{
    public String name;
    public int age;
    public double height;
    public void talk(){
        System.out.println("Hello guys, My name is :"+name);
        System.out.println("My age is :"+age);
        System.out.println("And my Height is :"+height);
    }
    public void writeExam(){
        System.out.println("Every Saturday,"+name+" is writing java Exam");
    }
}
