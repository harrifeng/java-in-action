package org.hfeng.misc.hfdp.ch11.proxy.winner;

public class MainTest {
    public static void main(String[] args) {
        int count = 0;
        if (args.length < 2) {
            System.out.println("Usage GumballMachine <Location> <Number>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(args[0], count);

        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// > java MainTest Seattle 112                    //
// Gumball Machine: Seattle                       //
// Current inventory: 112 gumballs                //
// Current state: waiting for quarter             //
////////////////////////////////////////////////////
