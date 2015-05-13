package org.hfeng.misc.hfdp.ch11.proxy.winner;

public class MainTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}

/////////////////////////////////////////////////////////////
// <===================POSSIBLE-OUTPUT===================> //
// Mighty Gumball, Inc.                                    //
// Java-enabled Standing Gumball Model #2004               //
// Inventory: 10 gumballs                                  //
// Machine is waiting for quarter                          //
//                                                         //
// You inserted a quarter                                  //
// You turned...                                           //
// YOU'RE A WINNER! You get two gumballs for your quarter  //
// A gumball comes rolling out the slot...                 //
// A gumball comes rolling out the slot...                 //
// You inserted a quarter                                  //
// You turned...                                           //
// A gumball comes rolling out the slot...                 //
/////////////////////////////////////////////////////////////
