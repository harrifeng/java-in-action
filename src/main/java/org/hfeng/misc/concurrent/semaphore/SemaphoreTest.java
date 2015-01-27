package org.hfeng.misc.concurrent.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    private static final int THREAD_COUNT = 10;

    private static ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);

    private static Semaphore s = new Semaphore(3);

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            threadPool.execute(new Runnable() {
                public void run() {
                    try {
                        s.acquire();
                        System.out.println("Save data\n");
                        Thread.sleep(5000);
                        s.release();
                    } catch (InterruptedException e) {

                    }
                }
            });
        }
        threadPool.shutdown();
    }
}
