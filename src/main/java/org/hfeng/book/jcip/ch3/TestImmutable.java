package org.hfeng.book.jcip.ch3;

import java.math.BigInteger;

public class TestImmutable {
    private static BigInteger[] bigIntegers = new BigInteger[] {BigInteger.ONE, BigInteger.TEN};
    private static OneValueCache oneValueCache = new OneValueCache(BigInteger.ONE, bigIntegers);

    private static class Thread1 extends Thread {
        @Override
        public void run() {
            System.out.println(oneValueCache.getLastFactors(BigInteger.ONE));
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread1().start();
        }
        System.out.println(oneValueCache.getLastFactors(BigInteger.ONE));
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// [Ljava.math.BigInteger;@ff5996                 //
// [Ljava.math.BigInteger;@52b16b                 //
// [Ljava.math.BigInteger;@fe268a                 //
// [Ljava.math.BigInteger;@a39c81                 //
// [Ljava.math.BigInteger;@178069d                //
// [Ljava.math.BigInteger;@a3bdc                  //
// [Ljava.math.BigInteger;@186a830                //
// [Ljava.math.BigInteger;@25c6e8                 //
// [Ljava.math.BigInteger;@25cc4c                 //
// [Ljava.math.BigInteger;@18797cf                //
// [Ljava.math.BigInteger;@ff99df                 //
////////////////////////////////////////////////////
