package org.hfeng.misc.jdp.ch4.ex2again;

public class TimeoutException extends InterruptedException {
    public TimeoutException(String msg) {
        super(msg);
    }
}
