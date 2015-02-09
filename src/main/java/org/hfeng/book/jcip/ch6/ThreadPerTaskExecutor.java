package org.hfeng.book.jcip.ch6;

import java.util.concurrent.Executor;

public class ThreadPerTaskExecutor implements Executor {
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}
