package com.ankit.java.oops_concept.interface_concept.interface_with_factory_design_pattern;

import java.util.Scanner;
public class PaymentGatewayUsingInterface
{
    public static void main(String []  args )
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Payment Choice : ");
        System.out.println("1) CreditCard  ");
        System.out.println("2) UPI ");
        int choice = Integer.parseInt(sc.next());
        switch(choice)
        {
            case 1 ->
            {
                PaymentGateway pg= new PaymentGateway();
                System.out.println("Initiating Credit Card payment.");
                Payment p=pg.initiatePayment(new CreditCardPayment());
                p.applyDiscount();
                p.processPayment();
            }
            case 2 ->
            {
                PaymentGateway pb = new PaymentGateway();
                System.out.println("Initiating UPI payment.");
                Payment p2 = pb.initiatePayment(new UPIPayment());
                p2.applyDiscount();
                p2.processPayment();

            }
            default ->
            {
                System.out.println("Wrong Choice");
                sc.close();
                return;
            }
        }
    }
}

interface Payment
{
    void processPayment();
    void applyDiscount();

}

class CreditCardPayment implements Payment
{
    public void processPayment ()
    {
        System.out.println ("Processing credit card payment");
    }
    public void applyDiscount()
    {
        System.out.println("Applying 10% discount for credit card users.");
    }
}

class UPIPayment  implements Payment
{
    public void processPayment ()
    {
        System.out.println ("Processing UPI payment");
    }
    public void applyDiscount()
    {
        System.out.println("Applying 100 cashback for UPI users.");
    }
}

class PaymentGateway
{
    public Payment initiatePayment (Payment pay)
    {
        if(pay instanceof CreditCardPayment )
        {
            return pay;
        }
        else if(pay instanceof UPIPayment )
        {
            return pay;
        }
        else
            return null;

    }
}
