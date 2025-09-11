package com.ankit.java.object_class_and_its_method.public_boolean_equals;

import java.util.Objects;

public class Student {
    private int studentID;
    private String studentName;

    public Student(int studentID , String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return studentID == student.studentID && Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, studentName);
    }
}
