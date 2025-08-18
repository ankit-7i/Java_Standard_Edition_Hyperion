package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.hierarchial_inheritance.studentfeesmanagement;

import java.util.Scanner;

public class StudentElc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select a particular type of Student :");
        System.out.println("1) Hosteller Student ");
        System.out.println("2) DayScholer Student ");
        int choice  = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1 ->{
                System.out.println("You have selected Hosteller!!!");
                System.out.print("Enter Student Id : ");
                int studentId =Integer.parseInt(sc.nextLine());
                System.out.print("Enter Student Name : ");
                String studentName = sc.nextLine();
                System.out.print("Enter Exam Fees :");
                double studentFees = Double.parseDouble(sc.nextLine());
                System.out.print("Enter Hostel Fee : ");
                double hostelFees = Double.parseDouble(sc.nextLine());
                System.out.print("Enter your total Fees : ");
                double amount =  Double.parseDouble(sc.nextLine());

                Hosteller hs  = new Hosteller(studentId, studentName, studentFees, hostelFees);
                hs.payFee(amount);
                System.out.println(hs);

            }
            case 2 ->{
                System.out.println("You have selected DayScholarr!!!");
                System.out.print("Enter Student Id : ");
                int studentId =Integer.parseInt(sc.nextLine());
                System.out.print("Enter Student Name : ");
                String studentName = sc.nextLine();
                System.out.print("Enter Exam Fees :");
                double studentFees = Double.parseDouble(sc.nextLine());
                System.out.print("Enter Transport Fee : ");
                double transportFee = Double.parseDouble(sc.nextLine());
                System.out.print("Enter your total Fees you Paid : ");
                double amount =  Double.parseDouble(sc.nextLine());

                DayScholar dsc = new DayScholar(studentId, studentName, studentFees, transportFee);
                dsc.payFee(amount);
                System.out.println(dsc);
            }
        }
        sc.close();
    }
}

