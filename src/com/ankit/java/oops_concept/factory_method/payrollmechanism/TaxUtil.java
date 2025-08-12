package com.ankit.java.oops_concept.factory_method.payrollmechanism;

public class TaxUtil {

    public double calculateTax(Employee e) {
        double grossSalary = e.calculateGrossSalary();
        if (grossSalary > 50000) {
            return grossSalary * 0.2;
        } else {
            return grossSalary * 0.05;
        }
    }

    public double calculateTax(Manager m) {
        double grossSalary = m.calculateGrossSalary();
        if (grossSalary > 50000) {
            return grossSalary * 0.2;
        } else {
            return grossSalary * 0.05;
        }
    }
    public double calculateTax(Trainer t) {
        double grossSalary = t.calculateGrossSalary();
        if (grossSalary > 50000) {
            return grossSalary * 0.2;
        } else {
            return grossSalary * 0.05;
        }
    }
    public double calculateTax(Sourcing s) {
        double grossSalary = s.calculateGrossSalary();
        if (grossSalary > 50000) {
            return grossSalary * 0.2;
        } else {
            return grossSalary * 0.05;
        }
    }

}
