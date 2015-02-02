package org.hfeng.misc.jdp.ch7.ex1;

public class Host {
    private final Helper helper = new Helper();
    public void request(final int count, final char c) {
        System.out.println("   requst(" +  count + ", " + c + "BEGIN");
        new Thread() {
            @Override
            public void run() {
                helper.handle(count, c);
            }
        }.start();
        System.out.println("   requst(" +  count + ", " + c + "END");
    }
}
