package com.java.streamapi.mcq;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(-1);
        al.add(-2);
        al.add(-5);
        al.add(0);
        al.add(1);
        al.add(2);
        List<Integer> list = al.stream().skip(1).filter(y->y<=0).peek(x->{}).toList();
        System.out.println(list);
    }
}