package org.hfeng.misc.hfdp.ch11.proxy.rmi;

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
