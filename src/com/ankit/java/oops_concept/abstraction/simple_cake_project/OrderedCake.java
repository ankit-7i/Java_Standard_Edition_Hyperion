package com.ankit.java.oops_concept.abstraction.simple_cake_project;

public class OrderedCake extends Cake {
    private String message;



    // no argument construtor
    public OrderedCake() {
        super("Round", "Vanila", 1);
        this.message = null;
    }

    // Param const for shape , flavor , quantity
    public OrderedCake(String shape, String flavor, int quantity) {
        super(shape, flavor, quantity);
        this.message = null;
    }

// param const for shape flavor , quantity , & msg

    public OrderedCake(String shape, String flavor, int quantity, String message) {
        super(shape, flavor, quantity);
        this.message = message;
    }







    @Override
    public String toString() {
        if(message !=null)
        {
            double totalPrice = getQuantity() * price;
            return "A " + getShape() + " " + getFlavor() + " Cake Of " + getQuantity() + "KG is Ready with " + message + " message @ Rs." + totalPrice;
        }
        else
        {
            return super.toString();
        }
    }






}
