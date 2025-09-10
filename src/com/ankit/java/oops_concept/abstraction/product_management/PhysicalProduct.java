package com.ankit.java.oops_concept.abstraction.product_management;

public class PhysicalProduct extends Product
{
    private double shippingWeight;




    public PhysicalProduct(String name, double price, String category, double shippingWeight) {
        super(name, price, category);
        this.shippingWeight = shippingWeight;
    }

    public void setShippingWeight(double shippingWeight)
    {
        if (shippingWeight < 0) {
            System.err.println("Shipping weight cannot be negative.");
            System.exit(0);
        }
        this.shippingWeight = shippingWeight;
    }

    public double getShippingWeight() {
        return shippingWeight;
    }

    @Override
    public void applyDiscount(double percentage)
    {
        if (percentage < 0 || percentage > 100) {
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
        return getPrice() * 0.08;
    }

    public double calculateShippingCost()
    {
        return shippingWeight * 5;
    }

    @Override
    public String toString() {
        return super.toString() + "\nShipping Weight: " + shippingWeight + " kg";
    }
}
