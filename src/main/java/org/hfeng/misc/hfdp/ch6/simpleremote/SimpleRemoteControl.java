package org.hfeng.misc.hfdp.ch6.simpleremote;

public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(Command slot) {
        this.slot = slot;
    }

    public SimpleRemoteControl() {}

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void press() {
        slot.execute();
    }
}
