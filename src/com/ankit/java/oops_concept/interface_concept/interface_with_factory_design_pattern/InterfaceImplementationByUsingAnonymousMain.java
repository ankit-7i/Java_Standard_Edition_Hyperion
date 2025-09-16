package com.ankit.java.oops_concept.interface_concept.interface_with_factory_design_pattern;

public class InterfaceImplementationByUsingAnonymousMain {
    public static void main(String [] args ){
        PrinterDemo pd = new PrinterDemo();
        Printer printer=pd.getPrinter();
        printer.print();
    }
}
interface Printer {
    void print();

}
class PrinterDemo{
    public Printer getPrinter(){
        return new Printer (){
            public void print(){
                System.out.println("Hello from Printer implemented using Anonymous Inner Class!");
            }
        };
    }
}