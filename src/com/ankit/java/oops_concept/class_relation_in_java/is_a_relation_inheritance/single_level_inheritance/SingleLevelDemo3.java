package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.single_level_inheritance;

 class TemporaryEmployee
{
    protected int employeeId;
    protected String employeeName;
    protected double employeeSalary;

    public TemporaryEmployee(int employeeId, String employeeName, double employeeSalary)
    {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
}



class PermanentEmployee extends TemporaryEmployee
{
    protected String department;
    protected String designation;

    public PermanentEmployee(int employeeId, String employeeName, double employeeSalary,
                             String department, String designation)
    {
        super(employeeId, employeeName, employeeSalary);
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString()
    {
        return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName +
                ", employeeSalary=" + employeeSalary + ", department=" + department +
                ", designation=" + designation + "]";
    }
}



public class SingleLevelDemo3
{
    public static void main(String[] args)
    {
        var p1 = new PermanentEmployee(101, "Scott", 65000, "IT", "Developer");
        System.out.println(p1);
    }
}

