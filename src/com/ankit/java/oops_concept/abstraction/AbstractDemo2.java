package com.ankit.java.oops_concept.abstraction;

// Abstract Class
abstract class ATM
{
    // Abstract methods (must be implemented by subclasses)
    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
    public abstract void pinChange();
}

// SBIATM subclass providing implementation
class SBIATM extends ATM
{
    @Override
    public void withdraw(double amount)
    {
        System.out.println("Making a withdraw of " + amount + " through SBI ATM");
    }

    @Override
    public void deposit(double amount)
    {
        System.out.println("Making a deposit of " + amount + " through SBI ATM");
    }

    @Override
    public void pinChange()
    {
        System.out.println("PIN Changed Successfully!!!!");
    }
}

// Main class
public class AbstractDemo2
{
    public static void main(String[] args)
    {
        ATM atm = new SBIATM();   // Polymorphic reference

        atm.deposit(20000);
        atm.withdraw(12000);
        atm.pinChange();
    }
}

