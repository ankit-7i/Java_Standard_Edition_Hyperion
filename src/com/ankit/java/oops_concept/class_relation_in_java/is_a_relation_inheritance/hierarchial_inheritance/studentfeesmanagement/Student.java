package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.hierarchial_inheritance.studentfeesmanagement;


public class Student {

    protected int studentId;
    protected String studentName;
    protected double studentFee;

    public Student(int studentId, String studentName, double studentFee) {
        super();
        if(studentId <0) {
            System.out.println("Invalid student Id");
            System.exit(0);
        }

        this.studentId = studentId;
        if(studentName == null || studentName.trim().isEmpty() || studentName.equals("null")) {
            System.err.println("student Name can't be null");
            System.exit(0);
        }
        this.studentName = studentName;
        if(studentFee<0) {
            System.out.println("Exam fees cannot be negative");
            System.exit(0);
        }

        this.studentFee = studentFee;
    }



}
