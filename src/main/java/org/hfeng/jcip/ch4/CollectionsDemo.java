package org.hfeng.jcip.ch4;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        // create a synchronized list
        List<String> synlist = Collections.synchronizedList(list);

        System.out.println("SynChronized list is " + synlist);
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// SynChronized list is [1, 2, 3, 4, 5]           //
////////////////////////////////////////////////////
