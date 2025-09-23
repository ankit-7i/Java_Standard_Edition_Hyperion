package com.ankit.java.oops_concept.interface_concept.functional_interface.consumer;


import java.util.function.Consumer;

import java.util.Scanner;


public class StudentCourseRegistration

{
    public static void main (String [] args )

    {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter Number of Student For Registraion");
        int range  = Integer.parseInt(sc.next());

        if (range <=0)
        {
            System.out.println("Invalid number of students");
        }
        else {

            Consumer<Student> s1 = stu -> System.out.println("Hello "+stu.name()+"! Welcome to the "+stu.course()+" course.");
            for(int i = 0 ; i<range; i++)
            {

                System.out.println("Enter id");
                int id = Integer.parseInt(sc.next());
                System.out.println("Enter Name");
                String name = sc.next();
                System.out.println("Enter Course");
                String course = sc.next();

                s1.accept(new Student(id,name,course));
            }
        }

    }
}
record Student ( int id,  String name, String course){

}
