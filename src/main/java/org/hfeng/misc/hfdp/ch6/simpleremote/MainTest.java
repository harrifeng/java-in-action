package org.hfeng.misc.hfdp.ch6.simpleremote;

public class MainTest {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        SimpleRemoteControl SRLightOn = new SimpleRemoteControl();
        SRLightOn.setCommand(lightOnCommand);
        SRLightOn.press();

        SimpleRemoteControl SRLightOff = new SimpleRemoteControl();
        SRLightOff.setCommand(lightOffCommand);
        SRLightOff.press();

        //All other 6 ONs and 6 OFFs SimpleRemoteControl instances
        //list here ...
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Light On                                       //
// Light Off                                      //
////////////////////////////////////////////////////
