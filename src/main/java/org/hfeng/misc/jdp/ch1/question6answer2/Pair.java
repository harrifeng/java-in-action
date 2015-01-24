package org.hfeng.misc.jdp.ch1.question6answer2;

public class Pair {
    private final Tool lefthand;
    private final Tool righthand;

    public Pair(Tool lefthand, Tool righthand) {
        this.lefthand = lefthand;
        this.righthand = righthand;
    }

    public String toString() {
        return "[" + lefthand + " and " + righthand + " ]";
    }
}
