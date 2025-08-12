package com.ankit.java.oops_concept.encapsulation;

public class Employee {


    private int employeeId;
    private String employeeName;
    private String employeeDesignation;
    private double salary;
    private String employeeType;
    private int noOfProject;
    private  double grossSalary;

    public Employee(int employeeId,String employeeName,String employeeDesignation,double salary,int noOfProject) {
        if(employeeId<0){
            System.err.println("Invalid employee ID");
            System.exit(0);
        }
        this.employeeId = employeeId;
        if(employeeName == null || employeeName.trim().isEmpty() || employeeName.equals("null") ){
            System.err.println("please input a valid name");
            System.exit(0);
        }
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        if(salary<0){
            System.err.println("please Enter valid salary ");
            System.exit(0);
        }
        this.salary = salary;
        if(noOfProject<0){
            System.out.println("Employee must be fired");
            System.exit(0);
        }
        this.noOfProject = noOfProject;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public int getNoOfProject() {
        return noOfProject;
    }

    public void setNoOfProject(int noOfProject) {
        this.noOfProject = noOfProject;
    }

    public void determineEmployeeType(){
        if (noOfProject > 25) {
            employeeType = "Class - A";
        } else if (noOfProject > 20) {
            employeeType = "Class - B";
        } else if (noOfProject > 15) {
            employeeType = "Class - C";
        } else if (noOfProject > 10) {
            employeeType = "Class - D";
        } else if (noOfProject > 5) {
            employeeType = "Class - E";
        } else {
            employeeType = "Benched";
        }

    }
    public void setGrossSalary(){
        if (employeeType.equals("Class - A")) {
            grossSalary = salary + 15000;
        } else if (employeeType.equals("Class - B")) {
            grossSalary = salary + 11000;
        } else if (employeeType.equals("Class - C")) {
            grossSalary = salary + 8000;
        } else if (employeeType.equals("Class - D")) {
            grossSalary = salary + 5000;
        } else if (employeeType.equals("Class - E")) {
            grossSalary = salary + 3000;
        } else {
            grossSalary = salary;
        }


    }
    public  void getGrossSalary(){
        System.out.println("grossSalary ="+grossSalary);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", netSalary=" + salary +
                ", employeeType='" + employeeType + '\'' +
                ", noOfProject=" + noOfProject +
                '}';
    }
}
