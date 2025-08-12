package com.ankit.java.introduction.variables.staticfield;

public class ElcPerson {
    public static void main(String[] args) {
        Person p1 =new Person();
        p1.setPersonData("Ankit");
        p1.getPersonData();
        System.out.println("*********");
        Person p2 = new Person();
        p2.setPersonData("Banty");
        p2.getPersonData();
        System.out.println("*********");
        Person p3 = new Person();
        p3.setPersonData("Sipun");
        p3.getPersonData();
    }
}
