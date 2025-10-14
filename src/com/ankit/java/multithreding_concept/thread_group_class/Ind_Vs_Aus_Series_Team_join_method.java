package com.ankit.java.multithreding_concept.thread_group_class;

class IndianCricketTeam1 implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " ");
    }
}

class AustraliaCricketTeam implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " ");
    }
}

public class Ind_Vs_Aus_Series_Team_join_method
{
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup bcci = new ThreadGroup("Indian_Cricket_Team");
        System.out.println(bcci.getName());

        // Indian team threads
        Thread[] indianTeam = {
                new Thread(bcci, new IndianCricketTeam(), "Rohit Sharma"),
                new Thread(bcci, new IndianCricketTeam(), "Shreyas Iyer (VC)"),
                new Thread(bcci, new IndianCricketTeam(), "Shubman Gill (C)"),
                new Thread(bcci, new IndianCricketTeam(), "Virat Kohli *"),
                new Thread(bcci, new IndianCricketTeam(), "Yashasvi Jaiswal"),
                new Thread(bcci, new IndianCricketTeam(), "Axal Patel"),
                new Thread(bcci, new IndianCricketTeam(), "Nitish Kumar Reddy"),
                new Thread(bcci, new IndianCricketTeam(), "Washington Sundar"),
                new Thread(bcci, new IndianCricketTeam(), "Dhruv Jurel (WK)"),
                new Thread(bcci, new IndianCricketTeam(), "KL Rahul (WK)"),
                new Thread(bcci, new IndianCricketTeam(), "Arshdeep Singh"),
                new Thread(bcci, new IndianCricketTeam(), "Harshit Rana"),
                new Thread(bcci, new IndianCricketTeam(), "Kuldeep Yadav"),
                new Thread(bcci, new IndianCricketTeam(), "Mohammed Siraj"),
                new Thread(bcci, new IndianCricketTeam(), "Prasidh Krishna")
        };

        // Start Indian team threads
        for (Thread t : indianTeam) t.start();

        // Wait for all Indian team threads to finish
        for (Thread t : indianTeam) t.join();

        // Australia team
        ThreadGroup ca = new ThreadGroup("Australia_Cricket_Team");
        System.out.println(ca.getName());

        Thread[] ausTeam = {
                new Thread(ca, new AustraliaCricketTeam(), "Cameron Green"),
                new Thread(ca, new AustraliaCricketTeam(), "Matt Renshaw"),
                new Thread(ca, new AustraliaCricketTeam(), "Mitchell Marsh (C)"),
                new Thread(ca, new AustraliaCricketTeam(), "Travis Head"),
                new Thread(ca, new AustraliaCricketTeam(), "Cooper Connolly"),
                new Thread(ca, new AustraliaCricketTeam(), "Matt Short"),
                new Thread(ca, new AustraliaCricketTeam(), "Mitchell Owen"),
                new Thread(ca, new AustraliaCricketTeam(), "Alex Carey (WK)"),
                new Thread(ca, new AustraliaCricketTeam(), "Josh Inglis (WK)"),
                new Thread(ca, new AustraliaCricketTeam(), "Josh Philippe (WK)"),
                new Thread(ca, new AustraliaCricketTeam(), "Adam Zampa"),
                new Thread(ca, new AustraliaCricketTeam(), "Ben Dwarshuis"),
                new Thread(ca, new AustraliaCricketTeam(), "Josh Hazlewood"),
                new Thread(ca, new AustraliaCricketTeam(), "Matthew Kuhnemann"),
                new Thread(ca, new AustraliaCricketTeam(), "Mitchell Starc"),
                new Thread(ca, new AustraliaCricketTeam(), "Nathan Ellis"),
                new Thread(ca, new AustraliaCricketTeam(), "Xavier Bartlett")
        };

        // Start Australia team threads
        for (Thread t : ausTeam) t.start();

        // Wait for all Australia team threads to finish
        for (Thread t : ausTeam) t.join();
    }
}

