package com.ankit.java.multithreding_concept.thread_group_class;

import java.util.Random;

class AustraliaCrickertTeam implements Runnable {
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

public class AustraliaTeamScoreCard {
    public static void main(String[] args) {
        ThreadGroup ca = new ThreadGroup("Australia_Cricket_Team");
        System.out.println("Match: " + ca.getName() + " is batting!");

        AustraliaCrickertTeam aus1 = new AustraliaCrickertTeam();
        Thread t1 = new Thread(ca, aus1, "Cameron Green");
        t1.start();
        try { t1.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus2 = new AustraliaCrickertTeam();
        Thread t2 = new Thread(ca, aus2, "Matt Renshaw");
        t2.start();
        try { t2.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus3 = new AustraliaCrickertTeam();
        Thread t3 = new Thread(ca, aus3, "Mitchell Marsh (C)");
        t3.start();
        try { t3.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus4 = new AustraliaCrickertTeam();
        Thread t4 = new Thread(ca, aus4, "Travis Head");
        t4.start();
        try { t4.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus5 = new AustraliaCrickertTeam();
        Thread t5 = new Thread(ca, aus5, "Cooper Connolly");
        t5.start();
        try { t5.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus6 = new AustraliaCrickertTeam();
        Thread t6 = new Thread(ca, aus6, "Matt Short");
        t6.start();
        try { t6.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus7 = new AustraliaCrickertTeam();
        Thread t7 = new Thread(ca, aus7, "Mitchell Owen");
        t7.start();
        try { t7.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus8 = new AustraliaCrickertTeam();
        Thread t8 = new Thread(ca, aus8, "Alex Carey (WK)");
        t8.start();
        try { t8.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus9 = new AustraliaCrickertTeam();
        Thread t9 = new Thread(ca, aus9, "Josh Inglis (WK)");
        t9.start();
        try { t9.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus10 = new AustraliaCrickertTeam();
        Thread t10 = new Thread(ca, aus10, "Josh Philippe (WK)");
        t10.start();
        try { t10.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus11 = new AustraliaCrickertTeam();
        Thread t11 = new Thread(ca, aus11, "Adam Zampa");
        t11.start();
        try { t11.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus12 = new AustraliaCrickertTeam();
        Thread t12 = new Thread(ca, aus12, "Ben Dwarshuis");
        t12.start();
        try { t12.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus13 = new AustraliaCrickertTeam();
        Thread t13 = new Thread(ca, aus13, "Josh Hazlewood");
        t13.start();
        try { t13.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus14 = new AustraliaCrickertTeam();
        Thread t14 = new Thread(ca, aus14, "Matthew Kuhnemann");
        t14.start();
        try { t14.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus15 = new AustraliaCrickertTeam();
        Thread t15 = new Thread(ca, aus15, "Mitchell Starc");
        t15.start();
        try { t15.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus16 = new AustraliaCrickertTeam();
        Thread t16 = new Thread(ca, aus16, "Nathan Ellis");
        t16.start();
        try { t16.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        AustraliaCrickertTeam aus17 = new AustraliaCrickertTeam();
        Thread t17 = new Thread(ca, aus17, "Xavier Bartlett");
        t17.start();
        try { t17.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        int totalRuns = aus1.getPlayerRuns() + aus2.getPlayerRuns() + aus3.getPlayerRuns() +
                aus4.getPlayerRuns() + aus5.getPlayerRuns() + aus6.getPlayerRuns() +
                aus7.getPlayerRuns() + aus8.getPlayerRuns() + aus9.getPlayerRuns() +
                aus10.getPlayerRuns() + aus11.getPlayerRuns() ;
                //+ aus12.getPlayerRuns() +
                //aus13.getPlayerRuns() + aus14.getPlayerRuns() + aus15.getPlayerRuns() +
                //aus16.getPlayerRuns() + aus17.getPlayerRuns();

        System.out.println("\n--- Match Summary ---");
        System.out.println("Total runs scored by " + ca.getName() + ": " + totalRuns);
    }
}
