package org.hfeng.misc.jdp.ch3.question6;

public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        Thread alice = new ClientThread(requestQueue, "Alice", 3141592L);
        Thread bobby = new ServerThread(requestQueue, "Bobby", 6535897L);

        alice.start();
        bobby.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        // call interrupt method
        System.out.println("********* calling interrupt ************");
        alice.interrupt();
        bobby.interrupt();
    }
}
