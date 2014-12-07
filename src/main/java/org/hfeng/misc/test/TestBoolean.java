package org.hfeng.misc.test;

import org.hfeng.tij4.util.CountingGenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestBoolean {
    public static void main(String[] args) {
        Boolean b1 = new Boolean("True");
        Boolean b2 = Boolean.valueOf("true");

        System.out.println(b1);
        System.out.println(b2);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(1, 11);
        m.put(2, 22);
        m.put(10, 110);
        Set<Integer> s = m.keySet();
        System.out.println(s);

    }
}
