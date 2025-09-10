package com.ankit.java.oops_concept.abstraction.product_management;

public class DigitalProduct extends Product
{
    private String licenseKey;

    public DigitalProduct(String name, double price, String category, String licenseKey)
    {
        super(name, price, category);
        this.licenseKey = licenseKey;
    }

    @Override
    public void applyDiscount(double percentage)
    {
        if (percentage < 0 || percentage > 100)
        {
            System.err.println("Discount percentage must be between 0 and 100.");
            System.exit(0);
        }
        double discount = getPrice() * percentage / 100;
        double newPrice = getPrice() - discount;
        setPrice(newPrice);
        System.out.println("Discount applied :" + discount);
        System.out.println("New Price :" + newPrice);
    }

    @Override
    public double calculateTax()
    {
        return getPrice() * 0.05;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nLicense Key: " + licenseKey;
    }
}

