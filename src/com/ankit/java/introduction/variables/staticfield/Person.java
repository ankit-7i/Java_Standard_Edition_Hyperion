package com.ankit.java.introduction.variables.staticfield;

public class Person {
    String name;
    static String nationality = "Indian";

    public void setPersonData(String pname){
        name = pname;

    }
    public void getPersonData(){
        System.out.println("Person Name :"+name);
        System.out.println("Person's Nationality :"+nationality);
    }
}
