package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.hierarchial_inheritance.studentfeesmanagement;


public class Hosteller extends Student {
    protected double hostelFees;

    public Hosteller(int studentId, String studentName, double studentFee, double hostelFees) {
        super(studentId, studentName, studentFee);
        this.hostelFees = hostelFees;
    }
    public double payFee(double amount) {
        double totalFees = hostelFees + super.studentFee;

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
        return "Hosteller [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
                + ", hostelFees=" + hostelFees + "]";
    }



}
