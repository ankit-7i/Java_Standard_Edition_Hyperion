package com.ankit.java.oops_concept.abstraction.simple_cake_project;

abstract class Cake
{

    private String shape;
    private String flavor;
    private int quantity;
    public static double price = 400;

    public Cake(String shape, String flavor, int quantity)
    {
        super();
        if (shape == null || shape.trim().isEmpty())
        {
            System.err.println("Error: Shape cannot be empty!");
            System.exit(0);
        }
        this.shape = shape;
        if (flavor == null || flavor.trim().isEmpty())
        {
            System.err.println("Error: Name cannot be empty!");
            System.exit(0);
        }
        this.flavor = flavor;
        if(quantity < 0)
        {
            System.err.println("Quantity can not be negative or order ");
            System.exit(0);
        }
        this.quantity = quantity;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String toString() {
        double totalPrice = quantity * price;
        return "A " + shape + " " + flavor + " Cake Of " + quantity + " KG is Ready @ Rs." + totalPrice;
    }
}



