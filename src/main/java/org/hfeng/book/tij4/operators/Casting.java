package org.hfeng.book.tij4.operators;

public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long)i;
        lng = i;   // "widening", so cast not really required
        long lng2 = (long)200;
        lng2 = 200;
        // A "narrowing convrsion":
        i = (int)lng2; // Cast required
    }
}
