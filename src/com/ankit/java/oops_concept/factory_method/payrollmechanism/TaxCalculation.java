package com.ankit.java.oops_concept.factory_method.payrollmechanism;

import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaxUtil tax = new TaxUtil();

        System.out.println("====== Payroll Menu ======");
        System.out.println("1. Employee");
        System.out.println("2. Manager");
        System.out.println("3. Trainer");
        System.out.println("4. Sourcing");
        System.out.print("Enter your choice (1-4): ");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                Employee emp = Employee.getemployeeObject();
                System.out.println("\n===== Employee Details =====");
                System.out.println(emp);
                double empGross = emp.calculateGrossSalary();
                double empTax = tax.calculateTax(emp);
                double empNet = empGross - empTax;
                System.out.println("Gross Salary : " + empGross);
                System.out.println("Tax Amount   : " + empTax);
                System.out.println("Net Salary   : " + empNet);
                break;

            case 2:
                Manager man = Manager.getManagerObject();
                System.out.println("\n===== Manager Details =====");
                System.out.println(man);
                double manGross = man.calculateGrossSalary();
                double manTax = tax.calculateTax(man);
                double manNet = manGross - manTax;
                System.out.println("Gross Salary : " + manGross);
                System.out.println("Tax Amount   : " + manTax);
                System.out.println("Net Salary   : " + manNet);
                break;

            case 3:
                Trainer trn = Trainer.getTrainerObject();
                System.out.println("\n===== Trainer Details =====");
                System.out.println(trn);
                double trnGross = trn.calculateGrossSalary();
                double trnTax = tax.calculateTax(trn);
                double trnNet = trnGross - trnTax;
                System.out.println("Gross Salary : " + trnGross);
                System.out.println("Tax Amount   : " + trnTax);
                System.out.println("Net Salary   : " + trnNet);
                break;

            case 4:
                Sourcing src = Sourcing.getSourcingObject();
                System.out.println("\n===== Sourcing Details =====");
                System.out.println(src);
                double srcGross = src.calculateGrossSalary();
                double srcTax = tax.calculateTax(src);
                double srcNet = srcGross - srcTax;
                System.out.println("Gross Salary : " + srcGross);
                System.out.println("Tax Amount   : " + srcTax);
                System.out.println("Net Salary   : " + srcNet);
                break;

            default:
                System.out.println("Invalid choice. Please select between 1 and 4.");
        }
    }
}
