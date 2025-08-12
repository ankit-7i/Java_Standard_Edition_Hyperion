package com.ankit.java.oops_concept.Initialize_properties_through_reference.elcclassprog;


import com.ankit.java.oops_concept.Initialize_properties_through_reference.blcclassprog.Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student raj = new Student();
        raj.name = "Raj";
        raj.age=22;
        raj.height =5.8;
        raj.talk();
        raj.writeExam();

        System.out.println("----------------");

        Student priya = new Student();
        priya.name = "priya";
        priya.age= 21;
        priya.height=5.6;
        priya.talk();
        priya.writeExam();
    }

}
