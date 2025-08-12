package com.ankit.java.oops_concept.factory_method.payrollmechanism;

import java.util.Scanner;

public class Manager {
    private int managerId;
    private String managerName;
    private  double basicSalary;
    private double hraper;
    private double daper;
    private double projectAllowance;


    public Manager(int managerId ,String managerName,double basicSalary ,double hraper,double daper,double projectAllowance) {
       super();
       this.managerId = managerId;
       this.managerName=managerName;
       this.basicSalary=basicSalary;
       this.hraper=hraper;
       this.daper=daper;
       this.projectAllowance= projectAllowance;
    }
    public static Manager getManagerObject() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Manager Id :");
        int managerid = Integer.parseInt(sc.nextLine());

        System.out.print("Enter manager Name :");
        String managerName = sc.nextLine();

        System.out.print("Enter Manager Salary :");
        double basicSalary = Double.parseDouble(sc.nextLine());

        System.out.print("Enter Manager HRA Amount :");
        double hraper = Double.parseDouble(sc.nextLine());

        System.out.print("Enter Manager DA Amount :");
        double daper = Double.parseDouble(sc.nextLine());

        System.out.print("Enter mmployee projectAllowance Amount :");
        double projectAllowance = Double.parseDouble(sc.nextLine());


        return new Manager(managerid, managerName, basicSalary,hraper,daper,projectAllowance);
    }
    public double calculateGrossSalary(){
        return basicSalary+hraper+daper+projectAllowance;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                ", basicSalary=" + basicSalary +
                ", hraper=" + hraper +
                ", daper=" + daper +
                ", projectAllowance=" + projectAllowance +
                '}';
    }
}
