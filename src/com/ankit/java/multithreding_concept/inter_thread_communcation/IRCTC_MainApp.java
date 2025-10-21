package com.ankit.java.multithreding_concept.inter_thread_communcation;

import java.util.Scanner;

class IRCTCBookingSystem {
    private int availableTicket = 10;
    private String[] waitingUser = new String[10];  // store waiting user names
    private int[] waitingTickets = new int[10];     // store waiting ticket count
    private int waitingCount = 0;                   // track how many are in waiting list

    // synchronized method for booking
    public synchronized void bookTicket(int numOfTicket, String userName) {
        if (numOfTicket <= availableTicket) {
            availableTicket -= numOfTicket;
            System.out.println(userName + " booked " + numOfTicket + " ticket(s). Available tickets -> " + availableTicket);
        } else {
            if (waitingCount < waitingUser.length) {
                waitingUser[waitingCount] = userName;
                waitingTickets[waitingCount] = numOfTicket;
                waitingCount++;
                System.out.println("Only " + availableTicket + " ticket(s) left. " + userName + " added to waiting list for " + numOfTicket + " ticket(s).");
            } else {
                System.out.println("Sorry " + userName + ", waiting list is full. No booking possible.");
            }
        }
    }

    // synchronized method for cancellation
    public synchronized void cancelTicket(int numOfTicket, String userName) {
        availableTicket += numOfTicket;
        System.out.println(userName + " cancelled " + numOfTicket + " ticket(s). Available tickets -> " + availableTicket);
        notifyWaitingUsers();
    }

    // confirm waiting users if enough tickets are available
    private void notifyWaitingUsers() {
        int i = 0;
        while (i < waitingCount && availableTicket > 0) {
            if (waitingTickets[i] <= availableTicket) {
                System.out.println("✅ " + waitingUser[i] + " from waiting list confirmed for " + waitingTickets[i] + " ticket(s).");
                availableTicket -= waitingTickets[i];

                // shift remaining waiting users forward
                for (int j = i; j < waitingCount - 1; j++) {
                    waitingUser[j] = waitingUser[j + 1];
                    waitingTickets[j] = waitingTickets[j + 1];
                }
                waitingCount--;
            } else {
                i++;
            }
        }
    }

    // refund remaining waiting users
    public void refundUnconfirmed() {
        if (waitingCount > 0) {
            System.out.println("\n--- Refund Process Initiated ---");
            for (int i = 0; i < waitingCount; i++) {
                System.out.println("❌ " + waitingUser[i] + " refunded for " + waitingTickets[i] + " unconfirmed ticket(s).");
            }
        } else {
            System.out.println("\nAll waiting users have been confirmed.");
        }
    }
}

public class IRCTC_MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IRCTCBookingSystem bookingSystem = new IRCTCBookingSystem();

        // Booking Phase
        Thread bookingThread = new Thread(() -> {
            System.out.println("===== Ticket Booking Phase =====");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter name of user " + i + ": ");
                String user = sc.next();
                System.out.print("Enter number of tickets to book for " + user + ": ");
                int num = sc.nextInt();
                bookingSystem.bookTicket(num, user);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });

        bookingThread.start();
        try { bookingThread.join(); } catch (InterruptedException e) {}

        // Cancellation Phase
        Thread cancellationThread = new Thread(() -> {
            System.out.println("\n===== Ticket Cancellation Phase =====");
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter name of user cancelling tickets: ");
                String user = sc.next();
                System.out.print("Enter number of tickets to cancel for " + user + ": ");
                int num = sc.nextInt();
                bookingSystem.cancelTicket(num, user);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }

            bookingSystem.refundUnconfirmed();
        });

        cancellationThread.start();
        try { cancellationThread.join(); } catch (InterruptedException e) {}

        sc.close();
        System.out.println("\n===== Process Completed =====");
    }
}
