package org.hfeng.misc.jdp.ch3.question5;

import org.hfeng.misc.jdp.ch3.ex1.Request;
import org.hfeng.misc.jdp.ch3.ex1.RequestQueue;

public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue1 = new RequestQueue();
        RequestQueue requestQueue2 = new RequestQueue();
        requestQueue1.putRequest(new Request("Hello"));
        new TalkThread(requestQueue1, requestQueue2, "Alice").start();
        new TalkThread(requestQueue2, requestQueue1, "Bobby").start();
    }
}
