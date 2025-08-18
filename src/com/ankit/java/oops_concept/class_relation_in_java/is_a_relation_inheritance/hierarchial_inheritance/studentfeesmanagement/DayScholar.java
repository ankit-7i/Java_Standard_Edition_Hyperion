package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.hierarchial_inheritance.studentfeesmanagement;

public class DayScholar extends Student {
    protected double transportFee;

    public DayScholar(int studentId, String studentName, double studentFee, double transportFee) {
        super(studentId, studentName, studentFee);
        this.transportFee = transportFee;
    }
    public double payFee(double amount) {

        double totalFees = transportFee + super.studentFee;

        if (amount > totalFees) {
            double refund = amount - totalFees;
            System.out.println("Refundable Amount is : " + refund);
            return refund;
        } else if (amount < totalFees) {
            double payable = totalFees - amount;
            System.out.println("Payable Amount is : " + payable);
            return payable;
        } else {
            System.out.println("Fees paid in full. No balance.");
            return 0;
        }
    }
    @Override
    public String toString() {
        return "DayScholar [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
                + ", transportFee=" + transportFee + "]";
    }

}

