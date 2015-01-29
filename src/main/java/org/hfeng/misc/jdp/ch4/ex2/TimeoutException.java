package org.hfeng.misc.jdp.ch4.ex2;

public class TimeoutException extends InterruptedException {
    public TimeoutException(String msg) {
        super(msg);
    }
}
