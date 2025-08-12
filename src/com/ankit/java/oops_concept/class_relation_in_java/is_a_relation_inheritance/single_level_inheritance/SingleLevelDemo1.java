package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.single_level_inheritance;


class Father {
    public  void  house(){
        System.out.println("3 - BHK house");
    }
}

class Son extends Father{
    public void car(){
        System.out.println("BMW M5 CS ");
    }
}
public class SingleLevelDemo1 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.house();
        s1.car();
    }
}
