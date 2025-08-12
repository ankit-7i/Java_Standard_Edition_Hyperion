package com.ankit.java.oops_concept.constructor.copyconstrutor;



public class Manager {
    private int managerId;
    private String managerName;

    public Manager(Employee emp) { // emp = e1
        this.managerId = emp.getEmployeeId();
        this.managerName = emp.getEmployeeName();
    }

    @Override
    public String toString() {
        return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
    }
}

