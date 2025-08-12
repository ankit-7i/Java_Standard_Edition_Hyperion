package com.ankit.java.oops_concept.limitation_Initialize_properties_through_reference.elc;

import com.ankit.java.oops_concept.limitation_Initialize_properties_through_reference.blc.Employee;

public class ElcEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeData(1134,"Ankit","Java Developer",34000.00);
        emp.getEmployeeData();
    }

}
