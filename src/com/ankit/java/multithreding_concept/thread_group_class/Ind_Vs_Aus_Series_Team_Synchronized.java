package com.ankit.java.multithreding_concept.thread_group_class;

class IndianCricketTeam3 implements Runnable {
    private static final Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " ");
        }
    }
}

class AustraliaCricketTeam3 implements Runnable {
    private static final Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " ");
        }
    }
}

public class Ind_Vs_Aus_Series_Team_Synchronized {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup bcci = new ThreadGroup("Indian_Cricket_Team");
        System.out.println(bcci.getName());

        Thread p1 = new Thread(bcci, new IndianCricketTeam(), "Rohit Sharma");
        Thread p2 = new Thread(bcci, new IndianCricketTeam(), "Shreyas Iyer (VC)");
        Thread p3 = new Thread(bcci, new IndianCricketTeam(), "Shubman Gill (C)");
        Thread p4 = new Thread(bcci, new IndianCricketTeam(), "Virat Kohli *");
        Thread p5 = new Thread(bcci, new IndianCricketTeam(), "Yashasvi Jaiswal");

        // Start Indian team
        p1.start(); p2.start(); p3.start(); p4.start(); p5.start();

        // Wait for all Indian team threads to finish
        p1.join(); p2.join(); p3.join(); p4.join(); p5.join();

        // Australia team
        ThreadGroup ca = new ThreadGroup("Australia_Cricket_Team");
        System.out.println(ca.getName());

        Thread aus1 = new Thread(ca, new AustraliaCricketTeam(), "Cameron Green");
        Thread aus2 = new Thread(ca, new AustraliaCricketTeam(), "Matt Renshaw");
        Thread aus3 = new Thread(ca, new AustraliaCricketTeam(), "Mitchell Marsh (C)");
        Thread aus4 = new Thread(ca, new AustraliaCricketTeam(), "Travis Head");
        Thread aus5 = new Thread(ca, new AustraliaCricketTeam(), "Cooper Connolly");

        // Start Australia team
        aus1.start(); aus2.start(); aus3.start(); aus4.start(); aus5.start();

        // Wait for all Australia team threads to finish
        aus1.join(); aus2.join(); aus3.join(); aus4.join(); aus5.join();
    }
}
