package org.hfeng.misc.hfdp.ch11.proxy.winner;

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
