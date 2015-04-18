package org.hfeng.misc.hfdp.ch6.remotewithundo;

public interface Command {
    public void execute();
    public void undo();
}
