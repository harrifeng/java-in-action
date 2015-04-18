package org.hfeng.misc.hfdp.ch6.remotewithundo;

public class MainTest {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControlWithUndo.setCommand(0, lightOnCommand, lightOffCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.undoButtonWasPushed();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Light On                                       //
// Light Off                                      //
// Light On                                       //
////////////////////////////////////////////////////
