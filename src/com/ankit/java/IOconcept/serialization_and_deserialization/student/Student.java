package com.ankit.java.IOconcept.serialization_and_deserialization.student;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class Student implements Serializable {
    private static final long serialVersionUID = 3L;
    private Integer studentId;
    private String studentName;
    private Double studentFees;
    private LocalDate dateOfAdmission;


    public Student(Integer studentId,String studentName,Double studentFees,LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.studentName=studentName;
        this.studentFees=studentFees;
        this.dateOfAdmission=dateOfAdmission;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student(Double studentFees) {
        this.studentFees = studentFees;
    }

    public Student(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
public static Student getStudentObject(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter id");
    Integer id = Integer.parseInt(sc.nextLine());
    System.out.println("Enter student name");
    String name = sc.nextLine();
    System.out.println("enter fees amount ");
    Double fees =Double.parseDouble(sc.nextLine());
    System.out.println("Enter Date of admission (yyyy-MM-dd)");
    LocalDate dt = LocalDate.parse(sc.nextLine());

    return new Student(id,name,fees,dt);

}

    @Override
    public String toString() {
        return "Student{" +
                "dateOfAdmission=" + dateOfAdmission +
                ", studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentFees=" + studentFees +
                '}';
    }
}