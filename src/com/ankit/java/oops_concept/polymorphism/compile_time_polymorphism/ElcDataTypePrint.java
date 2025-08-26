package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism;

public class ElcDataTypePrint
{
    public static void main(String[] args)
    {
        DataTypePrint dt =new  DataTypePrint();
        dt.printData(101);
        dt.printData("Ankit Rout");
        dt.printData((byte)23);
        dt.printData(5.6f);
        dt.printData((short)89);
        dt.printData('M');
        dt.printData(898989090L);
        dt.printData(46000.78d);
        dt.printData(true);

    }

}

