package org.hfeng.book.dpj.ch2.adapter.extend;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// (Hello)                                        //
// *Hello*                                        //
////////////////////////////////////////////////////
