package org.hfeng.misc.concurrent;

import java.util.HashMap;
import java.util.UUID;

public class TestHashMap {
    public static void main(String[] args) {
        final HashMap<String, String> map = new HashMap<String, String>(2);
        Thread t = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    new Thread(new Runnable() {
                        public void run() {
                            map.put(UUID.randomUUID().toString(), "");
                        }
                    }, "hfeng" + i).start();
                }
            }
        }, "hfeng");
        t.start();
    }
}
