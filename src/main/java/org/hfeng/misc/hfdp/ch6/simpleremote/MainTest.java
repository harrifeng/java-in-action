package org.hfeng.misc.hfdp.ch6.simpleremote;

public class MainTest {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.press();

        simpleRemoteControl.setCommand(lightOffCommand);
        simpleRemoteControl.press();
    }
}
