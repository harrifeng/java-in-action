package org.hfeng.misc.jdp.ch1.question1;


import org.apache.http.annotation.NotThreadSafe;

@NotThreadSafe
public class Gate {
    private int counter = 0;
    private String name= "Nobody";
    private String address = "Nowhere";

    public void pass(String name, String address) {
        this.counter++;
        this.name = name;
        this.address = address;
        //extend the Critical Section
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        check();
    }
    public String toString() {
        return "No." + counter + ": " + name + ", " + address;
    }

    private void check() {
        if (name.charAt(0) != address.charAt(0)) {
            System.out.println("****BROKEN****" + toString());
        }
    }
}
