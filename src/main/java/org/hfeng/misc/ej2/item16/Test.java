package org.hfeng.misc.ej2.item16;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println(s.getAddCount());
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// 6                                              //
////////////////////////////////////////////////////
