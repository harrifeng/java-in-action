package org.hfeng.misc.hfdp.ch10.state.winner;

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
