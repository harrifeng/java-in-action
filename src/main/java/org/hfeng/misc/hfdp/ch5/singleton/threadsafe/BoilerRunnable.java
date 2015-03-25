package org.hfeng.misc.hfdp.ch5.singleton.threadsafe;

public class BoilerRunnable implements Runnable {
    public void run() {
        try {
            org.hfeng.misc.hfdp.ch5.singleton.threadsafe.ChocolateBoiler.getInstance().fill();
            ChocolateBoiler.getInstance().boil();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
