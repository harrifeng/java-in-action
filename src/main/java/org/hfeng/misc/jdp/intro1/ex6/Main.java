package org.hfeng.misc.jdp.intro1.ex6;

public class Main {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////////////
        // Executing thread.run() doesn't create a new Thread(and thus calling stack) //
        // for the code to execute It just executes the code in the currentThread     //
        // from which the thread.run() code is invoked.                               //
        //                                                                            //
        // Executing thread.start() creates a new OS level thread(and calling stack)  //
        // wherein the run() method gets called.                                      //
        ////////////////////////////////////////////////////////////////////////////////
        new PrintThread("*").run();
        new PrintThread("+").run();
    }
}
