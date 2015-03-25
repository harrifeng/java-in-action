package org.hfeng.misc.hfdp.ch5.singleton.notthreadsafe;

public class BoilerRunnable implements Runnable {
    public void run() {
        try {
            ChocolateBoiler.getInstance().fill();
            ChocolateBoiler.getInstance().boil();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
