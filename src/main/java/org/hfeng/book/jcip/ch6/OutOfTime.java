package org.hfeng.book.jcip.ch6;

import java.util.Timer;
import java.util.TimerTask;
import static java.util.concurrent.TimeUnit.SECONDS;

public class OutOfTime {
    public static void main(String[] args) throws Exception{
        Timer timer = new Timer();
        timer.schedule(new ThrowTask(), 1);
        SECONDS.sleep(1);
        timer.schedule(new ThrowTask(), 1);
        SECONDS.sleep(5);
    }

    static class ThrowTask extends TimerTask {
        public void run() {
            throw new RuntimeException();
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                                                  //
// Exception in thread "Timer-0" java.lang.RuntimeException                                        //
// 	at org.hfeng.book.jcip.ch6.OutOfTime$ThrowTask.run(OutOfTime.java:18)                          //
// 	at java.util.TimerThread.mainLoop(Timer.java:555)                                              //
// 	at java.util.TimerThread.run(Timer.java:505)                                                   //
// Exception in thread "main" java.lang.IllegalStateException: Timer already cancelled.            //
// 	at java.util.Timer.sched(Timer.java:397)                                                       //
// 	at java.util.Timer.schedule(Timer.java:193)                                                    //
// 	at org.hfeng.book.jcip.ch6.OutOfTime.main(OutOfTime.java:12)                                   //
// 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)                                 //
// 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)               //
// 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)       //
// 	at java.lang.reflect.Method.invoke(Method.java:606)                                            //
// 	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:134)                        //
/////////////////////////////////////////////////////////////////////////////////////////////////////
