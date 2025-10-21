package com.ankit.java.multithreding_concept.inter_thread_communcation;



import java.util.Scanner;

class Restaurant1 {
    private String name;
    private String order;
    private boolean isOrderReady = false;


    public Restaurant1(String name) {
        this.name = name;
    }

    public synchronized void placeOrder(String order) {
        this.order = order;
        System.out.println("Waiter: Placed order for " + order);

        while (!isOrderReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Waiter: Serving the " + order);
    }


    public synchronized void prepareOrder()
    {
        System.out.println("Chef: Preparing " + order);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        isOrderReady = true;
        System.out.println("Chef: " + order + " is ready!");
        notify();
    }

    public String getRestaurantName() {
        return name;
    }
}

class Waiter1 extends Thread {
    private Restaurant1 restaurant1;
    private String orderName;

    public Waiter1(Restaurant1 restaurant1) {
        this.restaurant1 = restaurant1;
    }

    public void acceptOrder(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public void run() {
        restaurant1.placeOrder(orderName);
    }


    public void giveBill() {
        System.out.println("Waiter: Here is your bill, please choose your payment method (Cash / Card / UPI).");
    }
}

class Chef1 extends Thread {
    private Restaurant1 restaurant1;

    public Chef1(Restaurant1 restaurant1) {
        this.restaurant1 = restaurant1;
    }

    @Override
    public void run() {
        restaurant1.prepareOrder();
    }
}


public class RestaurantSystem1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Restaurant1 	restaurant1= new Restaurant1("KFC");
        System.out.println("Welcome to " + restaurant1.getRestaurantName() + " Restaurant!!!");


        Waiter1 waiter = new Waiter1(restaurant1);
        Chef1 chef = new Chef1(restaurant1);


        System.out.print("Customer: I would like to order -> ");
        String foodItem = sc.nextLine();
        waiter.acceptOrder(foodItem);


        waiter.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chef.start();


        try {
            waiter.join();
            chef.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Customer eats food
        System.out.println("Customer: Enjoying the delicious " + foodItem + "...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Customer: Finished eating!");


        waiter.giveBill();
        System.out.print("Enter payment mode (Cash/Card/UPI): ");
        String paymentMode = sc.nextLine();

        switch (paymentMode.toLowerCase()) {
            case "cash":
                System.out.println("Customer: Paying the bill using Cash ");
                break;
            case "card":
                System.out.println("Customer: Paying the bill using Card ");
                break;
            case "upi":
                System.out.println("Customer: Paying the bill using UPI ");
                break;
            default:
                System.out.println("Invalid payment method! Defaulting to Cash ");
                break;
        }

        System.out.println("Waiter: Bill paid successfully ");
        System.out.println("Waiter: Thank you for coming! Visit again ");

        sc.close();
    }
}
