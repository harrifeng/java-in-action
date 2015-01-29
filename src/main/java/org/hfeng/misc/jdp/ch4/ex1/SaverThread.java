package org.hfeng.misc.jdp.ch4.ex1;

import java.io.IOException;

public class SaverThread extends Thread {
    private Data data;
    public SaverThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    public void run() {
        try {
            while (true) {
                // Save automatically every one second in Microsoft Word
                data.save();
                Thread.sleep(1000);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
