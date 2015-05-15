package org.hfeng.misc.hfdp.ch11.proxy.monitor;

import java.io.Serializable;

public interface State extends Serializable{
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
