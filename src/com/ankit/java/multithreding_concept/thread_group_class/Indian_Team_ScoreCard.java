package com.ankit.java.multithreding_concept.thread_group_class;

import java.util.Random;

class IndianCricketTeam4 implements Runnable {
    private int playerRuns;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        Random random = new Random();
        int delay = random.nextInt(3000) + 1000;
        playerRuns = random.nextInt(50);
        try {
            System.out.println(name + " is batting...");
            Thread.sleep(delay);
            System.out.println(name + " scored " + playerRuns + " runs!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getPlayerRuns() {
        return playerRuns;
    }
}

public class Indian_Team_ScoreCard {
    public static void main(String[] args) {
        ThreadGroup bcci = new ThreadGroup("Indian_Cricket_Team");
        System.out.println("Match: " + bcci.getName() + " is batting!");

        IndianCricketTeam4 p1 = new IndianCricketTeam4();
        Thread t1 = new Thread(bcci, p1, "Rohit Sharma");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e)
        { e.printStackTrace();
        }

        IndianCricketTeam4 p2 = new IndianCricketTeam4();
        Thread t2 = new Thread(bcci, p2, "Shreyas Iyer (VC)");
        t2.start();
        try { t2.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        IndianCricketTeam4 p3 = new IndianCricketTeam4();
        Thread t3 = new Thread(bcci, p3, "Shubman Gill (C)");
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e)
        { e.printStackTrace();
        }

        IndianCricketTeam4 p4 = new IndianCricketTeam4();
        Thread t4 = new Thread(bcci, p4, "Virat Kohli *");
        t4.start();
        try { t4.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        IndianCricketTeam4 p5 = new IndianCricketTeam4();
        Thread t5 = new Thread(bcci, p5, "Yashasvi Jaiswal");
        t5.start();
        try { t5.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        IndianCricketTeam4 p6 = new IndianCricketTeam4();
        Thread t6 = new Thread(bcci, p6, "Axar Patel");
        t6.start();
        try { t6.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        IndianCricketTeam4 p7 = new IndianCricketTeam4();
        Thread t7 = new Thread(bcci, p7, "Nitish Kumar Reddy");
        t7.start();
        try { t7.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        IndianCricketTeam4 p8 = new IndianCricketTeam4();
        Thread t8 = new Thread(bcci, p8, "Washington Sundar");
        t8.start();
        try { t8.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        IndianCricketTeam4 p9 = new IndianCricketTeam4();
        Thread t9 = new Thread(bcci, p9, "Dhruv Jurel (WK)");
        t9.start();
        try { t9.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        IndianCricketTeam4 p10 = new IndianCricketTeam4();
        Thread t10 = new Thread(bcci, p10, "KL Rahul (WK)");
        t10.start();
        try { t10.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        IndianCricketTeam4 p11 = new IndianCricketTeam4();
        Thread t11 = new Thread(bcci, p11, "Arshdeep Singh");
        t11.start();
        try { t11.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        IndianCricketTeam4 p12 = new IndianCricketTeam4();
        Thread t12 = new Thread(bcci, p12, "Harshit Rana");
        t12.start();
        try { t12.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        IndianCricketTeam4 p13 = new IndianCricketTeam4();
        Thread t13 = new Thread(bcci, p13, "Kuldeep Yadav");
        t13.start();
        try { t13.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        IndianCricketTeam4 p14 = new IndianCricketTeam4();
        Thread t14 = new Thread(bcci, p14, "Mohammed Siraj");
        t14.start();
        try {
            t14.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        IndianCricketTeam4 p15 = new IndianCricketTeam4();
        Thread t15 = new Thread(bcci, p15, "Prasidh Krishna");
        t15.start();
        try {
            t15.join();
        } catch (InterruptedException e)
        { e.printStackTrace();
        }

        int totalRuns = p1.getPlayerRuns() + p2.getPlayerRuns() + p3.getPlayerRuns() +
                p4.getPlayerRuns() + p5.getPlayerRuns() + p6.getPlayerRuns() +
                p7.getPlayerRuns() + p8.getPlayerRuns() + p9.getPlayerRuns() +
                p10.getPlayerRuns() + p11.getPlayerRuns() ;
                //+ p12.getPlayerRuns() +
               // p13.getPlayerRuns() + p14.getPlayerRuns() + p15.getPlayerRuns();

        System.out.println("\n--- Match Summary ---");
        System.out.println("Total runs scored by " + bcci.getName() + ": " + totalRuns);
    }
}
