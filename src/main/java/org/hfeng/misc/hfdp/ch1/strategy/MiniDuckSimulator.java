package org.hfeng.misc.hfdp.ch1.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Fly with Wings                                 //
// Quack normally                                 //
////////////////////////////////////////////////////
