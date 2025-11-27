package com.java.streamapi.mcq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test21 {
    public static void main(String args[]) {
        List mylist = new ArrayList();
        int[] val = {15, 5565, 646, 233, 100};
        for (int element : val)
            mylist.add(new Integer(element));
        System.out.println(mylist);
        Iterator iterator = mylist.iterator();
        int i = mylist.size();  //i =
        while (iterator.hasNext()) {
            Integer element = (Integer) iterator.next();
            int value = element.intValue();
            i--;
            if ((value < 100) || mylist.get(i).equals(100))
                iterator.remove();
        }
        System.out.println(mylist);
    }
}
