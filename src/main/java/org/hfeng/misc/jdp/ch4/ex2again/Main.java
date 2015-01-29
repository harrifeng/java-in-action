package org.hfeng.misc.jdp.ch4.ex2again;

public class Main {
    public static void main(String[] args) {
        Host host = new Host(10000);

        new EnableThread("Enable Thread instance", host).start();
        try {
            System.out.println("execute BEGIN");
            host.execute();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class EnableThread extends Thread {
    private Host host;

    public EnableThread(String name, Host host) {
        super(name);
        this.host = host;
    }

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(3000);
            host.setExecutable(true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
