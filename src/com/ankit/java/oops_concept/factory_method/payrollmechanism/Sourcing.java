package com.ankit.java.oops_concept.factory_method.payrollmechanism;

import java.util.Scanner;

public class Sourcing {
    private int sourceId;
    private String sourceName;
    private double basicSalary;
    private double hraper;
    private double daper;
    private int enrollmentTarget;
    private int enrollmentReached;
    private double perkPerEnrollment;

    public Sourcing(int sourceId, String sourceName, double basicSalary, double hraper, double daper,
                    int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.basicSalary = basicSalary;
        this.hraper = hraper;
        this.daper = daper;
        this.enrollmentTarget = enrollmentTarget;
        this.enrollmentReached = enrollmentReached;
        this.perkPerEnrollment = perkPerEnrollment;
    }

    public static Sourcing getSourcingObject() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Source Id: ");
        int sourceId = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Source Name: ");
        String sourceName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = Double.parseDouble(sc.nextLine());
        System.out.print("Enter HRA Amount: ");
        double hraper = Double.parseDouble(sc.nextLine());
        System.out.print("Enter DA Amount: ");
        double daper = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Enrollment Target: ");
        int enrollmentTarget = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Enrollment Reached: ");
        int enrollmentReached = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Perk Per Enrollment (% value): ");
        double perkPerEnrollment = Double.parseDouble(sc.nextLine());

        return new Sourcing(sourceId, sourceName, basicSalary, hraper, daper,
                enrollmentTarget, enrollmentReached, perkPerEnrollment);
    }

    public double calculateGrossSalary() {
        double performancePercent = ((double) enrollmentReached / enrollmentTarget) * 100;
        return basicSalary + hraper + daper + (performancePercent * perkPerEnrollment);
    }

    @Override
    public String toString() {
        return "Sourcing{" +
                "sourceId=" + sourceId +
                ", sourceName='" + sourceName + '\'' +
                ", basicSalary=" + basicSalary +
                ", hraper=" + hraper +
                ", daper=" + daper +
                ", enrollmentTarget=" + enrollmentTarget +
                ", enrollmentReached=" + enrollmentReached +
                ", perkPerEnrollment=" + perkPerEnrollment +
                '}';
    }
}
