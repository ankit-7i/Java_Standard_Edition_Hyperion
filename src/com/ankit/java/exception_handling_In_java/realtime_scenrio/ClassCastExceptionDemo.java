package com.ankit.java.exception_handling_In_java.realtime_scenrio;

import java.util.Objects;
import java.util.Scanner;

public class ClassCastExceptionDemo {

    public static void handleClassCastException() {
        Object [] objects= {"Hello", "World", "Java"};
        for(Object obj : objects) {
            try {
                String str=(String)obj;
                System.out.println("Casting successful: "+str);
            }
            catch(ClassCastException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        handleClassCastException();
    }

}

