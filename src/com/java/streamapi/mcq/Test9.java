package com.java.streamapi.mcq;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
        public static void main(String[] args) {
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(1);
            al.add(2);
            al.add(3);
            al.add(4);
            al.add(5);
            al.add(6);
            List<Integer> list = al.stream().limit(4).toList();
            System.out.println(list);
        }
    }


