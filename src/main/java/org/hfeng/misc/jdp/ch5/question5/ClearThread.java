package org.hfeng.misc.jdp.ch5.question5;

import org.hfeng.misc.jdp.ch3.ex1.ClientThread;

public class ClearThread extends Thread {
    private final Table table;

    public ClearThread(String name, Table table) {
        super(name);
        this.table = table;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                System.out.println("=======" + getName() + " clears=======");
                table.clear();
            }
        } catch (InterruptedException e) {

        }
    }
}
