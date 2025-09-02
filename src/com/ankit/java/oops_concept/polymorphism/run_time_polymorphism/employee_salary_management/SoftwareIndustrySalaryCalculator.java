package com.ankit.java.oops_concept.polymorphism.run_time_polymorphism.employee_salary_management;

import java.util.Scanner;

// Base Employee class
abstract class Employee {
    protected int id;
    protected String name;
    protected double basicSalary;

    public Employee(int id, String name, double basicSalary) {
        if (id <= 0) {
            System.err.println("Invalid ID value. Please check...");
            System.exit(0);
        }
        this.id = id;

        if (name == null || name.trim().isEmpty()) {
            System.err.println("Error: Name cannot be empty!");
            System.exit(0);
        }
        this.name = name;

        if (basicSalary <= 0) {
            System.err.println("Invalid basic salary amount. Please check...");
            System.exit(0);
        }
        this.basicSalary = basicSalary;
    }

    public abstract double calculateSalary();
    public abstract double calculateBonus();

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nBasic Salary: $" + basicSalary;
    }
}

// Developer class
class Developer extends Employee {
    private int projectsCompleted;

    public Developer(int id, String name, double basicSalary, int projectsCompleted) {
        super(id, name, basicSalary);

        if (projectsCompleted < 0) {
            System.err.println("Projects completed cannot be negative!");
            System.exit(0);
        }
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public double calculateSalary() {
        double hra = basicSalary * 0.30;
        double ta = basicSalary * 0.15;
        double da = basicSalary * 0.20;
        double projectBonus = projectsCompleted * 1000;

        return basicSalary + hra + ta + da + projectBonus;
    }

    @Override
    public double calculateBonus() {
        return basicSalary * 0.15 + (projectsCompleted * 500);
    }

    @Override
    public String toString() {
        double totalSalary = calculateSalary();
        double bonus = calculateBonus();

        return "╔══════════════════════════════════════════╗\n" +
                "║              DEVELOPER DETAILS           ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: %-15s", "ID", id) + " ║\n" +
                "║ " + String.format("%-20s: %-15s", "Name", name) + " ║\n" +
                "║ " + String.format("%-20s: %-15d", "Projects Completed", projectsCompleted) + " ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Basic Salary", basicSalary) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "HRA (30%)", basicSalary * 0.30) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "TA (15%)", basicSalary * 0.15) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "DA (20%)", basicSalary * 0.20) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Project Bonus", projectsCompleted * 1000.0) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Performance Bonus", bonus) + " ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Total Salary", totalSalary) + " ║\n" +
                "╚══════════════════════════════════════════╝";
    }
}

// Tester class
class Tester extends Employee {
    private int bugsFound;

    public Tester(int id, String name, double basicSalary, int bugsFound) {
        super(id, name, basicSalary);

        if (bugsFound < 0) {
            System.err.println("Bugs found cannot be negative!");
            System.exit(0);
        }
        this.bugsFound = bugsFound;
    }

    @Override
    public double calculateSalary() {
        double hra = basicSalary * 0.25;
        double ta = basicSalary * 0.12;
        double da = basicSalary * 0.18;
        double bugBonus = bugsFound * 50;

        return basicSalary + hra + ta + da + bugBonus;
    }

    @Override
    public double calculateBonus() {
        return basicSalary * 0.12 + (bugsFound * 30);
    }

    @Override
    public String toString() {
        double totalSalary = calculateSalary();
        double bonus = calculateBonus();

        return "╔══════════════════════════════════════════╗\n" +
                "║               TESTER DETAILS             ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: %-15s", "ID", id) + " ║\n" +
                "║ " + String.format("%-20s: %-15s", "Name", name) + " ║\n" +
                "║ " + String.format("%-20s: %-15d", "Bugs Found", bugsFound) + " ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Basic Salary", basicSalary) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "HRA (25%)", basicSalary * 0.25) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "TA (12%)", basicSalary * 0.12) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "DA (18%)", basicSalary * 0.18) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Bug Bonus", bugsFound * 50.0) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Performance Bonus", bonus) + " ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Total Salary", totalSalary) + " ║\n" +
                "╚══════════════════════════════════════════╝";
    }
}

// DevOps class
class DevOps extends Employee {
    private int deployments;

