package org.hfeng.misc.hfdp.ch10.state.plain;

public class MainTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}

////////////////////////////////////////////////////////
// <===================OUTPUT===================>     //
// Mighty Gumball, Inc.                               //
// Java-enabled Standing Gumball Model #2004          //
// Inventory: 5 gumballs                              //
// Machine is waiting for quarter                     //
//                                                    //
// You inserted a quater                              //
// You turned...                                      //
// A gumball comes rolling out the slot               //
//                                                    //
// Mighty Gumball, Inc.                               //
// Java-enabled Standing Gumball Model #2004          //
// Inventory: 4 gumballs                              //
// Machine is waiting for quarter                     //
//                                                    //
// You inserted a quater                              //
// Quarter returned                                   //
// You turned but there's no quarter                  //
//                                                    //
// Mighty Gumball, Inc.                               //
// Java-enabled Standing Gumball Model #2004          //
// Inventory: 4 gumballs                              //
// Machine is waiting for quarter                     //
//                                                    //
// You inserted a quater                              //
// You turned...                                      //
// A gumball comes rolling out the slot               //
// You inserted a quater                              //
// You turned...                                      //
// A gumball comes rolling out the slot               //
// You haven't inserted a quarter                     //
//                                                    //
// Mighty Gumball, Inc.                               //
// Java-enabled Standing Gumball Model #2004          //
// Inventory: 2 gumballs                              //
// Machine is waiting for quarter                     //
//                                                    //
// You inserted a quater                              //
// You can't insert another quater                    //
// You turned...                                      //
// A gumball comes rolling out the slot               //
// You inserted a quater                              //
// You turned...                                      //
// A gumball comes rolling out the slot               //
// Oops, out of gumballs!                             //
// You can't insert a quater, the machine is sold out //
// You turned, but there are no gumballs              //
//                                                    //
// Mighty Gumball, Inc.                               //
// Java-enabled Standing Gumball Model #2004          //
// Inventory: 0 gumballs                              //
// Machine is sold out                                //
////////////////////////////////////////////////////////
