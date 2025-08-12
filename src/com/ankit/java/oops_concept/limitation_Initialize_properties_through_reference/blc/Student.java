package com.ankit.java.oops_concept.limitation_Initialize_properties_through_reference.blc;

public class Student {
    int studentId;
    String studentName;
    int studentMarks;
    char studentGrade;

    public void setStudentData(int id,String name,int marks){
        studentId=id;
        studentName=name;
        studentMarks=marks;
    }
    public void getStudentData(){
        System.out.println("Student Id is :"+studentId);
        System.out.println("Student name is : "+studentName);
        System.out.println("Student marks is : "+studentMarks);
        System.out.println("Student Grade is : "+studentGrade);
    }

    public void gradeCalculation(){
        if(studentMarks>=90){
            studentGrade ='O';
        } else if (studentMarks>=80) {
            studentGrade ='E';
        } else if (studentMarks>=70) {
            studentGrade ='A';
        } else if (studentMarks>=60) {
            studentGrade ='B';
        } else if (studentMarks>=50) {
            studentGrade = 'C';
        } else if (studentMarks>=40) {
            studentGrade ='D';
        }
        else {
            studentGrade ='F';
        }

    }
}