    public DevOps(int id, String name, double basicSalary, int deployments) {
        super(id, name, basicSalary);

        if (deployments < 0) {
            System.err.println("Deployments cannot be negative!");
            System.exit(0);
        }
        this.deployments = deployments;
    }

    @Override
    public double calculateSalary() {
        double hra = basicSalary * 0.28;
        double ta = basicSalary * 0.14;
        double da = basicSalary * 0.22;
        double deploymentBonus = deployments * 80;

        return basicSalary + hra + ta + da + deploymentBonus;
    }

    @Override
    public double calculateBonus() {
        return basicSalary * 0.18 + (deployments * 50);
    }

    @Override
    public String toString() {
        double totalSalary = calculateSalary();
        double bonus = calculateBonus();

        return "╔══════════════════════════════════════════╗\n" +
                "║              DEVOPS DETAILS              ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: %-15s", "ID", id) + " ║\n" +
                "║ " + String.format("%-20s: %-15s", "Name", name) + " ║\n" +
                "║ " + String.format("%-20s: %-15d", "Deployments", deployments) + " ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Basic Salary", basicSalary) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "HRA (28%)", basicSalary * 0.28) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "TA (14%)", basicSalary * 0.14) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "DA (22%)", basicSalary * 0.22) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Deployment Bonus", deployments * 80.0) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Performance Bonus", bonus) + " ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Total Salary", totalSalary) + " ║\n" +
                "╚══════════════════════════════════════════╝";
    }
}

// TeamLead class
class TeamLead extends Employee {
    private int teamSize;

    public TeamLead(int id, String name, double basicSalary, int teamSize) {
        super(id, name, basicSalary);

        if (teamSize < 0) {
            System.err.println("Team size cannot be negative!");
            System.exit(0);
        }
        this.teamSize = teamSize;
    }

    @Override
    public double calculateSalary() {
        double hra = basicSalary * 0.35;
        double ta = basicSalary * 0.18;
        double da = basicSalary * 0.25;
        double teamLeadBonus = teamSize * 100;

        return basicSalary + hra + ta + da + teamLeadBonus;
    }

    @Override
    public double calculateBonus() {
        return basicSalary * 0.20 + (teamSize * 80);
    }

    @Override
    public String toString() {
        double totalSalary = calculateSalary();
        double bonus = calculateBonus();

        return "╔══════════════════════════════════════════╗\n" +
                "║             TEAM LEAD DETAILS            ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: %-15s", "ID", id) + " ║\n" +
                "║ " + String.format("%-20s: %-15s", "Name", name) + " ║\n" +
                "║ " + String.format("%-20s: %-15d", "Team Size", teamSize) + " ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Basic Salary", basicSalary) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "HRA (35%)", basicSalary * 0.35) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "TA (18%)", basicSalary * 0.18) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "DA (25%)", basicSalary * 0.25) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Team Lead Bonus", teamSize * 100.0) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Performance Bonus", bonus) + " ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Total Salary", totalSalary) + " ║\n" +
                "╚══════════════════════════════════════════╝";
    }
}

// Manager class
class Manager extends Employee {
    private int projectsManaged;

    public Manager(int id, String name, double basicSalary, int projectsManaged) {
        super(id, name, basicSalary);

        if (projectsManaged < 0) {
            System.err.println("Projects managed cannot be negative!");
            System.exit(0);
        }
        this.projectsManaged = projectsManaged;
    }

    @Override
    public double calculateSalary() {
        double hra = basicSalary * 0.40;
        double ta = basicSalary * 0.20;
        double da = basicSalary * 0.30;
        double managementBonus = projectsManaged * 200;

        return basicSalary + hra + ta + da + managementBonus;
    }

    @Override
    public double calculateBonus() {
        return basicSalary * 0.25 + (projectsManaged * 150);
    }

    @Override
    public String toString() {
        double totalSalary = calculateSalary();
        double bonus = calculateBonus();

        return "╔══════════════════════════════════════════╗\n" +
                "║              MANAGER DETAILS             ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: %-15s", "ID", id) + " ║\n" +
                "║ " + String.format("%-20s: %-15s", "Name", name) + " ║\n" +
                "║ " + String.format("%-20s: %-15d", "Projects Managed", projectsManaged) + " ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Basic Salary", basicSalary) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "HRA (40%)", basicSalary * 0.40) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "TA (20%)", basicSalary * 0.20) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "DA (30%)", basicSalary * 0.30) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Management Bonus", projectsManaged * 200.0) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Performance Bonus", bonus) + " ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Total Salary", totalSalary) + " ║\n" +
                "╚══════════════════════════════════════════╝";
    }
}

