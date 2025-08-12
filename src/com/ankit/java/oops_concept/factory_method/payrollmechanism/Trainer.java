package com.ankit.java.oops_concept.factory_method.payrollmechanism;

import java.util.Scanner;

public class Trainer {

    private int trainerId;
    private String trainerName;
    private double basicSalary;
    private double hraper;
    private double daper;
    private int batchCount;
    private double perkPerBatch;

    public Trainer(int trainerId, String trainerName, double basicSalary, double hraper, double daper, int batchCount, double perkPerBatch) {
        super();
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.basicSalary = basicSalary;
        this.hraper = hraper;
        this.daper = daper;
        this.batchCount = batchCount;
        this.perkPerBatch = perkPerBatch;
    }

    public static Trainer getTrainerObject() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Trainer Id : ");
        int trainerId = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Trainer Name : ");
        String trainerName = sc.nextLine();
        System.out.print("Enter Trainer Basic Salary : ");
        double basicSalary = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Trainer HRA Amount : ");
        double hraper = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Trainer DA Amount : ");
        double daper = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Number of Batches Handled : ");
        int batchCount = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Perk Per Batch : ");
        double perkPerBatch = Double.parseDouble(sc.nextLine());

        return new Trainer(trainerId, trainerName, basicSalary, hraper, daper, batchCount, perkPerBatch);
    }

    public double calculateGrossSalary() {
        return basicSalary + hraper + daper + (batchCount * perkPerBatch);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", trainerName='" + trainerName + '\'' +
                ", basicSalary=" + basicSalary +
                ", hraper=" + hraper +
                ", daper=" + daper +
                ", batchCount=" + batchCount +
                ", perkPerBatch=" + perkPerBatch +
                '}';
    }
}

