package com.ankit.java.multithreding_concept.inter_thread_communcation;


class TicketSystem {
    private int availableTicket = 5; // initial tickets

    public synchronized void bookTicket(int numOfTicket) {
        while(numOfTicket > availableTicket) {
            System.err.println("Not enough ticket, Waiting for cancellation");
            try {
                wait(); // wait until tickets become available
            } catch(InterruptedException e) {}
        }
        this.availableTicket -= numOfTicket;
        System.out.println("Booked " + numOfTicket + " ticket(s), Available ticket -> " + this.availableTicket);
    }

    public synchronized void cancelTicket(int numOfTicket) {
        this.availableTicket += numOfTicket;
        System.out.println("Cancelled " + numOfTicket + " ticket(s), Available ticket -> " + this.availableTicket);
        notify(); // notify waiting threads
    }
}

public class IRCTC_Logic_01 {


        public static void main(String[] args) {
            TicketSystem ticketSystem = new TicketSystem();

            Thread bookingThreads = new Thread() {
                public void run() {
                    int[] tickets = {2, 4, 4};
                    for(int ticket : tickets) {
                        ticketSystem.bookTicket(ticket);
                        try { Thread.sleep(1000); } catch (InterruptedException e) {}
                    }
                }
            };
            bookingThreads.start();

            Thread cancellationThreads = new Thread() {
                public void run() {
                    int[] tickets = {1, 3, 2};
                    for(int ticket : tickets) {
                        ticketSystem.cancelTicket(ticket);
                        try { Thread.sleep(1500); } catch (InterruptedException e) {}
                    }
                }
            };
            cancellationThreads.start();
        }
    }


