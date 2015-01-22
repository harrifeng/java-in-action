package org.hfeng.misc.jdp.ch1.question3;

public class PrintThread extends Thread {
    private Gate gate;
    public PrintThread(Gate gate) {
        this.gate = gate;
    }
    public void run() {

        while (true) {
            // May print inconsistent value, as toString is not synchronized
            System.out.println(gate.toString());
        }
    }
}
