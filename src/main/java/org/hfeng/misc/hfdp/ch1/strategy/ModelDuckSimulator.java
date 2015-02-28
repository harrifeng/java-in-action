package org.hfeng.misc.hfdp.ch1.strategy;

public class ModelDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// I can't fly!                                   //
// I'm flying with a rocket!                      //
////////////////////////////////////////////////////
