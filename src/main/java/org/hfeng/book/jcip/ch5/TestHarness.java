package org.hfeng.book.jcip.ch5;

import java.util.concurrent.CountDownLatch;

public class TestHarness {
    public long timeTasks(int nThreads, final Runnable task) throws InterruptedException{
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    try {
                        startGate.await();
                        try {
                            task.run();
                        }finally {
                            endGate.countDown();
                        }
                    } catch (InterruptedException ignored) {

                    }
                }
            };
            t.start();

        }

        long start = System.nanoTime();
        startGate.countDown();
        endGate.await();
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        System.out.println("Start!");
        TestHarness testHarness = new TestHarness();
        final int count = 10;
        try {
            long ii = testHarness.timeTasks(count, new TaskRunnable());
            System.out.println("Time (in nano second) is " + ii);
        } catch (InterruptedException e) {

        }

    }
}

class TaskRunnable implements Runnable {
    public void run() {
        System.out.println("In task!");
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Start!                                         //
// In task!                                       //
// In task!                                       //
// In task!                                       //
// In task!                                       //
// In task!                                       //
// In task!                                       //
// In task!                                       //
// In task!                                       //
// In task!                                       //
// In task!                                       //
// Time (in nano second) is 479000                //
////////////////////////////////////////////////////
