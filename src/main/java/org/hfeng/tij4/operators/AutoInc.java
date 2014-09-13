package org.hfeng.tij4.operators;

public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i:" + i);
        System.out.println("++i:" + ++i);
        System.out.println("i++:" + i++);

        System.out.println("i:" + i);
        System.out.println("--i:" + --i);
        System.out.println("i--:" + i--);

        System.out.println("i:" + i);
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// i:1                                            //
// ++i:2                                          //
// i++:2                                          //
// i:3                                            //
// --i:2                                          //
// i--:2                                          //
// i:1                                            //
////////////////////////////////////////////////////
