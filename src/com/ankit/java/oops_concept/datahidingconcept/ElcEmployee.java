package com.ankit.java.oops_concept.datahidingconcept;


import java.util.Scanner;

public class ElcEmployee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fname = sc.next();

        String lname = sc.next();

        int id = Integer.parseInt(sc.next());

        double salary = Double.parseDouble(sc.next());

        int proj = Integer.parseInt(sc.next());

        Employee e1 = new Employee();
        e1.setEmployeeData(fname, lname, id, salary, proj);
        e1.extraSalaryCalculation();
        e1.displaydata();
        sc.close();

    }

}