// HR class
class HR extends Employee {
    private int recruitments;

    public HR(int id, String name, double basicSalary, int recruitments) {
        super(id, name, basicSalary);

        if (recruitments < 0) {
            System.err.println("Recruitments cannot be negative!");
            System.exit(0);
        }
        this.recruitments = recruitments;
    }

    @Override
    public double calculateSalary() {
        double hra = basicSalary * 0.25;
        double ta = basicSalary * 0.12;
        double da = basicSalary * 0.18;
        double recruitmentBonus = recruitments * 150;

        return basicSalary + hra + ta + da + recruitmentBonus;
    }

    @Override
    public double calculateBonus() {
        return basicSalary * 0.10 + (recruitments * 100);
    }

    @Override
    public String toString() {
        double totalSalary = calculateSalary();
        double bonus = calculateBonus();

        return "╔══════════════════════════════════════════╗\n" +
                "║                HR DETAILS                ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: %-15s", "ID", id) + " ║\n" +
                "║ " + String.format("%-20s: %-15s", "Name", name) + " ║\n" +
                "║ " + String.format("%-20s: %-15d", "Recruitments", recruitments) + " ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Basic Salary", basicSalary) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "HRA (25%)", basicSalary * 0.25) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "TA (12%)", basicSalary * 0.12) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "DA (18%)", basicSalary * 0.18) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Recruitment Bonus", recruitments * 150.0) + " ║\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Performance Bonus", bonus) + " ║\n" +
                "╠══════════════════════════════════════════╣\n" +
                "║ " + String.format("%-20s: $%-14.2f", "Total Salary", totalSalary) + " ║\n" +
                "╚══════════════════════════════════════════╝";
    }
}

// Main class
public class SoftwareIndustrySalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║    SOFTWARE INDUSTRY SALARY CALCULATOR   ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║ 1. Developer                             ║");
        System.out.println("║ 2. Tester                                ║");
        System.out.println("║ 3. DevOps Engineer                       ║");
        System.out.println("║ 4. Team Lead                             ║");
        System.out.println("║ 5. Manager                               ║");
        System.out.println("║ 6. HR                                    ║");
        System.out.println("╚══════════════════════════════════════════╝");

        System.out.print("\nSelect Employee Role (1-6): ");
        int choice = Integer.parseInt(scanner.nextLine());

        // Common details
        System.out.print("Enter Employee ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = Double.parseDouble(scanner.nextLine());

        // Role-specific details
        switch (choice) {
            case 1 -> {
                System.out.print("Enter Projects Completed: ");
                int projectsCompleted = Integer.parseInt(scanner.nextLine());

                Developer developer = new Developer(id, name, basicSalary, projectsCompleted);
                System.out.println("\n" + developer);
            }
            case 2 -> {
                System.out.print("Enter Bugs Found: ");
                int bugsFound = Integer.parseInt(scanner.nextLine());

                Tester tester = new Tester(id, name, basicSalary, bugsFound);
                System.out.println("\n" + tester);
            }
            case 3 -> {
                System.out.print("Enter Deployments: ");
                int deployments = Integer.parseInt(scanner.nextLine());

                DevOps devOps = new DevOps(id, name, basicSalary, deployments);
                System.out.println("\n" + devOps);
            }
            case 4 -> {
                System.out.print("Enter Team Size: ");
                int teamSize = Integer.parseInt(scanner.nextLine());

                TeamLead teamLead = new TeamLead(id, name, basicSalary, teamSize);
                System.out.println("\n" + teamLead);
            }
            case 5 -> {
                System.out.print("Enter Projects Managed: ");
                int projectsManaged = Integer.parseInt(scanner.nextLine());

                Manager manager = new Manager(id, name, basicSalary, projectsManaged);
                System.out.println("\n" + manager);
            }
            case 6 -> {
                System.out.print("Enter Recruitments: ");
                int recruitments = Integer.parseInt(scanner.nextLine());

                HR hr = new HR(id, name, basicSalary, recruitments);
                System.out.println("\n" + hr);
            }
            default -> {
                System.err.println("Invalid choice! Please select between 1-6.");
                System.exit(0);
            }
        }

        scanner.close();
    }
}
