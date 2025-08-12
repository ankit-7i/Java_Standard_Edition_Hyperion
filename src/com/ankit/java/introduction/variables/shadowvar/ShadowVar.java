package com.ankit.java.introduction.variables.shadowvar;

public class ShadowVar {
    private  int rollNumber = 101;
    private String studentName= "Ankit";
    public void showStudentData(){
        int rollNumber=999;
        String studentName="Raj";
        System.out.println("Roll Numbe : "+rollNumber);
        System.out.println("Student Name : "+studentName);
    }
}
