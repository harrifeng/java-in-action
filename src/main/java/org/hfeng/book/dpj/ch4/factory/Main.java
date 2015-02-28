package org.hfeng.book.dpj.ch4.factory;

import org.hfeng.book.dpj.ch4.factory.framework.Factory;
import org.hfeng.book.dpj.ch4.factory.framework.Product;
import org.hfeng.book.dpj.ch4.factory.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Anna");
        Product card2 = factory.create("Bell");
        Product card3 = factory.create("Carlos");
        card1.use();
        card2.use();
        card3.use();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Created Anna's card                            //
// Created Bell's card                            //
// Created Carlos's card                          //
// Use Anna's card                                //
// Use Bell's card                                //
// Use Carlos's card                              //
////////////////////////////////////////////////////
