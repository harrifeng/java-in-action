package org.hfeng.misc.concurrent.barrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        final Random random = new Random();

        final CyclicBarrier barrier = new CyclicBarrier(4, new Runnable() {
            public void run() {
                System.out.println("All people are here, go to lunch!");
            }
        });

        for (int i = 0; i < 4; i++) {
            exec.execute(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " is here");
                    try {
                        barrier.await(); // wait for others
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        exec.shutdown();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// pool-1-thread-2 is here                        //
// pool-1-thread-4 is here                        //
// pool-1-thread-1 is here                        //
// pool-1-thread-3 is here                        //
// All people are here, go to lunch!              //
////////////////////////////////////////////////////
