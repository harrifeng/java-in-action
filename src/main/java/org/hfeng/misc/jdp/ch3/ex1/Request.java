package org.hfeng.misc.jdp.ch3.ex1;

public class Request {
    private final String name;
    public Request(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "[ Requst " + name + " ]";
    }
}
