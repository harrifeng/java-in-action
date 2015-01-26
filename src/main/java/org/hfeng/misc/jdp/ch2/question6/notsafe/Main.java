package org.hfeng.misc.jdp.ch2.question6.notsafe;

public class Main {
    public static void main(String[] args) {
        MutablePerson mutablePerson = new MutablePerson("start", "start");

        new CrackerThread(mutablePerson).start();
        new CrackerThread(mutablePerson).start();
        new CrackerThread(mutablePerson).start();
        for (int i = 0; true; i++) {
            mutablePerson.setPerson("" + i, "" + i);
        }
    }
}


class CrackerThread extends Thread {
    private final MutablePerson mutable;

    public CrackerThread(MutablePerson mutablePerson) {
        this.mutable = mutablePerson;
    }

    public void run() {
        while (true) {
            ImmutablePerson immutablePerson = new ImmutablePerson(mutable);

            if (!immutablePerson.getName().equals(immutablePerson.getAddress())) {
                System.out.println(currentThread().getName() + " ***** BROKEN *******" + immutablePerson);
            }
        }
    }
}