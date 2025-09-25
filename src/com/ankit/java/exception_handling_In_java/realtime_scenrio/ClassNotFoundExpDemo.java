package com.ankit.java.exception_handling_In_java.realtime_scenrio;

import java.util.Scanner;

public class ClassNotFoundExpDemo {

    public ClassNotFoundExpDemo(String a)
    {
        try {
            Class.forName(a);
            System.out.println("Class Loaded "+a);
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter class name");
        String cname = sc.nextLine();
        new ClassNotFoundExpDemo(cname);


    }

}
