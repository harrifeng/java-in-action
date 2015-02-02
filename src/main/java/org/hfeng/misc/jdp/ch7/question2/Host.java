package org.hfeng.misc.jdp.ch7.question2;

public class Host {
    private final Helper helper = new Helper();

    public void request(final int count, final char c) {
        System.out.println("   requst(" + count + ", " + c + "BEGIN");
        helper.handle(count, c);
        System.out.println("   requst(" + count + ", " + c + "END");
    }
}
