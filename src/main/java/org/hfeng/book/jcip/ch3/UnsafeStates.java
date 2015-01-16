package org.hfeng.book.jcip.ch3;

public class UnsafeStates {
    public String[] getStates() {
        return states;
    }

    private String[] states = new String[] { "AA", "BB"};

    public static void main(String[] args) {
        UnsafeStates us = new UnsafeStates();
        System.out.println(us.getStates()[0]);
        us.getStates()[0] = new String("ZZ");
        System.out.println(us.getStates()[0]);
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// AA                                             //
// ZZ                                             //
////////////////////////////////////////////////////
