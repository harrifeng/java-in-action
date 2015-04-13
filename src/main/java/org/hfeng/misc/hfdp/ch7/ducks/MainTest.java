package org.hfeng.misc.hfdp.ch7.ducks;

public class MainTest {
    public static void main(String[] args) {
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Gobble gobble                                  //
// I'm flying a short distance                    //
// I'm flying a short distance                    //
// I'm flying a short distance                    //
// I'm flying a short distance                    //
// I'm flying a short distance                    //
////////////////////////////////////////////////////
