package com.ankit.java.multithreding_concept.thread_group_class;



class IndianCricketTeam implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " ");
    }
}
class AustraliaCrickertTeam implements Runnable {
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name+" ");
    }
}
public class Ind_Vs_Aus_Series_Team {
    public static void main(String[] args) {
        ThreadGroup bcci = new ThreadGroup("Indian_Cricket_Team");
        System.out.println(""+bcci.getName());

        Thread p1 = new Thread(bcci ,new IndianCricketTeam(),"Rohit Sharma");
        p1.start();
        Thread p2 = new Thread(bcci ,new IndianCricketTeam(),"Shreyas Iyer (VC)");
        p2.start();
        Thread p3 = new Thread(bcci ,new IndianCricketTeam(),"Shubman Gill (C)");
        p3.start();
        Thread p4 = new Thread(bcci ,new IndianCricketTeam(),"Virat Kohli *");
        p4.start();
        Thread p5 = new Thread(bcci ,new IndianCricketTeam(),"Yashasvi Jaiswal");
        p5.start();
        Thread p6 = new Thread(bcci ,new IndianCricketTeam(),"Axal Patel");
        p6.start();
        Thread p7 = new Thread(bcci ,new IndianCricketTeam(),"Nitish Kumar Reddy");
        p7.start();
        Thread p8 = new Thread(bcci ,new IndianCricketTeam(),"Washington Sundar");
        p8.start();
        Thread p9 = new Thread(bcci ,new IndianCricketTeam(),"Dhruv Jurel (WK)");
        p9.start();
        Thread p10 = new Thread(bcci ,new IndianCricketTeam(),"KL Rahul (WK)");
        p10.start();
        Thread p11 = new Thread(bcci ,new IndianCricketTeam(),"Arshdeep Singh");
        p11.start();
        Thread p12 = new Thread(bcci ,new IndianCricketTeam(),"Harshit Rana");
        p12.start();
        Thread p13 = new Thread(bcci ,new IndianCricketTeam(),"Kuldeep Yadav");
        p13.start();
        Thread p14 = new Thread(bcci ,new IndianCricketTeam(),"Mohammed Siraj");
        p14.start();
        Thread p15 = new Thread(bcci ,new IndianCricketTeam(),"Prasidh Krishna");
        p15.start();


        ThreadGroup ca = new ThreadGroup("Australia_Cricket_Team");
        System.out.println(""+ca.getName());

        Thread aus1 = new Thread(ca , new AustraliaCrickertTeam() ,"Cameron Green");
        aus1.start();
        Thread aus2 = new Thread(ca , new AustraliaCrickertTeam() ,"Matt Renshaw");
        aus2.start();
        Thread aus3 = new Thread(ca , new AustraliaCrickertTeam() ,"Mitchell Marsh (C)");
        aus3.start();
        Thread aus4 = new Thread(ca , new AustraliaCrickertTeam() ,"Travis Head ");
        aus4.start();
        Thread aus5 = new Thread(ca , new AustraliaCrickertTeam() ,"Cooper Connolly");
        aus5.start();
        Thread aus6 = new Thread(ca , new AustraliaCrickertTeam() ,"Matt Short");
        aus6.start();
        Thread aus7 = new Thread(ca , new AustraliaCrickertTeam() ,"Mitchell Owen");
        aus7.start();
        Thread aus8 = new Thread(ca , new AustraliaCrickertTeam() ,"Alex Carey (WK)");
        aus8.start();
        Thread aus9 = new Thread(ca , new AustraliaCrickertTeam() ,"Josh Inglis (WK)");
        aus9.start();
        Thread aus10 = new Thread(ca , new AustraliaCrickertTeam() ,"Josh Philippe (WK)");
        aus10.start();
        Thread aus11 = new Thread(ca , new AustraliaCrickertTeam() ,"Adam Zampa");
        aus11.start();
        Thread aus12 = new Thread(ca , new AustraliaCrickertTeam() ,"Ben Dwarshuis");
        aus12.start();
        Thread aus13 = new Thread(ca , new AustraliaCrickertTeam() ,"Josh Hazlewood");
        aus13.start();
        Thread aus14 = new Thread(ca , new AustraliaCrickertTeam() ,"Matthew Kuhnemann");
        aus14.start();
        Thread aus15 = new Thread(ca , new AustraliaCrickertTeam() ,"Mitchell Starc");
        aus15.start();
        Thread aus16 = new Thread(ca , new AustraliaCrickertTeam() ,"Nathan Ellis");
        aus16.start();
        Thread aus17 = new Thread(ca , new AustraliaCrickertTeam() ,"Xavier Bartlett");
        aus17.start();

    }
}
