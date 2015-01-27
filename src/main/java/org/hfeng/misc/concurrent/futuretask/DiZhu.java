package org.hfeng.misc.concurrent.futuretask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class DiZhu {
    public static void main(String[] args) {
        Changgong worker = new Changgong();
        FutureTask<Integer> jiangong = new FutureTask<Integer>(worker);

        new Thread(jiangong).start();

        while (!jiangong.isDone()) {
            try {
                System.out.println("See if Changgong finised...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int amount;

        try {
            amount = jiangong.get();
            System.out.println("Job is done, number is " + amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
