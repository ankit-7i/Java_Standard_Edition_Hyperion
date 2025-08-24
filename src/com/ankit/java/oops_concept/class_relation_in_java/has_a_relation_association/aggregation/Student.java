package com.ankit.java.oops_concept.class_relation_in_java.has_a_relation_association.aggregation;

/**
 * Represents a Student entity that HAS-A relation with College.
 */


public class Student {
    private int studentId;
    private String studentName;
    private College college;  // HAS-A Relationship

    /**
     * Parameterized constructor to initialize student details with college.
     *
     * @param studentId   unique student ID
     * @param studentName name of the student
     * @param college     associated college
     */
    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student [studentId = " + studentId +
                ", studentName = " + studentName +
                ", college = " + college + "]";
    }
}

