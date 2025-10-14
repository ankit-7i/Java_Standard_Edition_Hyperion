package com.ankit.java.multithreding_concept.anonymous_inner_class_by_using_thread;

public class OlaRidingApp
{
    public static void main(String[] args)
    {
        // Anonymous Inner class
        Thread rideRequest = new Thread() {
            public void run() {
                System.out.println("User requested a ride...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Searching for nearby drivers...");
            }
        };

        Thread driverAssignment = new Thread() {
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Driver found and assigned!");
            }
        };

        Thread fareCalculation = new Thread() {
            public void run() {
                System.out.println("Calculating estimated fare...");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Estimated fare: 135.75 RS.");
            }
        };

        Thread liveTracking = new Thread() {
            public void run() {
                int[] progress = {20, 40, 60, 80, 100};
                for (int p : progress) {
                    System.out.println("Updating ride location... " + p + "% completed");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Ride completed!");
            }
        };

        Thread paymentProcessing = new Thread() {
            public void run() {
                System.out.println("Processing payment...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Payment successful!");
            }
        };

        Thread ratingSystem = new Thread() {
            public void run() {
                System.out.println("Requesting user rating...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("User rated the ride: 5 star");
            }
        };


        rideRequest.start();
        fareCalculation.start();


        try {
            rideRequest.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start remaining threads in sequence
        driverAssignment.start();
        try {
            driverAssignment.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        liveTracking.start();
        try {
            liveTracking.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        paymentProcessing.start();
        try {
            paymentProcessing.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ratingSystem.start();
    }
}
