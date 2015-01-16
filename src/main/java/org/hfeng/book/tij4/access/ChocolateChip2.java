package org.hfeng.book.tij4.access;

import org.hfeng.book.tij4.access.cookie2.Cookie;

public class ChocolateChip2 extends Cookie {
    public ChocolateChip2() {
        System.out.println("ChocolateChip2 ctor");
    }

    public void chomp() {
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Cookie ctor                                    //
// ChocolateChip2 ctor                            //
// bite                                           //
////////////////////////////////////////////////////
