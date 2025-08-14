package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.multi_level_inheritance;

class Student
{
    protected int id;
    protected String name;
    protected double marks;

    public Student(int id, String name, double marks)
    {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString()
    {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}

class Science extends Student
{
    protected int phyMarks;
    protected int cheMarks;

    public Science(int id, String name, double marks, int phyMarks, int cheMarks)
    {
        super(id, name, marks);
        this.phyMarks = phyMarks;
        this.cheMarks = cheMarks;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Science [phyMarks=" + phyMarks + ", cheMarks=" + cheMarks + "]";
    }
}

class PCM extends Science
{
    protected int mathMarks;

    public PCM(int id, String name, double marks, int phyMarks, int cheMarks, int mathMarks)
    {
        super(id, name, marks, phyMarks, cheMarks);
        this.mathMarks = mathMarks;
    }

    @Override
    public String toString()
    {
        return super.toString() + " PCM [mathMarks=" + mathMarks + "]";
    }
}

public class MultiLevelDemo1
{
    public static void main(String[] args)
    {
        PCM p = new PCM(101, "Scott", 450, 90, 80, 90);
        System.out.println(p);
    }
}

